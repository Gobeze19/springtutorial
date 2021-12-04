package com.stacksimplify.restservices.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@SuppressWarnings("unused")
@RestController
public class HelloWorldController {

	//Simple Method
	//Uri -/helloworld
	//GET
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "Hello World";
	}
	@GetMapping("/helloworld-Bean")
	public UserDetails helloworldBean() {
		return new UserDetails("praise","a","tesfaye", "texas");
	}
	      
	
}
