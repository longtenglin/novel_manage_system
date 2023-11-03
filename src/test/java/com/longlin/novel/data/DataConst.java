package com.longlin.novel.data;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.constant.RequestConst;

import java.util.Date;
import java.util.HashMap;

/**
 * @Description:
 * @Date: 2023/11/3 12:50
 * @Author: Mr.ZhaoNan
 * @Version: 1.0.0
 */
public class DataConst {
    public static final JSONObject NEW_NOVEL = new JSONObject() {{
        put(RequestConst.NOVEL_NAME, "资治通鉴");
        put(RequestConst.NOVEL_TYPE, "历史");
        put(RequestConst.NOVEL_AUTHOR, "司马光");
        put(RequestConst.NOVEL_DESCRIPTION, "《资治通鉴》是司马光奉宋英宗和宋神宗之命编撰的一部编年体通史。由司马光本人担任主编，在刘攽、刘恕和范祖禹的协助下，历时19年而编撰完成。宋神宗认为此书「鉴于往事，有资于治道」，遂赐名《资治通鉴》。\n全书分为294卷，约三百多万字，记事上起周威烈王二十三年（公元前403年），截止到后周世宗显德六年（959年），按照时间顺序记载了共16朝1362年的历史。《资治通鉴》中引用的史料极为丰富，除了十七史之外，还有各种杂史、私人撰述等。据《四库提要》记载，《资治通鉴》引用前人著作322 种，可见其取材广泛，具有极高的史料价值。\n司马光的《资治通鉴》与司马迁的《史记》并列为中国史学的不朽巨著。《资治通鉴》自成书以来，一直受到历代帝王将相、文人墨客的追捧，点评批注它的人数不胜数。《资治通鉴》保存了很多现在已经看不到的史料，更重要的是，它对之后的史官创作、中国的历史编撰、文献学的发展等产生了深远的影响。");
        put(RequestConst.NOVEL_PUB_DATE, new Date());
        put(RequestConst.CREATOR, "TEST");
        put(RequestConst.UPDATER, "TEST");
    }};

}
