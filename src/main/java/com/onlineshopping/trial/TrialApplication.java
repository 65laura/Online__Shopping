package com.onlineshopping.trial;
import com.onlineshopping.trial.enums.OrderEvents;
import com.onlineshopping.trial.enums.OrderStates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class TrialApplication implements CommandLineRunner {

@Autowired
private StateMachine<OrderStates,OrderEvents> stateMachine;
	public static void main(String[] args) {

		SpringApplication.run(TrialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		stateMachine.sendEvent(OrderEvents.FULFILL);
		stateMachine.sendEvent(OrderEvents.PAID);

	}
}

