package FindMyTrain;

import java.time.LocalDateTime;

public class Schedule {
    private Train train;
    private Station station;
    private String arrivaltime;
    private String departuretime;
    private  Platform platform;

    public Schedule(Train train, Station station, String arrivaltime, String departuretime, Platform platform) {
        this.train = train;
        this.station = station;
        this.arrivaltime = arrivaltime;
        this.departuretime = departuretime;
        this.platform = platform;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", arrivaltime=" + arrivaltime +
                ", departuretime=" + departuretime +
                ", platform=" + platform +
                '}';
    }
}
