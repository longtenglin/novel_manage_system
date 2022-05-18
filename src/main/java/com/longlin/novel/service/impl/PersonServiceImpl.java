package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Person;
import com.longlin.novel.mapper.PersonMapper;
import com.longlin.novel.service.IPersonService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:24
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public JSONObject getPersonList() {
        List<Person> personList = personMapper.getPersonList();
        return ResponseUtils.setResponseMessage(personList);
    }
}
