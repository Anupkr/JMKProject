package com.jmk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jmk.gui.GUIHome;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MainClass {

    static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("application.xml");
    }

    public static <T> T getBean(Class<T> classType) {
        return context.getBean(classType);
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(MainClass.class);
        logger.info("Application started looger working");

        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            java.awt.EventQueue.invokeLater(() -> {
                GUIHome dialog = new GUIHome();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }

                });
                dialog.setVisible(true);
            });
        } catch (Exception ex) {
        }
    }
}
