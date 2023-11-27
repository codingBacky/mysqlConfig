package com.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.domain.TestVO;
import com.mysql.service.TestService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test/*")
public class TestController {
	
	@Autowired
	private final TestService service;
	
	@GetMapping("/getList")
	public void getList(Model model) {
		List<TestVO> list = service.getList();
		model.addAttribute("list", list);
	}
}
