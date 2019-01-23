package edu.nju.SSDAAssignmentThree.controller;

import edu.nju.SSDAAssignmentThree.model.Book;
import edu.nju.SSDAAssignmentThree.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BookInfo")
public class BookInfoController {

    @Autowired
    BookInfoService bookInfoService;

    @RequestMapping(value = "/updateBookInfo", method = RequestMethod.POST)
    @ResponseBody
    public boolean updateBookInfo(@RequestBody Book book) {
        return bookInfoService.updateBookInfo(book);
    }

    @RequestMapping(value = "/findBookInfo", method = RequestMethod.POST)
    @ResponseBody
    public Book findBookInfo(@RequestParam String bookId) {
        return bookInfoService.findBookInfo(bookId);
    }
}
