package com.dxl.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Program MyConfigEurekaServerApplication
 * @Description
 * @Author duxl
 * @Create 2019/1/15 9:20
 */
@SpringBootApplication
@EnableEurekaServer
public class MyConfigEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigEurekaServerApplication.class,args);
	}
}
