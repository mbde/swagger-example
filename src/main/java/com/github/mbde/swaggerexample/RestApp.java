package com.github.mbde.swaggerexample;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * Created by markus.decke on 12.01.15.
 */
public class RestApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        final HashSet<Class<?>> set = new HashSet<Class<?>>();

        set.add(StringResource.class);

        return set;
    }
}