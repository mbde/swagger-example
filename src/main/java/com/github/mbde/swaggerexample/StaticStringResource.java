package com.github.mbde.swaggerexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Created by markus.decke on 12.01.15.
 */
@Api(value ="/string/static")
public class StaticStringResource {

    @ApiOperation( value ="hello world")
    @GET
    @Path("/hello")
    public String getStaticHelloWorld(){
        return "Hello World";
    }


    @ApiOperation( value ="identity function")
    @GET
    @Path("{string}")
    public String getStatic(@PathParam("string") String string){
        return string;
    }



}
