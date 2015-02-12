package com.test;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController  {


	IUserService userService;

	

	@RequestMapping({ "/doAddUser" })
	public void addUser(){
		TestEntity t = new TestEntity();
		t.setA("bbb");
		userService.insert(t);
	}
	
	@RequestMapping({ "/doAddUser2" })
	public void addUser2(){
		TestEntity t = new TestEntity();
		t.setA(" "+System.nanoTime());
		t.setC(12);
		t.setE(13.04);
		userService.insert(t);
	}
	
	@RequestMapping({ "/findListby" })
	public void find(){
		TestEntity t = new TestEntity();
		t.setA("bbb");
		t.setB("");
		List<TestEntity> list = userService.selectTestByCondition(t);
		if(list!=null&& list.size()>0){
			System.out.println("list size = "+list.size());
			for(TestEntity test : list){
				System.out.println("a ="+test.getA() +"    -b="+test.getB()+" --c="+test.getC());
			}
		}
		
		
	}
	



	public IUserService getUserService() {
		return userService;
	}


	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
