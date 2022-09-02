package com.example.seu.mapper;
import com.example.seu.pojo.Training;
import com.example.seu.pojo.UpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainingMapper {
    List<Training> getTrainingList();
    Training getTrainingById(int id);
//    查

    int addTraining(Training training);
//    增

    int updateTraining(Training t);
//    改

    int deleteTraining(int id);
//    删
}
