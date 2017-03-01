package weather.Repo;

import org.springframework.data.repository.CrudRepository;
import weather.data.Currently;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
public interface HistoryRepo extends CrudRepository<Currently, Long> {
}
