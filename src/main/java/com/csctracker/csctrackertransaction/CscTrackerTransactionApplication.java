package com.csctracker.csctrackertransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.csctracker", "com.csctracker.csctrackertransaction"})
public class CscTrackerTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CscTrackerTransactionApplication.class, args);
	}

}
