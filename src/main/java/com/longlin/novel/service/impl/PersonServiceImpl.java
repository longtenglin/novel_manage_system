package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Person;
import com.longlin.novel.mapper.PersonMapper;
import com.longlin.novel.service.IPersonService;
import com.longlin.novel.utils.ResponseUtils;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
public class PersonServiceImpl implements IPersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public JSONObject getPersonList(JSONObject params) throws Exception {
        try{
            log.info(this.getClass().getName()+" - 人物信息获取业务处理开始");

            log.info(this.getClass().getName()+" - 数据总数获取开始");
            int total = personMapper.getTotalPerson();
            log.info(this.getClass().getName()+" - 数据总数获取结束");

            int pageSize = (int) params.get("pageSize");
            int current = (int) params.get("current");
            int start = (current-1)*pageSize;

            List<Person> personList = personMapper.getPersonList(start, pageSize);

            JSONObject result = new JSONObject();
            result.put("total", total);
            result.put("pageSize", pageSize);
            result.put("current", current);
            result.put("dataSource", personList);

            log.info(this.getClass().getName()+" - 人物信息获取业务处理结束");
            return ResponseUtils.setResponseMessage(result);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
