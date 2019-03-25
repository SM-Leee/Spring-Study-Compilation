package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 
 *  request mapping : type만
 *  많이 쓰이지는 않지만, *에서 함수 이름으로 mapping이 된다.
 *
 * */
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {

	public void commonFunction() {

	}
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list()";
	}

	@ResponseBody
	@RequestMapping
	public String add() {
		return "GuestbookController:add()";
	}
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestbookController:delete()";
	}

}
