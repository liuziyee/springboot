package com.dorohedoro.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
public class ApplicationRunner01 implements ApplicationRunner {
    
    @Override
    public void run(ApplicationArguments args) {
        log.info("\u001B[32mstartup applicationrunner01");
    }
}