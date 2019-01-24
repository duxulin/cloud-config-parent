package com.dxl.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RefreshScope
public class MyConfigClientApplication {

	/**
	 * 添加refreshScop注解后  且在配置文件中添加了management.endpoints.web.exposure.include参数，
	 * 相当于开启一个映射 /actuator/refresh  ,通过post访问该地址，则会刷新该config-client绑定的配置文件
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(MyConfigClientApplication.class,args);
	}
	@Value("${foo}")
	String foo;
	@RequestMapping("/hi")
	public String hi(){
		return foo;
	}
}
