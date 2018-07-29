package com.wu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Description:(这里用一句话描述这个类的作用)  
 * @author :wxh  
 * @date 2018年7月29日 上午11:22:50
 */
@SpringBootApplication
@RestController
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
	
	/**哈哈*/
	/**测试冲突*/
	@RequestMapping("/hi")
    public String home(String name) {
        return "hi " + name + " ,i am from port:";
    }
}
