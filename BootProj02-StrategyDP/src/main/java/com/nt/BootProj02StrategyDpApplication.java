package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02StrategyDpApplication {

	//private static final Class<?> BootProj02StrategyDpApplication = null;

	public static void main(String[] args) {
		//SpringApplication.run(BootProj02StrategyDpApplication.class, args);
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj02StrategyDpApplication.class,args);
		//get target springbean class obj
		Vehicle  vehicle=ctx.getBean(Vehicle.class);
		//invoke the bean method
		vehicle.move("Hyderabad", "Goa");
		
		((ConfigurableApplicationContext) ctx).close();
	}
}




