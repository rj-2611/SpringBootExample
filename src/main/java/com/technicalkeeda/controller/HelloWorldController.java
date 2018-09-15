package com.technicalkeeda.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
@RestController
public class HelloWorldController {
 
/* @RequestMapping("/")
 public String hello() {
  return "Hello World!!";
 }*/
 @RequestMapping(value = "/hello", method = RequestMethod.GET)
 public ModelAndView hello() {
	 ModelAndView mav = null;
	 mav = new ModelAndView("hello");
	 mav.addObject("name","Rishav");
	 return mav;
 }
 
}