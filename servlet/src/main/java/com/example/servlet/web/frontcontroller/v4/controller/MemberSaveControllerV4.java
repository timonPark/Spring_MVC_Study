package com.example.servlet.web.frontcontroller.v4.controller;

import com.example.servlet.domain.member.Member;
import com.example.servlet.domain.member.MemberReponsitory;
import com.example.servlet.web.frontcontroller.v4.ControllerV4;
import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

	private MemberReponsitory memberReponsitory = MemberReponsitory.getInstance();

	@Override public String process(Map<String, String> paramMap, Map<String, Object> model) {
		String username = paramMap.get("username");
		int age = Integer.parseInt(paramMap.get("age"));

		Member member = new Member(username, age);
		memberReponsitory.save(member);

		model.put("member", member);
		return "save-result";
	}
}