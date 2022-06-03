package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping Method 단독 맵핑
 *
 */
@Controller
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController.write()";
	}
	@ResponseBody
	@RequestMapping("/board/writeform")
	public String writeForm() {
		return "BoardController.writeForm()";
	}
	@ResponseBody
	@RequestMapping("/board/view")
	public String view(int no) {
		return "BoardController.view(" + no + ")";
	}
}
