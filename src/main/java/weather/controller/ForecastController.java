package weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.api.apiHelper;
import weather.data.DailyForecast;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@RestController
public class ForecastController {
    @RequestMapping(path = "/secure/weather")
    public DailyForecast getWeather(){
        apiHelper helper = new apiHelper();
        DailyForecast myDay = helper.getWeather();
        // return myWeather
        return new apiHelper().getWeather();
    }

}
