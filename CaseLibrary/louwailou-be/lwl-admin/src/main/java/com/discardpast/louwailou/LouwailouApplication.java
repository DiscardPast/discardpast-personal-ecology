package com.discardpast.louwailou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 注释
 *
 * @author discardpast@yeah.net
 * @since 2019/10/5 22:20
 */
@SpringBootApplication
@EnableSwagger2
public class LouwailouApplication {

    public static void main(String[] args) {
        SpringApplication.run(LouwailouApplication.class);
    }
}
