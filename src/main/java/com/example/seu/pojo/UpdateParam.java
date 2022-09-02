package com.example.seu.pojo;

public class UpdateParam {
    private int id;

    private String endTime;

    private double acc;

    private double loss;

    public UpdateParam(){

    }

    public UpdateParam(int id, String endTime, double acc, double loss){
        this.id = id;
        this.endTime = endTime;
        this.acc = acc;
        this.loss = loss;
    }

    @Override
    public String toString() {

        return "Update{" +
                "id=" + id +
                ", endTime='" + endTime + '\'' +
                ", acc='" + acc + '\'' +
                ", loss='" + loss + '\'' +
                '}';
    }
}
