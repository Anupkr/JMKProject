package com.jmk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jmk.gui.JMKHome;

public class Test {

    static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("com/jmk/cfg/application.xml");
    }

    public static <T> T getBean(Class<T> classType) {
        return context.getBean(classType);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                JMKHome dialog = new JMKHome();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

}
