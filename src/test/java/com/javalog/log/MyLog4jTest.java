package com.javalog.log;

import org.junit.Test;

public class MyLog4jTest {

    @Test
    public void testTextInfo() {
        MyLog4j.textInfo("info message");
    }

    @Test
    public void testTextError() {
        MyLog4j.textError("error message");
    }

}