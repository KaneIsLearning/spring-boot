package com.kane.springboot002.controller;

import com.kane.springboot002.bean.Book;
import com.kane.springboot002.dao.ReadListRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈书籍列表〉
 *
 * @author Kane
 * Date:   2019/5/23 11:23
 * @since 1.0.0
 */
@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    private ReadListRepository readListRepository;
    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readBooks(@PathVariable("reader") String reader, Model model){
        logger.info("获取用户"+reader+"读书列表开始");
        List<Book> readList = readListRepository.findByReader(reader);
        if(readList != null){
            model.addAttribute("books",readList);
        }
        logger.info("用户"+reader+"读书列表为："+readList);
        logger.info("获取用户"+reader+"读书列表结束");
        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.POST)
    public String addBookToList(@PathVariable("reader")String reader,Book book){
        logger.info("用户"+reader+"添加读本"+book.getTitle());
        book.setReader(reader);
        readListRepository.save(book);
        logger.info("用户"+reader+"添加完毕");
        return "redirect:/{reader}";
    }


}