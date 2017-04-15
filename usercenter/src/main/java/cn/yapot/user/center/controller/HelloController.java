package cn.yapot.user.center.controller;

import static com.google.common.base.Preconditions.checkArgument;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping("/")
	public String uid(HttpSession session){
		Object uid =  session.getAttribute("uid");
		log.info("uid:" + uid);
		if(null == uid){
			//uid = UUID.randomUUID();
			return "login";
		}else{
			return "success";
		}
		//session.setAttribute("uid", uid);
		//return uid.toString();
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/signin",method=RequestMethod.POST)
	public String signIn(HttpServletRequest req,@RequestParam(required=true,defaultValue="",value="username") String username,
			             @RequestParam(required=true,defaultValue="",value="password") String password) throws Exception{
		checkArgument(StringUtils.isNotEmpty(username), "登录名不能为空");
		checkArgument(StringUtils.isNotEmpty(password),"用户密码不能为空");
		HttpSession session = req.getSession();
		session.setAttribute("uid", username + password);
		return "success";
	}
}
