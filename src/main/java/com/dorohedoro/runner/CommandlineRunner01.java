package com.dorohedoro.runner;

import com.dorohedoro.aware.Nintendo;
import com.dorohedoro.aware.NintendoAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Order(1)
@Component
public class CommandlineRunner01 implements CommandLineRunner, EnvironmentAware, NintendoAware {

    private Environment env;
    private Nintendo nintendo;
    
    @Override
    public void run(String... args) {
        log.info("\u001B[32mstartup commandlinerunner01");
        log.info("nintendo: {}", env.getProperty("nintendo"));
        log.info("{}", nintendo);
    }

    @Override
    public void setEnvironment(Environment environment) {
        env = environment;
    }

    @Override
    public void setNintendo(Nintendo nintendo) {
        this.nintendo = nintendo;
    }
}
