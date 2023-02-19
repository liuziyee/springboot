package com.dorohedoro;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class InitializerTest {

    @Resource
    private ApplicationContext context;
    
    @Test
    public void getEnv() {
        log.info(context.getEnvironment().getProperty("初始化器02"));
    }
}
