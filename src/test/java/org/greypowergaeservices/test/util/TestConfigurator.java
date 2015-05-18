package org.greypowergaeservices.test.util;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-greypowergaeservices-application-config.xml")
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class TestConfigurator {
	
//	@Test
//	public void test() {
//		
//	}
	
}
