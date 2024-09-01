package FindMyTrain;

public class Train {
    private String trainId;
    private String trainname;
    private String type;
    public Train(String trainId, String trainname, String type) {
        this.trainId = trainId;
        this.trainname = trainname;
        this.type = type;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainname='" + trainname + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
