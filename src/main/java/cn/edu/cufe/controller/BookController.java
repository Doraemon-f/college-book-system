package cn.edu.cufe.controller;

import cn.edu.cufe.dao.BookDao;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookDao dao;

    @RequestMapping(value = "/book", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> getBooks() {
        Map<String, Object> map = Maps.newHashMap();
//        List<Book> books = dao.selectBooks();
//
//        if (books.size() > 0) {
//            map.put("data", books);
//            map.put("message", "success");
//            map.put("status", 0);
//        } else {
//            map.put("data", Lists.newArrayList());
//            map.put("message", "no books");
//            map.put("status", -1);
//        }
        return map;
    }
}
