package com.xiangkai.cfms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * Created by xukq on 2018-2-23.
 */
@SpringBootApplication
@Configuration
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }

//    /**
//     * 配置上传文件大小的配置
//     * @return
//     */
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //  单个数据大小,30M
//        factory.setMaxFileSize("30720KB");
//
//        /// 总上传数据大小,150M
//        factory.setMaxRequestSize("153600KB");
//        return factory.createMultipartConfig();
//    }
}
