package com.huanyu.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	@GetMapping("/hellos/{helloId}/hello")
    public String hello(@PathVariable String helloId) {
        return "hellos "+ helloId + "say: Hello World!";
    }
	
	@GetMapping("/hellos/{helloId:[0-9]+}/hello")
    public String helloTest(@PathVariable String helloId) {
        return "hellos "+ helloId + "say: Hello World!";
    }
	
//	@PostMapping(path = "/hellos", consumes = "application/json")
//	public void addHello(@RequestBody User user, Model model) {
//	    // implementation omitted
//	}
	
	@GetMapping(path = "/hellos/{helloId}")
	public Map<String, String> getPet(@PathVariable String helloId, Model model) {
		Map<String, String> helloMap = new HashMap<String, String>();
		helloMap.put(helloId, "World");
		return helloMap;
	}
}
