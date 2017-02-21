package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//spring-boot-starter-jersey
import org.springframework.stereotype.Component;

@Component
@Path("/sameJSON")
public class MySpringBootApplicationController {
    @GET
    @Produces("application/json")
    public String getSameJSON() {
    	
        return "{'friends': ['Michael', 'Tom', 'Daniel', 'John', 'Nick']}";
    }
   /**
    *  public Health health() {
        return new Health("Jersey: Up and Running!");
    }
    */
}
