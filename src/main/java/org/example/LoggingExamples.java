package org.example;

import java.util.logging.*;

public class LoggingExamples {
//    private static final Logger logger =
//            Logger.getLogger(LoggingExamples.class.getName());

    public static void main(String[] args) {
//        Handler handler = new ConsoleHandler();
//        logger.addHandler(handler);

        Logger logger = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("1");
        Logger logger1_2 = Logger.getLogger("1.2");

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        Formatter formatter = handler.getFormatter();

//        logger1.addHandler(new ConsoleHandler());
//        logger1_2.addHandler(new ConsoleHandler());

//        logger1.setFilter(new Filter() {
//            @Override
//            public boolean isLoggable(LogRecord record) {
//                return false;
//            }
//        });

        logger1.setLevel(Level.WARNING);
        logger1_2.setLevel(Level.INFO);

        logger.info("msg:");
        logger1.info("msg: 1");
        logger1_2.info("msg: 1.2");


    }


//    public void doIt() {
//        logger.entering(getClass().getName(), "doIt");
//
//        try {
//            String s = "sdgas";
//        } catch (Exception e) {
//            logger.log(Level.SEVERE, "Ошибка во время установления переменной", e);
//        }
//        logger.exiting(getClass().getName(), "doIt");
//    }
}

