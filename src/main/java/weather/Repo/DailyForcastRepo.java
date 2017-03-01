package weather.Repo;

import org.springframework.data.repository.CrudRepository;
import weather.data.DailyForecast;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
public interface DailyForcastRepo extends CrudRepository<DailyForecast, Long>{

}
