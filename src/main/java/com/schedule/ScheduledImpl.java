package com.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledImpl {

	private static final Logger logger = LoggerFactory.getLogger(ScheduledImpl.class);
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 500L)
	public void reportCurrentTime1() {

		logger.info("[*** CURRENT TIME FROM FIXED RATE   : " + simpleDateFormat.format(new Date()) + " ]");
	}

	@Scheduled(fixedDelay = 1000)
	public void reportCurrentTime2() {

		logger.info("[*** CURRENT TIME FROM FIXED RATE STRING : " + simpleDateFormat.format(new Date()) + " ]");
	}

	@Scheduled(fixedDelay = 2000)
	public void reportCurrentTime3() {

		logger.info("[*** CURRENT TIME FROM FIXED DELAY  : " + simpleDateFormat.format(new Date()) + " ]");
	}

	@Scheduled(fixedDelayString = "3000")
	public void reportCurrentTime4() {

		logger.info("[*** CURRENT TIME FROM FIXED DELAY STRING : " + simpleDateFormat.format(new Date()) + " ]");
	}

	@Scheduled(cron = "* * * * * *")
	public void reportCurrentTime5() {

		logger.info("[*** CURRENT TIME FROM CRON EXECUTION : " + simpleDateFormat.format(new Date()) + " ]");
	}

}
