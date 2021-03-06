package com.hxkj.common.slf4j;

import com.jfinal.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统一项目的日志工具（虽然项目还是使用log4j)
 * jfinal 框架 内部日志 工具使用 slf4j
 */
public class Slf4jLog extends Log {
    private Logger log;

    Slf4jLog(Class<?> clazz) {
        log = LoggerFactory.getLogger(clazz);
    }

    Slf4jLog(String name) {
        log = LoggerFactory.getLogger(name);
    }


    public void info(String message) {
        log.info(message);
    }

    public void info(String message, Throwable t) {
        log.info(message, t);
    }

    public void debug(String message) {
        log.debug(message);
    }

    public void debug(String message, Throwable t) {
        log.debug(message, t);
    }

    public void warn(String message) {
        log.warn(message);
    }

    public void warn(String message, Throwable t) {
        log.warn(message, t);
    }

    public void error(String message) {
        log.error(message);
    }

    public void error(String message, Throwable t) {
        log.error(message, t);
    }

    public void fatal(String message) {
        log.error(message);
    }

    public void fatal(String message, Throwable t) {
        log.error(message, t);
    }

    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    public boolean isFatalEnabled() {
        return log.isErrorEnabled();
    }
}