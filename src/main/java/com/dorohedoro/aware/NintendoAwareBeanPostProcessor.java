package com.dorohedoro.aware;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NintendoAwareBeanPostProcessor implements BeanPostProcessor {

    private final ConfigurableApplicationContext context;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Aware) {
            if (bean instanceof NintendoAware) {
                log.info("在自定义后处理器里,对实现了自定义Aware接口的Bean调用set()注入属性");
                ((NintendoAware) bean).setNintendo((Nintendo) context.getBean("nintendo"));
            }
        }
        return bean;
    }
}
