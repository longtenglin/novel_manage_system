package com.longlin.novel.data;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.constant.RequestConst;
import com.longlin.novel.constant.ResponseConst;
import com.longlin.novel.entity.Novel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    }};

    public static final JSONObject UPDATE_NOVEL = new JSONObject() {{
        put(RequestConst.ID, "LTLN00000");
        put(RequestConst.NOVEL_NAME, "资治通鉴");
        put(RequestConst.NOVEL_TYPE, "历史");
        put(RequestConst.NOVEL_AUTHOR, "司马光");
        put(RequestConst.NOVEL_DESCRIPTION, "《资治通鉴》是司马光奉宋英宗和宋神宗之命编撰的一部编年体通史。由司马光本人担任主编，在刘攽、刘恕和范祖禹的协助下，历时19年而编撰完成。宋神宗认为此书「鉴于往事，有资于治道」，遂赐名《资治通鉴》。\n全书分为294卷，约三百多万字，记事上起周威烈王二十三年（公元前403年），截止到后周世宗显德六年（959年），按照时间顺序记载了共16朝1362年的历史。《资治通鉴》中引用的史料极为丰富，除了十七史之外，还有各种杂史、私人撰述等。据《四库提要》记载，《资治通鉴》引用前人著作322 种，可见其取材广泛，具有极高的史料价值。\n司马光的《资治通鉴》与司马迁的《史记》并列为中国史学的不朽巨著。《资治通鉴》自成书以来，一直受到历代帝王将相、文人墨客的追捧，点评批注它的人数不胜数。《资治通鉴》保存了很多现在已经看不到的史料，更重要的是，它对之后的史官创作、中国的历史编撰、文献学的发展等产生了深远的影响。");
        put(RequestConst.NOVEL_PUB_DATE, new Date());
    }};

    public static final JSONObject NEW_PERSON = new JSONObject() {{
        put(RequestConst.PERSON_NAME, "司马光");
        put(RequestConst.AGE, "67");
        put(RequestConst.PERSON_ATTRIBUTE, "北宋");
        put(RequestConst.PERSON_DESCRIPTION, "司马光（1019年～1086年），字君实，号迂叟，陕州夏县涑水乡（今山西省夏县）人，出生于光州光山（今河南省光山县）。世称涑水先生。北宋时期政治家、史学家、文学家，自称西晋安平献王司马孚后代。 [1-5]\n" +
                "宋仁宗宝元元年（1038年），进士及第，累迁龙图阁直学士。宋神宗时，反对王安石变法，离开朝廷十五年，主持编纂了编年体通史《资治通鉴》。历仕仁宗、英宗、神宗、哲宗四朝，官至尚书左仆射兼门下侍郎。元祐元年（1086年），去世，追赠太师、温国公，谥号文正。名列“元祐党人”，配享宋哲宗庙廷，图形昭勋阁；从祀于孔庙，称“先儒司马子”；从祀历代帝王庙。 [60]\n" +
                "为人温良谦恭、刚正不阿；做事用功，刻苦勤奋。以“日力不足，继之以夜”自诩，堪称儒学教化下的典范。生平著作甚多，主要《温国文正司马公文集》《稽古录》《涑水记闻》《潜虚》等。 [61]");
    }};

    public static final JSONObject UPDATE_PERSON = new JSONObject() {{
        put(RequestConst.ID, "LTLP000000");
        put(RequestConst.PERSON_NAME, "司马光");
        put(RequestConst.AGE, "67");
        put(RequestConst.PERSON_ATTRIBUTE, "北宋");
        put(RequestConst.PERSON_DESCRIPTION, "司马光（1019年～1086年），字君实，号迂叟，陕州夏县涑水乡（今山西省夏县）人，出生于光州光山（今河南省光山县）。世称涑水先生。北宋时期政治家、史学家、文学家，自称西晋安平献王司马孚后代。 [1-5]\n" +
                "宋仁宗宝元元年（1038年），进士及第，累迁龙图阁直学士。宋神宗时，反对王安石变法，离开朝廷十五年，主持编纂了编年体通史《资治通鉴》。历仕仁宗、英宗、神宗、哲宗四朝，官至尚书左仆射兼门下侍郎。元祐元年（1086年），去世，追赠太师、温国公，谥号文正。名列“元祐党人”，配享宋哲宗庙廷，图形昭勋阁；从祀于孔庙，称“先儒司马子”；从祀历代帝王庙。 [60]\n" +
                "为人温良谦恭、刚正不阿；做事用功，刻苦勤奋。以“日力不足，继之以夜”自诩，堪称儒学教化下的典范。生平著作甚多，主要《温国文正司马公文集》《稽古录》《涑水记闻》《潜虚》等。 [61]");

    }};

    public static final JSONObject DELETE_PERSON = new JSONObject() {{
        put(RequestConst.ID, "LTLP000000");
    }};

    public static final Map<String, Object> PAGE_LIST = new HashMap<>() {{
        put(ResponseConst.PAGE_SIZE, 5);
        put(ResponseConst.CURRENT, 2);
    }};

    public static final JSONObject RESULT_LIST = new JSONObject() {{
        put(ResponseConst.TOTAL, 19);
        put(ResponseConst.PAGE_SIZE, 10);
        put(ResponseConst.CURRENT, 2);
        put(ResponseConst.SOURCE, new ArrayList<>());
    }};

    public static final JSONObject RESULT_SUCCESS = new JSONObject() {{
        put(ResponseConst.SUCCESS, true);
    }};

    public static final JSONObject RESULT_FAIL = new JSONObject() {{
        put(ResponseConst.SUCCESS, false);
    }};
}
