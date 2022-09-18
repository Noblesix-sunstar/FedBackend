package com.example.seu.mapper;
import com.example.seu.pojo.Training;
import com.example.seu.pojo.UpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainingMapper {
    List<Training> getTrainingList();
    List<Training> getTrainList();
    List<Training> getNotTrainList();
    Training getTrainingById(int id);
//    查

    int addTraining(Training training);
    int addFedNotTrain(Training training);
    int addFedTrain(Training training);
//    增

    int updateTraining(Training t);
//    改

    int deleteFedNotTrain(int id);
    int deleteFedTrain(int id);
    int deleteTraining(int id);
//    删
}
