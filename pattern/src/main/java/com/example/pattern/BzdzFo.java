package com.example.pattern;

import java.util.List;

public class BzdzFo {

    /**
     * returnCode : 200
     * returnMsg : 单元房间查询成功
     * returnData : [{"dzbm":"1101010102000_0001_00_00_0078_0010_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0010_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"10单元","dys":null,"dyxh":"0010","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0011_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"11单元","dys":null,"dyxh":"0011","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0001_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"1单元","dys":null,"dyxh":"0001","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0002_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"2单元","dys":null,"dyxh":"0002","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0003_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"3单元","dys":null,"dyxh":"0003","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0004_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"4单元","dys":null,"dyxh":"0004","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0005_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"5单元","dys":null,"dyxh":"0005","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0006_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"6单元","dys":null,"dyxh":"0006","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0007_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"7单元","dys":null,"dyxh":"0007","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0008_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"8单元","dys":null,"dyxh":"0008","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0002_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"1","cxh":null,"fjmc":"101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0002_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"1","cxh":null,"fjmc":"102号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0003_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"2","cxh":null,"fjmc":"201号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0003_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"2","cxh":null,"fjmc":"202号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0004_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"3","cxh":null,"fjmc":"301号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0004_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"3","cxh":null,"fjmc":"302号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0005_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"4","cxh":null,"fjmc":"401号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0005_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"4","cxh":null,"fjmc":"402号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0006_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"5","cxh":null,"fjmc":"501号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0006_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"5","cxh":null,"fjmc":"502号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0007_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"6","cxh":null,"fjmc":"601号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0007_0002","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"6","cxh":null,"fjmc":"602号","hs":null,"fjxh":"0002","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null},{"dzbm":"1101010102000_0001_00_00_0078_0009_0001_0001","sqcmc":null,"sqcbm":null,"pcsmc":null,"pcsbm":null,"jlxmc":null,"jlxxh":null,"jzwdl":"00","jzwxl":"01","xqmc":null,"xqxh":null,"mlpmc":null,"mlpxh":null,"dymc":"9单元","dys":null,"dyxh":"0009","cs":"-1","cxh":null,"fjmc":"B101号","hs":null,"fjxh":"0001","jd":null,"wd":null,"dzbm_old":null,"cjsj":null,"whsj":null,"cjr":null,"cjdw":null,"jdbm":null,"jdmc":null}]
     * pageCount : null
     * rowsCount : null
     * startNum : null
     */

    private int returnCode;
    private String returnMsg;
    private String pageCount;
    private String rowsCount;
    private String startNum;
    private List<ReturnDataBean> returnData;

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Object getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public Object getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(String rowsCount) {
        this.rowsCount = rowsCount;
    }

    public Object getStartNum() {
        return startNum;
    }

    public void setStartNum(String startNum) {
        this.startNum = startNum;
    }

    public List<ReturnDataBean> getReturnData() {
        return returnData;
    }

    public void setReturnData(List<ReturnDataBean> returnData) {
        this.returnData = returnData;
    }

    public static class ReturnDataBean {
        /**
         * dzbm : 1101010102000_0001_00_00_0078_0010_0002_0001
         * sqcmc : null
         * sqcbm : null
         * pcsmc : null
         * pcsbm : null
         * jlxmc : null
         * jlxxh : null
         * jzwdl : 00
         * jzwxl : 01
         * xqmc : null
         * xqxh : null
         * mlpmc : null
         * mlpxh : null
         * dymc : 10单元
         * dys : null
         * dyxh : 0010
         * cs : 1
         * cxh : null
         * fjmc : 101号
         * hs : null
         * fjxh : 0001
         * jd : null
         * wd : null
         * dzbm_old : null
         * cjsj : null
         * whsj : null
         * cjr : null
         * cjdw : null
         * jdbm : null
         * jdmc : null
         */

        private String dzbm;
        private Object sqcmc;
        private Object sqcbm;
        private Object pcsmc;
        private Object pcsbm;
        private Object jlxmc;
        private Object jlxxh;
        private String jzwdl;
        private String jzwxl;
        private Object xqmc;
        private Object xqxh;
        private Object mlpmc;
        private Object mlpxh;
        private String dymc;
        private Object dys;
        private String dyxh;
        private String cs;
        private Object cxh;
        private String fjmc;
        private Object hs;
        private String fjxh;
        private Object jd;
        private Object wd;
        private Object dzbm_old;
        private Object cjsj;
        private Object whsj;
        private Object cjr;
        private Object cjdw;
        private Object jdbm;
        private Object jdmc;

        public String getDzbm() {
            return dzbm;
        }

        public void setDzbm(String dzbm) {
            this.dzbm = dzbm;
        }

        public Object getSqcmc() {
            return sqcmc;
        }

        public void setSqcmc(Object sqcmc) {
            this.sqcmc = sqcmc;
        }

        public Object getSqcbm() {
            return sqcbm;
        }

        public void setSqcbm(Object sqcbm) {
            this.sqcbm = sqcbm;
        }

        public Object getPcsmc() {
            return pcsmc;
        }

        public void setPcsmc(Object pcsmc) {
            this.pcsmc = pcsmc;
        }

        public Object getPcsbm() {
            return pcsbm;
        }

        public void setPcsbm(Object pcsbm) {
            this.pcsbm = pcsbm;
        }

        public Object getJlxmc() {
            return jlxmc;
        }

        public void setJlxmc(Object jlxmc) {
            this.jlxmc = jlxmc;
        }

        public Object getJlxxh() {
            return jlxxh;
        }

        public void setJlxxh(Object jlxxh) {
            this.jlxxh = jlxxh;
        }

        public String getJzwdl() {
            return jzwdl;
        }

        public void setJzwdl(String jzwdl) {
            this.jzwdl = jzwdl;
        }

        public String getJzwxl() {
            return jzwxl;
        }

        public void setJzwxl(String jzwxl) {
            this.jzwxl = jzwxl;
        }

        public Object getXqmc() {
            return xqmc;
        }

        public void setXqmc(Object xqmc) {
            this.xqmc = xqmc;
        }

        public Object getXqxh() {
            return xqxh;
        }

        public void setXqxh(Object xqxh) {
            this.xqxh = xqxh;
        }

        public Object getMlpmc() {
            return mlpmc;
        }

        public void setMlpmc(Object mlpmc) {
            this.mlpmc = mlpmc;
        }

        public Object getMlpxh() {
            return mlpxh;
        }

        public void setMlpxh(Object mlpxh) {
            this.mlpxh = mlpxh;
        }

        public String getDymc() {
            return dymc;
        }

        public void setDymc(String dymc) {
            this.dymc = dymc;
        }

        public Object getDys() {
            return dys;
        }

        public void setDys(Object dys) {
            this.dys = dys;
        }

        public String getDyxh() {
            return dyxh;
        }

        public void setDyxh(String dyxh) {
            this.dyxh = dyxh;
        }

        public String getCs() {
            return cs;
        }

        public void setCs(String cs) {
            this.cs = cs;
        }

        public Object getCxh() {
            return cxh;
        }

        public void setCxh(Object cxh) {
            this.cxh = cxh;
        }

        public String getFjmc() {
            return fjmc;
        }

        public void setFjmc(String fjmc) {
            this.fjmc = fjmc;
        }

        public Object getHs() {
            return hs;
        }

        public void setHs(Object hs) {
            this.hs = hs;
        }

        public String getFjxh() {
            return fjxh;
        }

        public void setFjxh(String fjxh) {
            this.fjxh = fjxh;
        }

        public Object getJd() {
            return jd;
        }

        public void setJd(Object jd) {
            this.jd = jd;
        }

        public Object getWd() {
            return wd;
        }

        public void setWd(Object wd) {
            this.wd = wd;
        }

        public Object getDzbm_old() {
            return dzbm_old;
        }

        public void setDzbm_old(Object dzbm_old) {
            this.dzbm_old = dzbm_old;
        }

        public Object getCjsj() {
            return cjsj;
        }

        public void setCjsj(Object cjsj) {
            this.cjsj = cjsj;
        }

        public Object getWhsj() {
            return whsj;
        }

        public void setWhsj(Object whsj) {
            this.whsj = whsj;
        }

        public Object getCjr() {
            return cjr;
        }

        public void setCjr(Object cjr) {
            this.cjr = cjr;
        }

        public Object getCjdw() {
            return cjdw;
        }

        public void setCjdw(Object cjdw) {
            this.cjdw = cjdw;
        }

        public Object getJdbm() {
            return jdbm;
        }

        public void setJdbm(Object jdbm) {
            this.jdbm = jdbm;
        }

        public Object getJdmc() {
            return jdmc;
        }

        public void setJdmc(Object jdmc) {
            this.jdmc = jdmc;
        }

        @Override
        public String toString() {
            return "ReturnDataBean{" +
                    "dzbm='" + dzbm + '\'' +
                    ", sqcmc=" + sqcmc +
                    ", sqcbm=" + sqcbm +
                    ", pcsmc=" + pcsmc +
                    ", pcsbm=" + pcsbm +
                    ", jlxmc=" + jlxmc +
                    ", jlxxh=" + jlxxh +
                    ", jzwdl='" + jzwdl + '\'' +
                    ", jzwxl='" + jzwxl + '\'' +
                    ", xqmc=" + xqmc +
                    ", xqxh=" + xqxh +
                    ", mlpmc=" + mlpmc +
                    ", mlpxh=" + mlpxh +
                    ", dymc='" + dymc + '\'' +
                    ", dys=" + dys +
                    ", dyxh='" + dyxh + '\'' +
                    ", cs='" + cs + '\'' +
                    ", cxh=" + cxh +
                    ", fjmc='" + fjmc + '\'' +
                    ", hs=" + hs +
                    ", fjxh='" + fjxh + '\'' +
                    ", jd=" + jd +
                    ", wd=" + wd +
                    ", dzbm_old=" + dzbm_old +
                    ", cjsj=" + cjsj +
                    ", whsj=" + whsj +
                    ", cjr=" + cjr +
                    ", cjdw=" + cjdw +
                    ", jdbm=" + jdbm +
                    ", jdmc=" + jdmc +
                    '}';
        }
    }
}
