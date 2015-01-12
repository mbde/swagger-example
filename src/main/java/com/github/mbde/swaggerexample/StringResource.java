package com.github.mbde.swaggerexample;

import javax.ws.rs.Path;

/**
 * Created by markus.decke on 12.01.15.
 */
@Path("/string")
public class StringResource {

    @Path("static")
    public Class<StaticStringResource> getStaticStringResource() {
        return StaticStringResource.class;
    }
}
