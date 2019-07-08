package com.example.foundationreview.util;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.util.LinkedHashMap;

/**
 * Created by try on 2018/3/7.
 */

public class CodeIdUtils {

    private static String year = "";
    private static String month = "";
    private static String day = "";
    private static String hour = "";
    private static String minute = "";
    private static final String YEAR = "年";
    private static final String MONTH = "月";
    private static final String DAY = "日";
    public static LinkedHashMap<String, String> map_p;
    public static LinkedHashMap<String, String> map_c;
    public static LinkedHashMap<String, String> map_t;

    public static String string2DateString(String date) {
        if (date != null) {
            year = date.substring(0, 4);
            month = date.substring(4, 6);
            day = date.substring(6, 8);
            hour = date.substring(8, 10);
            minute = date.substring(10, 12);
            return year + YEAR + month + MONTH + day + DAY + " " + hour + ":" + minute;
        } else {
            return "";
        }


    }

    public static String string2SimpleString(String date) {
        if (date != null) {
            String[] dateArray = date.split("-");
            year = dateArray[0];
            month = dateArray[1];
            day = dateArray[2].trim();
            for (int i = 0; i < dateArray.length; i++) {
                Log.d("ccg", "time :" + dateArray[i]);
            }
            return year + YEAR + month + MONTH + day + DAY;
        } else {
            return "";
        }


    }

    public static String qdzrsString(String date) {
        if (date != null) {
            String[] dateArray = date.trim().split("-");
            year = dateArray[0];
            month = dateArray[1];
            day = dateArray[2].trim();
            for (int i = 0; i < dateArray.length; i++) {
                Log.d("ccg", "time :" + dateArray[i]);
            }
            return year + "-" + month + "-" + day;
        } else {
            return "";
        }


    }



    public static String string2BirthString(String date) {
        if (date != null && date.trim().length()>=8) {
            year = date.trim().substring(0, 4);
            month = date.trim().substring(4, 6);
            day = date.trim().substring(6, 8);
            return year + YEAR + month + MONTH + day + DAY;
        }else if (date != null && date.trim().length()==6){
            year = date.trim().substring(0, 4);
            month = date.trim().substring(4, 6);
            return year + YEAR + month + MONTH;
        }else if (date != null && date.trim().length()==4){
            year = date.trim().substring(0, 4);
            return year + YEAR;
        }
        else {
            return "";
        }
    }

    public static String string2SepString(String date) {
        if (date != null) {
            year = date.substring(0, 4);
            month = date.substring(4, 6);
            day = date.substring(6, 8);
            return year + "-" + month + "-" + day;
        } else {
            return "";
        }


    }

    public static String getChineseAsCodeId(Context mContext, String tableName, String codeId) {
        if (tableName != null && codeId != null) {
            String sql = "select CD_ID,CD_NAME from " + tableName
                    + " where CD_AVAILABILITY='1' order by CD_INDEX";
            SqliteCodeTable helper = SqliteCodeTable.getInstance(mContext);
            Cursor c = helper.Query(sql, null);
            int l = c.getCount();
            LinkedHashMap<String, String> linkedMap = null;
            if (l > 0) {
                linkedMap = new LinkedHashMap<String, String>();
                while (c.moveToNext()) {
                    linkedMap.put(c.getString(0),
                            c.getString(1));
                }
            }
            c.close();
            helper.close();
            return linkedMap.get(codeId.trim());
        } else {
            return "";
        }

    }

    /**
     * 获取所属辖区
     * @param mContext
     * @param codeId
     * @return
     */
    public static String getAreaAsCodeId(Context mContext, String codeId) {
        String result = "";
        if (codeId != null) {
            String sql = "select FWZXZQHB_MC from typt_fwzgfgl_fwzxzqhb where FWZXZQHB_BH = '"+codeId+"'" ;
            SqliteCodeTable helper = SqliteCodeTable.getInstance(mContext);
            Cursor c = helper.Query(sql, null);
            int l = c.getCount();
            LinkedHashMap<String, String> linkedMap = null;
            if (l > 0) {
                while (c.moveToNext()) {

                    result = c.getString(c.getColumnIndex("FWZXZQHB_MC"));
                }
            }
            c.close();
            helper.close();
            return result;
        }
        return result;

    }



    /**
     * 初始化省级数据
     *
     */
    public static String getProvinces(Context context, String codeId) {
        if (codeId != null) {
            String provinceSub = codeId.substring(0, 2);
            String province = provinceSub + "0000000000";
            String sql = "select cd_id,cd_name from cdg_regioncode where CD_AVAILABILITY='1' and cd_id = " + province +
                    " order by cd_index ";
            SqliteCodeTable helper = SqliteCodeTable.getInstance(context);
            Cursor c = helper.Query(sql, null);
            int l = c.getCount();
            LinkedHashMap<String, String> linkedMap = new LinkedHashMap<String, String>();
            if (l > 0) {
                while (c.moveToNext()) {
                    linkedMap.put(c.getString(0),
                            c.getString(1));
                }
            }else {
                c.close();
                helper.close();
                return "";
            }
            c.close();
            helper.close();
            return linkedMap.get(province);
        }
        return "";


    }

    /**
     * 初始化市级数据
     *
     * @return
     * @!注意直辖市为前三位是市级，后三位为区县，再后三位为办事处，普通省为前俩位为省级，后两位为市级，再后两位为县级!
     */
    public static String getCities(Context context, String cd_id) {
        if (cd_id != null) {
            if ("".equals(cd_id)) {
                return "";
            }
            if (cd_id.substring(2,12).equals("0000000000")){
                return "";
            }
            String province = cd_id.substring(0, 2);
            String city = cd_id.substring(0, 4) + "00000000";
            if ("11".equals(province) || "12".equals(province) || "31".equals(province)
                    || "50".equals(province)) {
                city = cd_id.substring(0, 6) + "000000";
            }
            Log.d("code：", city);
            String sql = "select cd_id,cd_name from cdg_regioncode where CD_AVAILABILITY='1' and cd_id = " + city +
                    " order by cd_index ";

            SqliteCodeTable helper = SqliteCodeTable.getInstance(context);
            Cursor c = helper.Query(sql, null);

            int l = c.getCount();
            LinkedHashMap<String, String> linkedMap = new LinkedHashMap<String, String>();
            if (l > 0) {
                while (c.moveToNext()) {
                    linkedMap.put(c.getString(0),
                            c.getString(1));
                }
            }else {
                c.close();
                helper.close();
                return "";
            }
            c.close();
            helper.close();
            return linkedMap.get(city);
        }
        return "";

    }

    /**
     * 初始化县级数据
     *
     * @return
     */
    public static String getTowns(Context context, String cd_id) {

        if ("".equals(cd_id)) {
            return "";
        }
        if (cd_id.substring(2,12).equals("0000000000")){
            return "";
        }
        String province = cd_id.substring(0, 2);
        if ("11".equals(province) || "12".equals(province) || "31".equals(province)
                || "50".equals(province)) {

            return "";

        }else {
            String sql = "select cd_id,cd_name from cdg_regioncode where CD_AVAILABILITY='1' and cd_id = " + cd_id +
                    " order by cd_index ";
            SqliteCodeTable helper = SqliteCodeTable.getInstance(context);
            Cursor c = helper.Query(sql, null);

            int l = c.getCount();
            LinkedHashMap<String, String> linkedMap = new LinkedHashMap<String, String>();
            if (l > 0) {
                while (c.moveToNext()) {
                    linkedMap.put(c.getString(0),
                            c.getString(1));
                }
            }else {
                c.close();
                helper.close();
                return "";
            }
            c.close();
            helper.close();
            return linkedMap.get(cd_id);
        }
    }

    public static String getXzqh(Context context, String codeId) {
        StringBuilder stringBuilder = new StringBuilder();
        String province = getProvinces(context, codeId)+"";
        String city = getCities(context, codeId)+"";
        String county = getTowns(context, codeId);
        return stringBuilder.append(province).append(city).append(county).toString();
    }

}
