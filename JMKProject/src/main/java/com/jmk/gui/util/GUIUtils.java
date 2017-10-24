/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.gui.util;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 * This class provide the common feature
 *
 * @author mulayam
 */
public class GUIUtils {

    public static void showErrorMessage(JComponent component, String message) {
        JOptionPane.showMessageDialog(component, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void showSuccessMessage(JComponent component, String message) {
        JOptionPane.showMessageDialog(component, message, "Success", JOptionPane.INFORMATION_MESSAGE);

    }

}
