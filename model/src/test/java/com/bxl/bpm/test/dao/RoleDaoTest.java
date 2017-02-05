/*
 * bpm - com.bxl.bpm.test.dao - RoleDaoTest        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/5
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.bpm.test.dao;

import com.bxl.bpm.dao.RoleMapper;
import com.bxl.bpm.model.Role;
import com.bxl.bpm.test.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public class RoleDaoTest extends BaseTest {

    @Autowired
    RoleMapper roleMapper;

    @Test
    public void testInsert_Guest() {

        start();

        Role role = Role.Builder.aRole()
                .name("访客")
                .code("guest")
                .sort(1)
                .remark("一般访客，仅拥有系统登录权限和必须的浏览权限。新建用户的默认角色。不可删除")
                .isDefault(true)
                .build();

        roleMapper.insert(role);

        try {
            writeValueAsString(role);

            Assert.assertNotNull(role.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }

        end();
    }

    @Test
    public void testSelectByPrimaryKey_Value_Eq_1() {
        start();

        Role guest = roleMapper.selectByPrimaryKey(1);

        try {
            writeValueAsString(guest);
            Assert.assertNotNull(guest);
        } catch (IOException e) {
            e.printStackTrace();
        }


        end();
    }
}
