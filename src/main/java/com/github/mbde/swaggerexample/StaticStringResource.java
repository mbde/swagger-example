package com.github.mbde.swaggerexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by markus.decke on 12.01.15.
 */

public class StaticStringResource {

    @GET
    @Path("/hello")
    public String getStaticHelloWorld(){
        return "Hello World";
    }


    @GET
    @Path("{string}")
    public String getStatic(@PathParam("string") String string){
        return string;
    }



}
