package edu.nju.SSDAAssignmentThree.controller;

import edu.nju.SSDAAssignmentThree.model.Book;
import edu.nju.SSDAAssignmentThree.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BookInfo")
public class ReadOnlineInfoController {

    @Autowired
    BookInfoService bookInfoService;

    @RequestMapping(value = "/readOnline", method = RequestMethod.POST)
    @ResponseBody
    public void readOnline(@RequestBody String ID) {

    }

}
