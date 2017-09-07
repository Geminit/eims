package com.eims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Geminit
 * @create 2016-9-7-10:23
 */
@Controller
@RequestMapping("/eims")
public class indexcontroller {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(indexcontroller.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }
}
