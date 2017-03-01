package weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import weather.Repo.GuestRepo;
import weather.data.Guest;

import javax.servlet.http.HttpSession;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@Controller
public class GuestController {
    @Autowired
    GuestRepo guestRepo;

    @RequestMapping(path = "/open/authenticate", method = RequestMethod.POST)
    public String login(HttpSession session, Model data, @RequestParam(name = "guest") String name, @RequestParam String password) {
        Guest found = guestRepo.findByNameAndPassword(name, password);
        String destinationView = "weather";

        if (found == null) {
            // no user found, login must fail

            destinationView = "/open/login";
            data.addAttribute("err_login_msg", "User/Pass combination not found.");
        } else {

            session.setAttribute("guest", found);
            destinationView = "redirect:/secure/weather.jsp";
        }

        return destinationView;
    }
}
