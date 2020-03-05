package com.restfulapi.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		this.packages("com.restfulapi.controllers");
	}
}