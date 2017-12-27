package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

// 1.启动类继承SpringBootServletInitializer
@SpringBootApplication
public class HotDeployFromImoocApplication extends SpringBootServletInitializer {
	// 2.复写configure方法
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HotDeployFromImoocApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HotDeployFromImoocApplication.class, args);
	}
}
