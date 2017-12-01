package cn.itrip.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.itrip.pojo.ItripUser;
import cn.itrip.service.ItripUserService;
import cn.itrip.tools.Constants;

@Controller
@RequestMapping(value="userMain")
public class UserController {

	private Logger logger=Logger.getLogger(UserController.class);
	
	@Resource
	private ItripUserService uService;
	
	@RequestMapping(value="/index")
	public String index(){
		logger.debug("****************>去首页");
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		logger.debug("****************>去登录");
		return "login";
	}
	
	/**
	 * 登录验证
	 * @param userCode
	 * @param userPassWorde
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/doLog")
	public String doLog(@RequestParam String userCode,@RequestParam String userPassWorde,
			HttpSession session,Model model){
		ItripUser user=null;
		user=uService.queryByLog(userCode, userPassWorde);
		if(user !=null){//登录成功
			//放入session
			logger.debug("---------------------->数据库中的用户名："+user.getUsercode());
			session.setAttribute(Constants.USER_SESSION, user);
			//页面跳转（main.jsp）
			return "redirect:/userMain/main";
		}else{
			//跳转（login.jsp）带出提示信息
			model.addAttribute("error", "用户名或密码不正确");
			return "login";
		}
	}
	
	/**
	 * 判断是否是非法登录
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.USER_SESSION) == null){
			return "redirect:/userMain/login";
		}
		return "redirect:/userMain/index";
	}
	
}
