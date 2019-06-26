package org.craztit.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(ServerApp.class).web(WebApplicationType.SERVLET).run(args);

	}

}
