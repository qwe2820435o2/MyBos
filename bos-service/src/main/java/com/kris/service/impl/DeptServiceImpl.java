package com.kris.service.impl;

import com.kris.mapper.DeptPMapper;
import com.kris.pojo.DeptP;
import com.kris.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User:kris
 * date:2017/3/28
 * time:15:20
 * des:
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptPMapper mDeptPMapper;

    @Override
    public DeptP getDeptById(String id) {
        DeptP item = mDeptPMapper.selectByPrimaryKey(id);
        return item;
    }
}
