package com.example.htest;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledTasks {
    @Autowired
    RestGetService restGetService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    // https://www.freeformatter.com/cron-expression-generator-quartz.html
    //   @Scheduled(fixedRate = 5000)
   // @Scheduled(cron = "0 * 10 ? * * ")
 //   @Scheduled(cron = "0 0 7 * * ?") // 7 час
 //   @Scheduled(cron = "0 */2 * ? * *") // 2 мин
    public void reportCurrentTime() throws Exception {
        Long start = System.currentTimeMillis();
        restGetService.chk();
        restGetService.chk2();

        log.debug("all time {}ms", System.currentTimeMillis() - start);
        LOGGER.info("Fixed Rate Task :: Execution Time - {}", dateFormat.format(LocalDateTime.now()));

    }
}