package com.mammutgroup.workshop.core.server.config;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AMV on 2/21/2016.
 */
public class CorsFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        if (resp instanceof HttpServletResponse) {
            HttpServletResponse response = (HttpServletResponse) resp;
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Cache-Control");
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        }
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
