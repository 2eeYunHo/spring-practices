package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping 클래스(타입) + 핸들러(메소드)
 * 
 **/
@Controller
@RequestMapping("/guestbook/*")
public class GuestBookController {
	@ResponseBody
	@RequestMapping("")
	public String list() {
		return "GuestBookController.list()";
	}
	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "GuestBookController.delete()";
	}
}