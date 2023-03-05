package com.dorohedoro.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DIYPropertiesCondition implements Condition {
    
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String[] properties = (String[]) metadata.getAnnotationAttributes("com.dorohedoro.condition.ConditionalOnDIYProperties")
                .get("value");
        for (String property : properties) {
            if (context.getEnvironment().getProperty(property) == null) {
                return false;
            }
        }
        return true;
    }
}
