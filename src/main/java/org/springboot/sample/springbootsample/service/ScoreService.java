package org.springboot.sample.springbootsample.service;

import org.springboot.sample.springbootsample.dao.ScoreDao;
import org.springboot.sample.springbootsample.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreDao scoreDao;

    public int updateScoreById(float score, int id){
        return scoreDao.updateScoreById(score,id);
    }

    public List<Score> getList(){
        return scoreDao.getList();
    }
}
