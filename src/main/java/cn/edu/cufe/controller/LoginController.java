package cn.edu.cufe.controller;

import cn.edu.cufe.dao.LoginDao;
import cn.edu.cufe.entity.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginDao dao;

    @RequestMapping(value = "/user", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> login(@RequestParam("name") String name,
                                     @RequestParam("password") String password) {
        Map<String, Object> map = Maps.newHashMap();
        List<User> users = dao.selectUser(name, password);

        if (users.size() > 0) {
            map.put("data", users);
            map.put("message", "success");
            map.put("status", 0);
        } else {
            map.put("data", Lists.newArrayList());
            map.put("message", "no user found");
            map.put("status", -1);
        }
        return map;
    }
}
