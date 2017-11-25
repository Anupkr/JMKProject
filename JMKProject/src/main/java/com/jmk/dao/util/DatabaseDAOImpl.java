/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao.util;

import com.jmk.beans.DatabaseInfo;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author mulayam
 */
public class DatabaseDAOImpl implements DatabaseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void backupDatabase(DatabaseInfo info) {

        String command = "mysqldump --host=" + info.getHostName() + " --user=" + info.getUserName() + " --password=" + info.getPassword() + " "
                + info.getDatabaseName() + " > " + info.getPath() + "/jmk_database_backup_" + info.getDate().getTime() + ".sql";

        jdbcTemplate.execute(command);

    }

    @Override
    public boolean restoreDatabase(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
