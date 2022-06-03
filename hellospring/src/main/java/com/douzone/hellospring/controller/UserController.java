package com.douzone.hellospring.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * @RequestMapping url + request method 맵핑
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {
	//아래 두줄GET과 POST는 overload의 파라미터를 선언으로 구별할수있게 선언해준다
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(HttpServletRequest request, String name, String email, String password, String gender)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		System.out.println(name + ":" + email + ":" + password + ":" + gender);
		return "redirect:/";
	}
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo vo)
			throws UnsupportedEncodingException {
		System.out.println(vo);
		return "redirect:/";
	}
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		/**
		 * 만일 n이라는 이름의 파라미터가 없는 경우 
		 * 400 Bad Request 에러가 발생한다.
		 */
		return "UserController.update("+name+")";
	}
	@ResponseBody
	@RequestMapping("/update2")//이름은 꼭 일치 시키고 아래 내용에 required를 false를 줘도되지만 널값을 제외시키기 위해 트루를 주고 따로 선언한다. 
	public String update2(@RequestParam(value = "n", required = true, defaultValue = "") String name,
						  @RequestParam(value = "n", required = true, defaultValue = "0") int age) {
		
		return "UserController.update("+name+")";
		
	}
}
