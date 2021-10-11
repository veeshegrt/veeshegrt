package com.kdgcsoft.bigdatainterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAsync
public class BigdatainterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigdatainterfaceApplication.class, args);
	}

}
