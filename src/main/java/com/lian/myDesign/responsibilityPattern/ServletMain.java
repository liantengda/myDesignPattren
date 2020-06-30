package com.lian.myDesign.responsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/6/30 9:51
 */
public class ServletMain {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "request";
        Response response = new Response();
        response.str = "response";

        ServletFilterChain filterChain = new ServletFilterChain();
        filterChain.add((request1,response1,filterChain1)->{
            request1.str = request1.str.replace("r","g");
            filterChain1.doFilter(request1,response1);
            response1.str = response1.str + "1";
        }).add((request1,response1,filterChain1)->{
            request1.str = request1.str.replace("e","a");
            filterChain1.doFilter(request1,response1);
            response1.str = response1.str + "2";
        });

        filterChain.doFilter(request,response);
        System.out.println(request.str+"======="+response.str);
    }

}

class Request{
    public String str;
}
class Response{
    public String str;
}

interface ServletFilter{
    void doFilter(Request request,Response response,ServletFilterChain filterChain);
}

class ServletFilterChain{
    List<ServletFilter> filters = new ArrayList<>();

    int index = 0;

    ServletFilterChain add(ServletFilter filter){
        filters.add(filter);
        return this;
    }

    void doFilter(Request request,Response response){
        if(index<filters.size()){
            ServletFilter filter = filters.get(index++);
            filter.doFilter(request,response,this);
        }else {
            return;
        }

    }
}

