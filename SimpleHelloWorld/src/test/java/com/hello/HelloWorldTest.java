package com.hello;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hello.HelloWorld;
public class HelloWorldTest {
	@Test
	public void testBuildName() {
		assertNotNull(HelloWorld.buildName("Alok"));	
	}

}