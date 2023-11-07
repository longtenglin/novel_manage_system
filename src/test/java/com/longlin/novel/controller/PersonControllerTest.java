package com.longlin.novel.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.longlin.novel.constant.ApiPathConst;
import com.longlin.novel.constant.RequestConst;
import com.longlin.novel.constant.ResponseConst;
import com.longlin.novel.data.DataConst;
import com.longlin.novel.service.IPersonService;
import com.longlin.novel.utils.ResponseCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Description:
 * @Date: 2023/11/6 16:11
 * @Author: Mr.ZhaoNan
 * @Version: 1.0.0
 */
@WebMvcTest(PersonController.class)
@AutoConfigureRestDocs
public class PersonControllerTest {

    @MockBean
    private IPersonService iPersonService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void list() throws Exception {
        when(iPersonService.getPersonList(any())).thenReturn(DataConst.RESULT_LIST);

        this.mockMvc.perform(
                        get("/web/person/list")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(DataConst.PAGE_LIST)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("person/list",
                        requestFields(
                                fieldWithPath(RequestConst.PAGE_SIZE).description("每页数据数目"),
                                fieldWithPath(RequestConst.CURRENT).description("当前页码")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应信息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容"),
                                fieldWithPath(ResponseConst.RESULT_TOTAL).description("数据总数"),
                                fieldWithPath(ResponseConst.RESULT_PAGE_SIZE).description("每页数据数目"),
                                fieldWithPath(ResponseConst.RESULT_CURRENT).description("当前页码"),
                                fieldWithPath(ResponseConst.RESULT_SOURCE).description("当前页数据")
                        ))
                );
    }

    @Test
    public void save() throws Exception {
        when(iPersonService.save(any())).thenReturn(true);

        this.mockMvc.perform(
                        post(ApiPathConst.WEB_PERSON.concat(ApiPathConst.SAVE))
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(DataConst.NEW_PERSON)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("person/save",
                        requestFields(
                                fieldWithPath(RequestConst.PERSON_NAME).description("人物名称"),
                                fieldWithPath(RequestConst.AGE).description("人物年龄"),
                                fieldWithPath(RequestConst.PERSON_ATTRIBUTE).description("人物属性，特点"),
                                fieldWithPath(RequestConst.PERSON_DESCRIPTION).optional().description("(可选) 描述")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应消息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容")
                        )));
    }

    @Test
    public void update() throws Exception {
        when(iPersonService.update(any())).thenReturn(true);

        this.mockMvc.perform(
                        post(ApiPathConst.WEB_PERSON.concat(ApiPathConst.UPDATE))
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(DataConst.UPDATE_PERSON)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("person/update",
                        requestFields(
                                fieldWithPath(RequestConst.ID).description("标识该数据唯一性的值"),
                                fieldWithPath(RequestConst.PERSON_NAME).optional().description("(可选) 人物名称"),
                                fieldWithPath(RequestConst.AGE).optional().description("(可选) 人物年龄"),
                                fieldWithPath(RequestConst.PERSON_ATTRIBUTE).optional().description("(可选) 人物属性，特点"),
                                fieldWithPath(RequestConst.PERSON_DESCRIPTION).optional().description("(可选) 描述")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应消息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容")
                        )));
    }

    @Test
    public void deleteFalse() throws Exception {
        when(iPersonService.update(any())).thenReturn(true);

        this.mockMvc.perform(
                        post(ApiPathConst.WEB_PERSON.concat(ApiPathConst.DELETE))
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(DataConst.DELETE_PERSON)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("person/deleteFalse",
                        requestFields(
                                fieldWithPath(RequestConst.ID).description("标识数据唯一性的 ID")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应消息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容")
                        )));
    }

    @Test
    public void deleteTrue() throws Exception {
        when(iPersonService.delete(any())).thenReturn(true);

        this.mockMvc.perform(
                delete(ApiPathConst.WEB_PERSON.concat(ApiPathConst.DELETE))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(DataConst.DELETE_PERSON)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(ResponseCode.E0000)))
                .andDo(document("person/deleteTrue",
                        requestFields(
                                fieldWithPath(RequestConst.ID).description("标识数据唯一性的 ID")
                        ),
                        responseFields(
                                fieldWithPath(ResponseConst.CODE).description("响应代码"),
                                fieldWithPath(ResponseConst.MESSAGE).description("响应消息"),
                                fieldWithPath(ResponseConst.RESULT).description("响应内容")
                        )));
    }
}
