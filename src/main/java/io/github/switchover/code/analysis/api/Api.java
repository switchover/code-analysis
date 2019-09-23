package io.github.switchover.code.analysis.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Api {
    private static final Logger logger = LogManager.getLogger(Api.class);

    public String hello() {
        logger.info("hello() called...");

        return "Hello, world!";
    }
}
