package jbr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FBMainController {

	@RequestMapping("/fblogin")
	public String home()
	{
		
		return "fbpage";
	}

}
