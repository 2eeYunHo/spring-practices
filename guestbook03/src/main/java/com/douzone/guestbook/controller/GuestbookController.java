package com.douzone.guestbook.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.douzone.guestbook.repository.GuestBookRepository;
import com.douzone.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController extends HttpServlet {

	@Autowired // 묶는 작업을 와이어링이라하는데 그걸 해주는 어노테이션
	private GuestBookRepository guestBookRepository;

	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(Model model) {
		List<GuestBookVo> list = guestBookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}

	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String delete(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no", no);
		return "/WEB-INF/views/delete.jsp";
	}
	@RequestMapping(value = "/delete/{no}", method = RequestMethod.POST) // 이름은 꼭 일치 시키고 아래 내용에 required를 false를 줘도되지만
																			// 널값을 제외시키기 위해 트루를 주고 따로 선언한다.
	public String delete(@RequestParam(value = "password", required = true, defaultValue = "") String password,
			@PathVariable("no") Long no) {
		guestBookRepository.delete(no, password);
		return "redirect:/";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(GuestBookVo vo) {
		guestBookRepository.add(vo);
		return "redirect:/";// redirecet:/를 작성시에는 공백이 있으면 안됨
	}
}