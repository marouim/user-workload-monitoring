package com.rhcasalab.monitoring.demo.app;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;
import io.micrometer.core.instrument.MeterRegistry;

@Path("/")
public class ReceiveMessage {

    @Inject
    MeterRegistry registry;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        registry.counter("nombre_message_de_kafka").increment();

        return "Increment nombre_message_de_kafka metric";
    }
}