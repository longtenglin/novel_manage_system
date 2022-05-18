package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Skill;
import com.longlin.novel.mapper.SkillMapper;
import com.longlin.novel.service.ISkillService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:26
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class SkillServiceImpl implements ISkillService {

    @Autowired
    SkillMapper skillMapper;
    @Override
    public JSONObject getSkillList() {
        List<Skill> skillList = skillMapper.getSkillList();
        return ResponseUtils.setResponseMessage(skillList);
    }
}
