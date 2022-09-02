package com.example.seu.controller;

import com.example.seu.mapper.TrainingMapper;
import com.example.seu.pojo.Training;
import com.example.seu.pojo.UpdateParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainingController {
    @Autowired
    private TrainingMapper trainingMapper;

    private UpdateParam updateParam;

    @GetMapping("hello/{name}")
//    public String hello(){
//        return "hello spring boot";
//    }
    public String hello(@PathVariable("name") String name)  { return "hello "+name;}

    @GetMapping("queryTrainingList")
    public List<Training> queryTrainingList(){
        List<Training> trainingList = trainingMapper.getTrainingList();

        for(Training training:trainingList){
            System.out.println(training);
        }
        return trainingList;
    }

    @PostMapping("deleteTraining")
    public  String deleteTraining(@RequestParam("id") int id){
        int res=trainingMapper.deleteTraining(id);
        if(res>0){
            return "success";
        }
        else{
            return "fail";
        }
    }

   @PostMapping(value = "addTraining",produces = "application/json;charset=UTF-8")
    public String addTraining(@RequestBody Training training){
        int res = trainingMapper.addTraining(training);
       if(res>0){
           return "success";
       }
       else{
           return "fail";
       }
   }

   @PostMapping(value = "updateTraining",produces = "application/json;charset=UTF-8")
    public String updateTraining(@RequestBody Training t){
        System.out.println(t.toString());
        int res = trainingMapper.updateTraining(t);
        System.out.println(res);
       if(res>0){
           return "success";
       }
       else{
           return "fail";
       }
   }
}
