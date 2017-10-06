/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmk.service;

import com.jmk.beans.ContainerAccount;
import com.jmk.beans.CustomerAccount;
import com.jmk.beans.DueContainer;
import java.util.List;

/**
 *
 * @author mulayam
 */
public interface ContainerAccountService {

    public List<DueContainer> getDuesContainer(Long customerId);

    public String payContainer(CustomerAccount customerAccount, ContainerAccount containerAccount);

}
