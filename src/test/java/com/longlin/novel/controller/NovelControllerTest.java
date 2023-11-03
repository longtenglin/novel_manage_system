package com.longlin.novel.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.longlin.novel.constant.RequestConst;
import com.longlin.novel.constant.ResponseConst;
import com.longlin.novel.entity.Novel;
import com.longlin.novel.service.INovelService;
import com.longlin.novel.utils.ResponseCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.*;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Description:
 * @Date: 2023/10/30 15:34
 * @Author: Mr.ZhaoNan
 * @Version: 1.0.0
 */
@WebMvcTest(NovelController.class)
@AutoConfigureRestDocs
public class NovelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private INovelService iNovelService;

    @Test
    public void getNovelList() throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put(ResponseConst.PAGE_SIZE, 5);
        params.put(ResponseConst.CURRENT, 2);

        JSONObject result = new JSONObject();
        result.put(ResponseConst.TOTAL, 19);
        result.put(ResponseConst.PAGE_SIZE, 10);
        result.put(ResponseConst.CURRENT, 2);
        result.put(ResponseConst.SOURCE, new ArrayList<Novel>());

        when(iNovelService.list(any())).thenReturn(result);

        this.mockMvc.perform(get("/web/novel/list")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(params))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("novel/list",
                        requestFields(
                                fieldWithPath(ResponseConst.PAGE_SIZE).description("每页数据条数"),
                                fieldWithPath(ResponseConst.CURRENT).description("当前页码")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.RESULT).description("返回的数据内容"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应信息"),
                                subsectionWithPath(ResponseConst.RESULT_TOTAL).description("数据总数目"),
                                subsectionWithPath(ResponseConst.RESULT_PAGE_SIZE).description("每页数据数量"),
                                subsectionWithPath(ResponseConst.RESULT_CURRENT).description("当前页码"),
                                subsectionWithPath(ResponseConst.RESULT_SOURCE).description("返回的数据")
                        )));
    }

    @Test
    public void saveTest() throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put(RequestConst.ID, "LTLN0000001");
        params.put(RequestConst.NOVEL_NAME, "Mockmvc Test");
        params.put(RequestConst.NOVEL_TYPE, "Mockmvc Test");
        params.put(RequestConst.NOVEL_AUTHOR, "Mockmvc Test");
        params.put(RequestConst.NOVEL_PUB_DATE, new Date());
        params.put(RequestConst.NOVEL_DESCRIPTION, "Mockmvc Test");
        params.put(RequestConst.CREATE_TIME, new Date());
        params.put(RequestConst.CREATOR, "SYS");
        params.put(RequestConst.UPDATE_TIME, new Date());
        params.put(RequestConst.UPDATER, "SYS");
        params.put(RequestConst.DELETED, 0);

        when(iNovelService.save(any())).thenReturn(1);
        this.mockMvc
                .perform(post("/web/novel/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(params)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("E0000")))
                .andDo(document("novel/save",
                        requestFields(
                                fieldWithPath(RequestConst.NOVEL_NAME).description("小说名称"),
                                fieldWithPath(RequestConst.NOVEL_TYPE).description("小说类型"),
                                fieldWithPath(RequestConst.NOVEL_AUTHOR).description("小说的作者"),
                                fieldWithPath(RequestConst.NOVEL_PUB_DATE).description("小说的发布日期"),
                                fieldWithPath(RequestConst.NOVEL_DESCRIPTION).description("小说描述")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应消息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容")
                        )));
    }
}
