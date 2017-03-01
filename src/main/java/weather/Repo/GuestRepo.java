package weather.Repo;

import org.springframework.data.repository.CrudRepository;
import weather.data.Guest;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
    public interface GuestRepo extends CrudRepository<Guest, Long> {
        public Guest findByNameAndPassword(String name, String password);
}
