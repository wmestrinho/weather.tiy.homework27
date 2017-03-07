package weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import weather.Repo.DailyForecastRepo;
import weather.Repo.GuestRepo;
import weather.api.apiHelper;
import weather.data.DailyForecast;
import weather.data.Guest;

import javax.servlet.http.HttpSession;

/**
 * Created by WagnerMestrinho on 3/1/17.
 */
@Controller
public class CallController {

   @Autowired
   DailyForecastRepo dailyForecastRepo;

   @Autowired
   GuestRepo guestRepo;


    @RequestMapping(path = "/secure/calling", method = RequestMethod.POST)
    public String Call(HttpSession session,
                              @RequestParam String latitude,
                              @RequestParam String longitude) {
        apiHelper method = new apiHelper();
        DailyForecast newResquest = method.getWeather(latitude, longitude);

        Object userAsObject = session.getAttribute("guest");

        Guest guest = (Guest) userAsObject;
        String userName = guest.getName();

        guest = guestRepo.findOne(guest.getId());
        guest.getDailyForecasts().add(newResquest);
        newResquest.setGuest(guest);
        dailyForecastRepo.save(newResquest);

        guestRepo.save(guest);
        return "redirect:/secure/history";
    }
    @RequestMapping(path = "/secure/history")
    public String currentWeather(HttpSession session,
                                 @RequestParam(value = "page", required = false) Integer page,
                               @RequestParam(value = "size", required = false) Integer size,
                               Model model) {

        String destination = "/secure/history";
        if (page == null) {
            page = 0;
        }
        if (size == null) {
            size = 2;
        }
        Sort s = new Sort(Sort.Direction.DESC, "currently");
        PageRequest pr = new PageRequest(page, size, s);


        Object userAsObject = session.getAttribute("guest");
        Guest guest = (Guest) userAsObject;
        Page<DailyForecast> found = dailyForecastRepo.ForecastByUser(guest.getId(),pr);
        // put list into model
        session.setAttribute("mList", found);
        //model.addAttribute("mList", found);
        // go to jsp
        return destination;
    }
}