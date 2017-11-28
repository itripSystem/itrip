package cn.itrip.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="userMain")
public class UserController {

	private Logger logger=Logger.getLogger(UserController.class);
	
	@RequestMapping(value="/index")
	public String index(){
		logger.debug("****************>去首页");
		return "index";
	}
}
