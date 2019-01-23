package edu.nju.SSDAAssignmentThree.controller;

import edu.nju.SSDAAssignmentThree.model.Notification;
import edu.nju.SSDAAssignmentThree.model.User;
import edu.nju.SSDAAssignmentThree.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public boolean updateUserInfo(@RequestBody User user) {
        return userInfoService.updateUserInfo(user);
    }

    @RequestMapping(value = "/generateNotification", method = RequestMethod.POST)
    @ResponseBody
    public boolean generateNotification(@RequestBody Notification notification) {
        return userInfoService.generateNotification(notification);
    }

    @RequestMapping(value = "/findUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public User findUserInfo(@RequestParam String userId) {
        return userInfoService.findUserInfo(userId);
    }
}
