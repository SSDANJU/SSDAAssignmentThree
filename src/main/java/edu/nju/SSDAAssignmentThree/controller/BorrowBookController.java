package edu.nju.SSDAAssignmentThree.controller;

import edu.nju.SSDAAssignmentThree.model.Book;
import edu.nju.SSDAAssignmentThree.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BookInfo")
public class BorrowBookController {

    @Autowired
    BookInfoService bookInfoService;

    @RequestMapping(value = "/borrow", method = RequestMethod.POST)
    @ResponseBody
    public boolean borrow(@RequestBody Book book) {
        return true;
    }

}
