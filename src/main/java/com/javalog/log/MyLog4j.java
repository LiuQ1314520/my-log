package com.javalog.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog4j {

	private static Logger nlp = LoggerFactory.getLogger("nlp");

    public static void textDebug(String msg) {
        try {
            nlp.debug(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void textInfo(String msg) {
        try {
            nlp.info(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void textWarn(String msg) {
        try {
            nlp.warn(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void textError(String msg) {
        try {
            nlp.error(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void textError(String msg, Throwable t) {
        try {
            nlp.error(msg, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
