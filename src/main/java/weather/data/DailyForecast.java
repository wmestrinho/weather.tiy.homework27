package weather.data;

import javax.persistence.*;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@Entity
public class DailyForecast {
    @Id
    @GeneratedValue
    private long id;
    private Double latitude;
    private Double longitude;
    @OneToOne(cascade = CascadeType.ALL)
    private Currently currently;

    public DailyForecast() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Currently getCurrently() {
        return currently;
    }

    public void setCurrently(Currently currently) {
        this.currently = currently;
    }
}