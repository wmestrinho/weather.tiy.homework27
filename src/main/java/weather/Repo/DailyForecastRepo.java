package weather.Repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import weather.data.DailyForecast;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
public interface DailyForecastRepo extends PagingAndSortingRepository<DailyForecast, Long> {
    @Query("select u from DailyForecast u where u.guest.id=?1")
    public Page<DailyForecast> ForecastByUser (Long userId, Pageable pageable);
}
