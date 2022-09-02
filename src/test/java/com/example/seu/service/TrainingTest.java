package com.example.seu.service;

import com.example.seu.mapper.TrainingMapper;
import com.example.seu.pojo.Training;
import com.example.seu.pojo.UpdateParam;
import com.example.seu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.List;

public class TrainingTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TrainingMapper fedTrainingMapper = sqlSession.getMapper(TrainingMapper.class);
        List<Training> fedTrainingList = fedTrainingMapper.getTrainingList();

        for (Training fedTraining : fedTrainingList){
            System.out.println(fedTraining);
        }
        sqlSession.close();
    }

    @Test
    public void getTrainingById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TrainingMapper fedTrainingMapper = sqlSession.getMapper(TrainingMapper.class);
        Training fedTraining = fedTrainingMapper.getTrainingById(1);

        System.out.println(fedTraining);
        sqlSession.close();

    }

    @Test
    public void addTraining(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TrainingMapper fedTrainingMapper = sqlSession.getMapper(TrainingMapper.class);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Training u = new Training(4,"Net","MNIST", 3, 2,df.format(System.currentTimeMillis()));
        Training G = fedTrainingMapper.getTrainingById(u.getId());
        if(G==null){
            int res = fedTrainingMapper.addTraining(u);
            if (res > 0){
                System.out.println("success");
            }
            else{
                System.out.println("fail");
            }
        }
        else{
            System.out.println("fail");
        }
        sqlSession.commit();
        sqlSession.close();
    }

//    @Test
//    public void updateTraining(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TrainingMapper fedTrainingMapper = sqlSession.getMapper(TrainingMapper.class);
//
//        UpdateParam param = new UpdateParam(6,"2022-9-2 17:35:00", 0.70,0.8);
//        int res = fedTrainingMapper.updateTraining(param);
//        System.out.println(res);
//        sqlSession.commit();
//        sqlSession.close();
//    }
}
