package com.huanyu.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huanyu.domain.WoProductResourceRecord;
import com.huanyu.service.TestService;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

//    @RequestMapping(value="/user", method=RequestMethod.POST)
//    public User createUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @RequestMapping(value="/login", method=RequestMethod.GET)
//    public User getUser(@RequestParam("username") String username, @RequestParam("password") String password) {
//        return userService.getUser(username, password);
//    }

      @RequestMapping(value="/count", method=RequestMethod.GET)
      public int getCount() {
          return testService.getCount();
      }

      @RequestMapping(value="/data", method=RequestMethod.GET)
      public List<WoProductResourceRecord> getData() {
          return testService.getData();
      }
}