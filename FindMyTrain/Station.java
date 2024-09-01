package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private String stationName;
    private List<Platform> platformList;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName=" + stationName +
                ", platformList=" + platformList +
                '}';
    }
}
