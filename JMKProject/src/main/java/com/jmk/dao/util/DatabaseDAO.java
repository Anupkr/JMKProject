/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao.util;

import com.jmk.beans.DatabaseInfo;

/**
 *
 * @author mulayam
 */
public interface DatabaseDAO {

    public void backupDatabase(DatabaseInfo databaseInfo);

    public boolean restoreDatabase(String filePath);

}
