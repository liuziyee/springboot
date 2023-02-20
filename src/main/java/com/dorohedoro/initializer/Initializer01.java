package com.dorohedoro.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@Order(-1)
public class Initializer01 implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getParent() == null) {
            log.info("启动初始化器01");
            ConfigurableEnvironment environment = context.getEnvironment();
            environment.setRequiredProperties("dorohedoro");
            //Map<String, Object> map = new HashMap<>();
            //map.put("初始化器01", "1");
            //MapPropertySource source = new MapPropertySource("初始化器01", map);
            //environment.getPropertySources().addLast(source);
        }
    }
}