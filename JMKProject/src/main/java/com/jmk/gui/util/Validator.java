/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.gui.util;

/**
 *
 * @author mulayam
 */
public class Validator {

    public static boolean isValidMobile(String mobile) {
        if (mobile != null && mobile.trim().length() == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidName(String name) {
        if (name != null && name.trim().length() >= 2) {
            return true;
        } else {
            return false;
        }
    }

}
