package weather.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import weather.data.DailyForecast;
import static java.lang.String.format;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
public class apiHelper {
    public DailyForecast getWeather(String latitude, String longitude) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("weather", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

        HttpEntity entity = new HttpEntity(headers);
        String url = format("https://api.darksky.net/forecast/9b081b12f8221eb7e03d9eb6bd457b9a/%s,%s", longitude, latitude);
        HttpEntity response = restTemplate.exchange(url, HttpMethod.GET, entity, DailyForecast.class);
        DailyForecast myDay = (DailyForecast) response.getBody();
        return myDay;
    }
}
