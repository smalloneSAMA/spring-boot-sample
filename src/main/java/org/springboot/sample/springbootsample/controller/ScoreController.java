package org.springboot.sample.springbootsample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.sample.springbootsample.entity.Score;
import org.springboot.sample.springbootsample.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private final static Logger logger = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/socreList")
    public List<Score> getScoreList(){

        logger.info("从数据库读取Score集合");

        logger.info("更新的行数：" + scoreService.updateScoreById(88.8f, 1));
        return scoreService.getList();
    }




}
