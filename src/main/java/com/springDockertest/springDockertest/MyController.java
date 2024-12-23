package com.springDockertest.springDockertest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
 @RequestMapping("/test")
 public String test()
 {
	 return "Test is compeleted";
 }
 
 @RequestMapping("/{name}")
 public String data(@PathVariable String name)
 {
	 return "Hello! This is "+name;
 }
}
