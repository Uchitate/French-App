package co.jp.tagbangers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {

	@RequestMapping
	public String login() {
		return "french/login";
	}
}
