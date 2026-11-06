package dev.chumakov.training_log;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TrainingLogApplicationTests {

	@Test
	void contextLoads() {
	}

}
