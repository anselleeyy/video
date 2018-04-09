package testPackage;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration(locations = { "classpath:spring/spring-service.xml" })
public class TestJunit5 {
	
	
	
	@Test
	public void test1() {
		
		
		
	}

}
