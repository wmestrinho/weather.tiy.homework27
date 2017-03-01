package weather.filter;

import weather.data.Guest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WagnerMestrinho on 2/28/17.
 */
@WebFilter(filterName = "Authorize")
public class Authorize implements Filter {
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = ((HttpServletRequest) request);
        HttpServletResponse resp = ((HttpServletResponse) response);
        // check session
        Guest usr = (Guest) req.getSession().getAttribute("guest");
        boolean authorized = (usr != null);
        boolean tryingToLogin = req.getRequestURI().endsWith("/open/login.jsp")||req.getRequestURI().endsWith("authenticate");
        if(authorized || tryingToLogin) {
            chain.doFilter(request, response);
        }else{
            resp.sendRedirect("/open/login.jsp");
        }
    }


    public void init(FilterConfig config) throws ServletException {

    }
}
