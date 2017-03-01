package weather.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@Entity
public class Currently {
    @Id
    @GeneratedValue
    private long id;
    private String summary;
    private long temperature;
    private double humidity;
    private int preciprobability;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getPreciprobability() {
        return preciprobability;
    }

    public void setPreciprobability(int preciprobability) {
        this.preciprobability = preciprobability;
    }
}
