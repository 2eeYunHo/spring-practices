package com.douzone.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@MyAnnotation
public class MainController {
	/**
	 * 
	 * @RequestMapping 멀티 매핑 가능
	 */
	@ResponseBody
	@RequestMapping({"","/main", "/main/a/b/c/d"})
	public String main() {
		return "MainController.main()";
	}
}
