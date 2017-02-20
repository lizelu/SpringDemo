package com.zeluli.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.zeluli.scheduled")
@EnableScheduling
public class ScheduledTaskConfig {
}
