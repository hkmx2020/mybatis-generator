package com.mybatis.generator.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MybatisConf {

    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor interceptor = new PageInterceptor();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("supportMethodArguments", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("pageSizeZero", "true");
        p.setProperty("reasonable", "true");
        p.setProperty("params", "count=countSql");
        p.setProperty("returnPageInfo", "check");
        interceptor.setProperties(p);
        return interceptor;
    }

}
