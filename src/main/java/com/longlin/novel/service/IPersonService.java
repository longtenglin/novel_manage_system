package com.longlin.novel.service;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Person;

public interface IPersonService {
    JSONObject getPersonList(JSONObject params) throws Exception;
    boolean save(Person person) throws Exception;

    boolean update(Person person) throws Exception;

    boolean delete(String id) throws Exception;

    boolean deleteFalse(String id) throws Exception;
}