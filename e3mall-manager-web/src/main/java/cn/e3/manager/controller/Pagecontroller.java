package cn.e3.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {
	// 后台系统的页面跳转
	@RequestMapping("{page}")
	public String findPage(@PathVariable String page){
		return page;
	}
}
