package com.idoctors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.idoctors.DoctorServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DoctorServiceApplication.class)
@WebAppConfiguration
public class DoctorServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
