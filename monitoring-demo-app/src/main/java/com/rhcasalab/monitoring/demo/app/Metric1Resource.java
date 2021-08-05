package com.rhcasalab.monitoring.demo.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import io.micrometer.core.instrument.MeterRegistry;

@Path("/metric1")
public class Metric1Resource {

    @Inject
    MeterRegistry registry;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        registry.counter("app_metric_perso1").increment();

        return "Increment app_metric_perso1 metric";
    }
}