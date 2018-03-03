package com.bountyhunters.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// test
@RestController
public class CalculatorController {
	
	@GetMapping(value="add")
	public String add(@RequestParam(name="num1")int int1,@RequestParam(name="num2")int int2){
		int i = int1+int2;
		return "Sum of two numbers is:"+i;
	}

}
