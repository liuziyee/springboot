package com.dorohedoro.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

@Slf4j
@Order(1)
public class Listener03 implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationStartedEvent.class.isAssignableFrom(eventType) ||
                ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationStartedEvent) {
            if (((ApplicationStartedEvent) event).getApplicationContext().getParent() == null) {
                log.info("已触发监听器03,触发事件为: {}", event.toString());
            }
        }
        if (event instanceof ApplicationPreparedEvent) {
            if (((ApplicationPreparedEvent) event).getApplicationContext().getParent() == null) {
                log.info("已触发监听器03,触发事件为: {}", event.toString());
            }
        }
    }
}
