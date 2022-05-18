package com.longlin.novel.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.longlin.novel.entity.Weapons;
import com.longlin.novel.mapper.WeaponsMapper;
import com.longlin.novel.service.IWeaponsService;
import com.longlin.novel.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2022-04-19 16:27
 * @Author: Mr.ZhaoNan
 * @Version: 1.0
 */
@Service
public class WeaponsServiceImpl implements IWeaponsService {

    @Autowired
    WeaponsMapper weaponsMapper;
    @Override
    public JSONObject getWeaponsList() {
        List<Weapons> weaponsList = weaponsMapper.getWeaponsList();
        return ResponseUtils.setResponseMessage(weaponsList);
    }
}
