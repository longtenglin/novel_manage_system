package com.longlin.novel.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.longlin.novel.mapper.NovelMapper;
import com.longlin.novel.service.INovelService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
        params.put("pageSize", 5);
        params.put("current", 2);

        this.mockMvc.perform(get("/web/novel/list")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(params))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andDo(document("novel"));
    }
}
