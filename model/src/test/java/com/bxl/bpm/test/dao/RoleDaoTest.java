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
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoleDaoTest extends BaseTest {

    @Autowired
    RoleMapper roleMapper;

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

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

        roleMapper.insertSelective(role);

        try {
            writeValueAsString(role);

            Assert.assertNotNull(role.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }

        end();
    }

    @Test
    public void testBeanValidate() {
        Role role = Role.Builder.aRole().name("").build();

        Set<ConstraintViolation<Role>> constraintViolations = validator.validate( role );

        logger.info(constraintViolations.iterator().next().getMessage());

        assertEquals( 1, constraintViolations.size() );
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

    @Test
    public void testOptional() {
        Integer integer = 5;

        Optional<Integer> integerOptional = Optional.ofNullable(integer);

        logger.info(String.valueOf(integerOptional.orElse(1)));

        assertTrue(integerOptional.isPresent());
    }
}
