package dev.chumakov.training_log;

import org.springframework.boot.SpringApplication;

public class TestTrainingLogApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrainingLogApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
