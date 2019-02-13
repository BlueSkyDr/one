package cn.baidu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.baidu.pojo.User;

@Controller
public class Client {
    @Autowired
	private OneService oneService;
	
	public void test(){
		User user = new User();
		user.setAge(100);
		oneService.hello(user);
	}
}
