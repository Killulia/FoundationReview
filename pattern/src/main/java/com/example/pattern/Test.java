package com.example.pattern;

import com.example.pattern.builder.BuildA;
import com.example.pattern.factory.BenzFactory;
import com.example.pattern.proxy.Apple;
import com.example.pattern.proxy.Person;
import com.example.pattern.proxy.ProxyHandler;
import com.example.pattern.proxy.Sony;
import com.example.pattern.proxy.SonyProxy;
import com.example.pattern.singleInstance.Singleton;
import com.google.gson.Gson;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
//    public class Apples {
//        String color;
//        int weight;
//
//        Apples(String color, int weight) {
//            super();
//            this.color = color;
//            this.weight = weight;
//        }
//
//        @Override
//        public String toString() {
//            return "Apples{" +
//                    "颜'" + color + '\'' +
//                    ", 重：" + weight +
//                    '}';
//        }
//
//    }

    public static void main(String[] args) {
//        proxy();
        List<BzdzFo.ReturnDataBean> list = new ArrayList<>();
        Gson gson = new Gson();
        BzdzFo BzdzFo =gson.fromJson(Api.strP,BzdzFo.class);
        list = BzdzFo.getReturnData();
        System.out.println(list.size());

            //按颜色分组
            Map<String,List<com.example.pattern.BzdzFo.ReturnDataBean>> byColorList = list.stream().
                    collect(Collectors.groupingBy(com.example.pattern.BzdzFo.ReturnDataBean::getDymc));
        System.out.println(byColorList);
        //Map<String,Map<String,List<com.example.pattern.BzdzFo.ReturnDataBean>>> stringMapMap =
        //printList(byColorList);
        Map<String,List<com.example.pattern.BzdzFo.ReturnDataBean>> stringListMaps = null;
        for (String key: byColorList.keySet()){
            List<com.example.pattern.BzdzFo.ReturnDataBean> returnDataBeans = byColorList.get(key);
            Map<String,List<com.example.pattern.BzdzFo.ReturnDataBean>> stringListMap =
                    returnDataBeans.stream().collect(Collectors.groupingBy(com.example.pattern.BzdzFo.ReturnDataBean::getCs));
            System.out.println("层数：" + stringListMap);
            for(String keys: stringListMap.keySet()){
                List<com.example.pattern.BzdzFo.ReturnDataBean> returnDataBeanss = stringListMap.get(keys);
                stringListMaps =
                        returnDataBeanss.stream().collect(Collectors.groupingBy(com.example.pattern.BzdzFo.ReturnDataBean::getFjxh));
                System.out.println("房间：" + stringListMaps);

            }

        }


    }
    private static void printList(List<List<BzdzFo.ReturnDataBean>> byColorList) {
        System.out.println("分组后："+byColorList.toString());
    }

    /*
    代理
     */
    private static void proxy() {
        //静态代理
        Person person = new Person();
        SonyProxy sonyProxy = new SonyProxy(person);
//        sonyProxy.buySony();

        //动态代理(为实现了SONY和Apple的类进行代理即Person)
        ProxyHandler proxyHandler = new ProxyHandler(person);
        Sony sony = (Sony) Proxy.newProxyInstance(person.getClass().getClassLoader(), new Class[]{Sony.class}, proxyHandler);
        sony.buySony();
        Apple apple = (Apple) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Apple.class}, proxyHandler);
        apple.buyApple();

    }

    /*
    工厂
     */
    private static void factory() {
        //简单工厂
//        Car car = CarFactory.produce("Benz");
//        car.run();
        //正常工厂
        BenzFactory benzFactory = new BenzFactory();
        benzFactory.produce().run();
    }

    /*
     建造者
     */
    private static void builder() {
        BuildA buildA = new BuildA.Builder(1, "king").build();
        BuildA buildA1 = new BuildA.Builder()
                .setId(2)
                .setName("ramble")
                .setAddress("ccg")
                .build();
    }

    /*
    单例
     */
    private static void singleInstance() {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    private static <T> List<List<T>> byColorGroupApple(Collection<T> data, Comparator<? super T> c) {//方法上使用泛型 记得在返回值前加<T>
        List<List<T>> result = new ArrayList<>();
        for (T t : data) {//1.循环取出集合中的每个元素
            boolean isSameGroup = false;//2.标志为不是同组
            for (List<T> aResult : result) {//4.循环查找当前元素是否属于某个已创建的组
                if (c.compare(t, aResult.get(0)) == 0) {//aResult.get(0)表示：只要当前元素和某个组的第一个元素通过比较器比较相等则属于该组
                    isSameGroup = true;//5.查询到当前元素属于某个组则设置标志位，不让其创键新组
                    aResult.add(t);//6.把当前元素添加到当前组
                    break;
                }
            }
            if (!isSameGroup) {//3.不属于任何组的则创建一个新组，并把元素添加到该组
                // 创建
                List<T> innerList = new ArrayList();
                innerList.add(t);
                result.add(innerList);
            }
        }
        return result;
    }

}
