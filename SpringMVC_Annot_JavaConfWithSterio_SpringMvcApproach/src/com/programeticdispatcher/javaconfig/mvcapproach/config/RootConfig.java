package com.programeticdispatcher.javaconfig.mvcapproach.config;

import org.springframework.context.annotation.Configuration;

/*This class is used to configure Rest of the components in IOC Container 
* like DAO DTO Service e.t.c*/

@Configuration
public class RootConfig {
   public RootConfig() {
	   System.out.println("inside RootConfig class constructor");
}
}
