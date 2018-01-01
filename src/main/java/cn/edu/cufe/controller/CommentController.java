package cn.edu.cufe.controller;

import cn.edu.cufe.dao.CommentDao;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("comment")
public class CommentController {
    @Resource
    private CommentDao dao;

    @RequestMapping(value = "search", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> getComments(@RequestParam("bookId") int bookId) {
        Map<String, Object> map = Maps.newHashMap();
//        List<Comment> comments = dao.selectComment(bookId);
//
//        if (comments.size() > 0) {
//            map.put("data", comments);
//            map.put("message", "success");
//            map.put("status", 0);
//        } else {
//            map.put("data", Lists.newArrayList());
//            map.put("message", "no comments found");
//            map.put("status", -1);
//        }
        return map;
    }

    @RequestMapping(value = "insert", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addComments(@RequestParam("bookId") int bookId, @RequestParam("content") String content, @RequestParam("creator") String creator) {
        Map<String, Object> map = Maps.newHashMap();
//        Integer infectRows = dao.addComment(bookId, content, creator);
//        Integer count = dao.countComment(bookId);
//
//        if (infectRows > 0) {
//            map.put("data", count);
//            map.put("message", "success");
//            map.put("status", 0);
//        } else {
//            map.put("data", count);
//            map.put("message", "insert comments fail");
//            map.put("status", -1);
//        }
        return map;
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> updateThumb(@RequestParam("id") int id) {
        Map<String, Object> map = Maps.newHashMap();
//        Integer infectRows = dao.updateThumb(id);
//
//        if (infectRows > 0) {
//            map.put("data", infectRows);
//            map.put("message", "success");
//            map.put("status", 0);
//        } else {
//            map.put("data", 0);
//            map.put("message", "thumb failure");
//            map.put("status", -1);
//        }
        return map;
    }

    @RequestMapping(value = "remove", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> removeComment(@RequestParam("id") int id, @RequestParam("bookId") int bookId) {
        Map<String, Object> map = Maps.newHashMap();
//        Integer infectRows = dao.removeComment(id);
//        Integer count = dao.countComment(bookId);
//
//        if (infectRows > 0) {
//            map.put("data", count);
//            map.put("message", "success");
//            map.put("status", 0);
//        } else {
//            map.put("data", count);
//            map.put("message", "remove comment fail");
//            map.put("status", -1);
//        }
        return map;
    }
}
