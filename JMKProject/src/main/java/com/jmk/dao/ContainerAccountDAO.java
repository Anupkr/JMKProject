/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.dao;

import com.jmk.beans.ContainerAccount;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface ContainerAccountDAO {

    public int[] saveContainerAccount(List<ContainerAccount> containerAccountList);
}
