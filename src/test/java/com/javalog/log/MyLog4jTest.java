package com.javalog.log;

import org.junit.Test;

public class MyLog4jTest {

    @Test
    public void testTextDebug() {
        MyLog4j.textDebug("debug message");
    }

    @Test
    public void testTextInfo() {
        MyLog4j.textInfo("info message");
    }

    @Test
    public void testTextWarn() {
        MyLog4j.textWarn("warn message");
    }

    @Test
    public void testTextError() {
        MyLog4j.textError("error message");
    }

    @Test
    public void testTextErrorException() {
        MyLog4j.textError("error message", new IllegalArgumentException("illegal argument exception message"));
    }

}