package weather.controller.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import weather.Repo.DailyForcastRepo;
import weather.data.Guest;

import javax.servlet.http.HttpSession;

/**
 * Created by WagnerMestrinho on 3/1/17.
 */
public class CallController {
    @RequestMapping(path = "/secure/calling", method = RequestMethod.POST)
    public String Call(HttpSession session, Model data, @RequestParam(name = "zipcode") String zipcode, @RequestParam String password) {
        Guest found = DailyForcastRepo.findByNameAndPassword(zipcode, password);
        String destinationView = "weather";
}
