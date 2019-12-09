package com.seenu.MicroService_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	
	@GetMapping("/limits")
	public LimitMethod LimitsRetriever() {
		return new LimitMethod(1000,56);
		
	}

}
