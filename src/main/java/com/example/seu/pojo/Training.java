package com.example.seu.pojo;

public class Training {
    private int id;

    private String startTime;

    private String endTime;

    private String dataset;

    private String model;

    private int clientNum;

    private int sampleNum;

    private double acc;

    private double loss;

    private int currentRound;

    private int totalRound;

    private String algorithm;

    public Training(){
    }

    public Training(int id, String model, String dataset, int clientNum, int sampleNum, String startTime){
        this.id = id;
        this.model = model;
        this.dataset = dataset;
        this.clientNum = clientNum;
        this.sampleNum = sampleNum;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public double getAcc() {
        return acc;
    }

    public double getLoss() {
        return loss;
    }

    public int getClientNum() {
        return clientNum;
    }

    public int getSampleNum() {
        return sampleNum;
    }

    public String getDataset() {
        return dataset;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getModel() {
        return model;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public int getTotalRound() {
        return totalRound;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", dataset='" + dataset + '\'' +
                ", clientNum='" + clientNum + '\'' +
                ", sample='" + sampleNum + '\'' +
                ", acc='" + acc + '\'' +
                ", loss='" + loss + '\'' +
                ", currentRound='" + currentRound + '\'' +
                ", totalRound='" + totalRound + '\'' +
                '}';
    }
}
