/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author mulayam
 */
public class AmmountFormater {
 
    public static String formateDoubleToString(Double amount){
            return new DecimalFormat("0").format(amount);
    }
}
