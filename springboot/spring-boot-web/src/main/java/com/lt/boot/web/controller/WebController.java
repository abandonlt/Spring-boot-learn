package com.lt.boot.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
* Title:   Application.java 
* Description:  TODO
* 
* @author Administrator
* @date 2017年10月5日 上午10:54:46
 */
@Controller
/**
 * @RestController @ResponseBody @Controller
 * @RestController
 */
public class WebController {
//	private static final Logger logger = LoggerFactory.getLogger(WebController.class);

//	@Value("${application.hello:Hello jack}")
//	private String hello = "";

	@RequestMapping("login")
	public String login(String param) {
		return "ssss";
	}

	@RequestMapping(value = { "/", "/index" })
	public String index(Map<String, Object> model) {
		// 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
		// 本例为 /WEB-INF/jsp/index.jsp
		model.put("time", new Date());
		model.put("message", "hello");
		return "index";
	}

//	@RequestMapping("/page")
//	public ModelAndView page() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("index");
//		model.addObject("time", new Date());
//		model.addObject("message", this.hello);
//		return model;
//	}

	@RequestMapping("/freemarker")
	public String freemarker(Map<String, Object> map) {
		map.put("name", "[Angel -- 守护天使]");
		map.put("gender", 1);// gender:性别，1：男；0：女；

		List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
		Map<String, Object> friend = new HashMap<String, Object>();
		friend.put("name", "jack");
		friend.put("age", 30);
		friends.add(friend);
		friend = new HashMap<String, Object>();
		friend.put("name", "jeff");
		friend.put("age", 36);
		friends.add(friend);
		map.put("friends", friends);
		return "freemarker";
	}

	/*
	 * @RequestMapping("/queryContent") public @ResponseBody
	 * List<ConsultContent> queryContent() { logger.info("查询开始！");
	 * List<ConsultContent> consults = commonService.queryContent(new
	 * HashMap()); logger.info("查询结束！"); return consults; }
	 */

	// @RequestMapping("/queryConsultContract")
	// public @ResponseBody List<ConsultContract> queryConsultContract() {
	// logger.info("查询开始！");
	// List<ConsultContract> consults = commonService.queryConsultContract();
	// logger.info("查询结束！");
	// return consults;
	// }
	//
	// @RequestMapping("/updateConsultContract")
	// public @ResponseBody int updateConsultContract() {
	// logger.info("修改开始！");
	// int count = commonService.updateConsultContract("jpa test", 98);
	// logger.info("修改结束！");
	// return count;
	// }

}
