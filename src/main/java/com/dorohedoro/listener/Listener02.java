package com.dorohedoro.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class Listener02 implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            // 根容器
            log.info("已触发监听器02");
        }
    }
}
