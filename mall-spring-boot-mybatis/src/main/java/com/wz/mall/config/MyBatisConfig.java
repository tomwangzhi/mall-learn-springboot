package com.wz.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.wz.mall.mbg.mapper","com.wz.mall.dao"})
public class MyBatisConfig {
}