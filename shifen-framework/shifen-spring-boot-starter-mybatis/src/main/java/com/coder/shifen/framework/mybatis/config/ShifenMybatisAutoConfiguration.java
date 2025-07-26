package com.coder.shifen.framework.mybatis.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration(before = MybatisPlusAutoConfiguration.class)
@MapperScan(value ="${shifen.info.base-package}", annotationClass = Mapper.class)
public class ShifenMybatisAutoConfiguration {

}
