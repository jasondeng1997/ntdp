package com.xiangkai.cfms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xukq on 2018-2-23.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
public class PolicyServiceTest {
//    @Resource
//    private UserService userService;
//
//    // 用于mysql数据测试
//    @Test
//    public void queryErrorsTest() {
//        // List<PolicyErrorDTO> errorDTOList = policyService.queryErrors("201710145228001");
//        // System.out.println("size = " + errorDTOList.size());
//    }
//
//    // 用于oracle数据库测试
//    @Test
//    public void queryProductTest() {
//        // Product product = policyService.queryProduct("1257");
//        // System.out.println("productName = " + product.getProductName());
//    }
}
