/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.DatabaseInfo;
import com.jmk.dao.util.DatabaseDAO;
import com.jmk.util.StatusMessage;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author mulayam
 */
public class DatabaseServiceImpl implements DatabaseService {

    @Autowired
    private DatabaseDAO databaseDAO;
    Logger logger = Logger.getLogger(DatabaseServiceImpl.class);

    @Override
    public String backupDatabase(DatabaseInfo databaseInfo) {
        String message;
        try {
            if (databaseInfo != null && databaseInfo.getPath().trim().length() > 0 && databaseInfo.getDatabaseName().length() > 0 && databaseInfo.getHostName().length() > 0) {
                databaseDAO.backupDatabase(databaseInfo);

                message = StatusMessage.STATUS_SUCCESS;
            } else {
                message = "Database Information required";
            }
        } catch (DataAccessException e) {
            logger.error(e.getMessage());
            message = "Somthing went wrong! Please try again";
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            message = "Somthing went wrong! Please try again";
        }
        return message;
    }

}
