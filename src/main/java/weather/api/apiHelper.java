package weather.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import weather.data.DailyForecast;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
public class apiHelper {
    public DailyForecast getWeather() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);

        HttpEntity response = restTemplate.exchange("https://api.darksky.net/forecast/9b081b12f8221eb7e03d9eb6bd457b9a/37.8267,-122.4233", HttpMethod.GET, entity, DailyForecast.class);
        DailyForecast myDay = (DailyForecast) response.getBody();
        return myDay;
    }
}
