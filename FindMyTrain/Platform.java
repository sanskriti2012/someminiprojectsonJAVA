package FindMyTrain;

public class Platform {
    private int platformnumer;
    private  Train train;

    public Platform(int platformnumer) {
        this.platformnumer = platformnumer;
    }

    public int getPlatformnumer() {
        return platformnumer;
    }

    public void setPlatformnumer(int platformnumer) {
        this.platformnumer = platformnumer;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformnumer=" + platformnumer +
                ", train=" + train +
                '}';
    }
}
