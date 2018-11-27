package com.javalog.log;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class MyLog4j {

	private static Logger nlp = Logger.getLogger("nlp");

	private final static String FQCN = MyLog4j.class.getName();
	static {
		/**读取配置文件*/
		DOMConfigurator.configure(MyLog4j.class.getResource("/log4j.xml"));
		// String log4jPath =
		// MyLog4j.class.getClassLoader().getResource("log4j.xml").getPath();
		// DOMConfigurator.configure(log4jPath);

	}

    public static void textDebug(String msg) {
        try {
            nlp.log(FQCN, Level.DEBUG, msg, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void textInfo(String msg) {
		try {
			nlp.log(FQCN, Level.INFO, msg, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void textWarn(String msg) {
		try {
			nlp.log(FQCN, Level.WARN, msg, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void textError(String msg) {
		try {
			nlp.log(FQCN, Level.ERROR, msg, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void textError(String msg, Throwable t) {
		try {
			nlp.log(FQCN, Level.ERROR, msg, t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static void textFatal(String msg) {
        try {
            nlp.log(FQCN, Level.FATAL, msg, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void textFatal(String msg, Throwable t) {
		try {
			nlp.log(FQCN, Level.FATAL, msg, t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
