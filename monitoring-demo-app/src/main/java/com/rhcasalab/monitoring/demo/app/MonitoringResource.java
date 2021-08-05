package com.rhcasalab.monitoring.demo.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import io.micrometer.core.instrument.MeterRegistry;

@Path("/monitoring-demo-app")
public class MonitoringResource {

    @Inject
    MeterRegistry registry;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        registry.counter("greeting_counter").increment();

        return "Hello RESTEasy";
    }
}