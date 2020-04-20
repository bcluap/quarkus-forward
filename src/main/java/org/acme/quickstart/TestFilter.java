
package org.acme.quickstart;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebFilter(filterName = "Test", urlPatterns = {"/forward"})
public class TestFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(TestFilter.class);
    
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {

        String to = servletRequest.getParameter("to");
        log.info("Forwarding to [{}]", to);
        
        servletRequest.getRequestDispatcher(to).forward(servletRequest, servletResponse);
    
    }
}
