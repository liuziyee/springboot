package com.dorohedoro.condition;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnDIYProperties({"nintendo", "nissin"})
public class Bandai {
}
