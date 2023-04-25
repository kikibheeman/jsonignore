package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class one {
	
	@GetMapping("/")
	public String gett()
	{
		return "hi hello";
	}
	
	@GetMapping("/abc")
	public String gettwo(@RequestBody two tw)
	{
		return tw.toString();
	}
	
	@PostMapping("/details")
	public two savetwo(@RequestBody two tw)
	{
		return tw;
	}
}
