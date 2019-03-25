package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
*
*	request mapping ; type + method
*
*/

@Controller
@RequestMapping("/user")
public class UserController {
	
	//Get방식으로 넘어기는법
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	//post방식으로 넘어가는법 Post방식에서는 접근을 할수 없다.
	@ResponseBody
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);
		return "UserController : join()";
	}
	
	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "UserController : loginform()";
	}
	
}
