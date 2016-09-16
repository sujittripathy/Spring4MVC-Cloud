package org.git.spring.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringCloudController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getTestCloudHome(){
		return "home";
	}
}
