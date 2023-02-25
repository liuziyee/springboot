package com.dorohedoro.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
public class CommandlineRunner01 implements CommandLineRunner {
    
    @Override
    public void run(String... args) {
        log.info("\u001B[32mstartup commandlinerunner01");
    }
}
