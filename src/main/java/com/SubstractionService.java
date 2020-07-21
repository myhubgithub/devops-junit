package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubstractionService {
	
	@GetMapping("/substract")
	public int substract() {
		return 200-100;
	}

	
	@GetMapping("/divide")
	public int divide() {
		return 1000/10;
	}
}