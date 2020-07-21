package com;

 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.SubstractionService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestSubstractionService {
	
	SubstractionService substractionService = new SubstractionService();
	
	@Test
	public void testSub() {
		
		Assertions.assertEquals(100, substractionService.substract());
	}
	
	
 
	@Test
	public void testSubFail() {
		
		Assertions.assertEquals(300, substractionService.substract());
	}
	
	@Test
	public void testSub1() {
		
		Assertions.assertNotNull(substractionService.substract());
	}
	 
	
	
	
	@Test
	public void testDivide() {
		Assertions.assertEquals(100, substractionService.divide());
		

	}
 
	@Test
	public void testDivideFail() {
		Assertions.assertEquals(200, substractionService.divide());
		

	}
 
}