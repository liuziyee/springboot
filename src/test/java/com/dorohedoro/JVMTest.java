package com.dorohedoro;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class JVMTest {
    
    @Test
    public void hook() {
        log.info("虚拟机启动");
        Thread hook = new Thread(() -> log.info("钩子函数"));
        Runtime.getRuntime().addShutdownHook(hook);
        log.info("虚拟机关闭");
    }
}
