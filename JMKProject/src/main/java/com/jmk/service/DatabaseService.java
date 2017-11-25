/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.DatabaseInfo;

/**
 *
 * @author mulayam
 */
public interface DatabaseService {

    public String backupDatabase(DatabaseInfo databaseInfo);

}
