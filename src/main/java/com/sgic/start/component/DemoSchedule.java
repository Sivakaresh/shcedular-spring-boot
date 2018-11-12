package com.sgic.start.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoSchedule {

	@Scheduled(cron="20 16 20 * * *")
	public void task() {
		System.out.println("spring boot Schedule");
	}
}
