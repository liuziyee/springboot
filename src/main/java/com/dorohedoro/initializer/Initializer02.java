package com.dorohedoro.initializer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Initializer02 implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getParent() == null) {
            log.info("启动初始化器02");
            ConfigurableEnvironment environment = context.getEnvironment();
            Map<String, Object> map = new HashMap<>();
            map.put("初始化器02", "2");
            MapPropertySource source = new MapPropertySource("初始化器02", map);
            environment.getPropertySources().addLast(source);
        }
    }
}
