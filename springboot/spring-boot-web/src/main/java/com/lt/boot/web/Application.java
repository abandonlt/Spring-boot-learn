package com.lt.boot.web;
/**
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
* <p>Title: </p>  Application.java 
* <p>Description: </p> TODO
* 
* @author Administrator
* @date 2017年10月5日 上午10:54:46
 */
@SpringBootApplication
//扫描工程中的Servlet、Filter、Listener
@ServletComponentScan(basePackages = {"com.dongnao.jack"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
