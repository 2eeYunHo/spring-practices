package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/board/view/{no}")//값이 들어오지않으면 낫파운드 에러가 발생 또는 값이 선언된 타입이 아니어도 에러발생
	public String view(@PathVariable("no") int no) {
		return "BoardController.view(" + no + ")";
	}
}
