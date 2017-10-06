package com.jmk.dao;

import java.util.List;

import com.jmk.beans.Container;
import com.jmk.beans.ContainerAccount;
import com.jmk.beans.DueContainer;
import com.jmk.beans.Item;

/**
 *
 * @author mulayam
 *
 */
public interface ContainerDAO {

    public Integer createContainer(Container container);

    /**
     * Update existing container
     *
     * @param container
     * @return If successfully updated then return 1 otherwise null
     */
    public Integer editContainer(Container container);

    /**
     * Get All Container List
     *
     * @return List of all container
     */
    public List<Container> getAllContainer();

    /**
     * GEt Container by id
     *
     * @param id
     * @return
     */
    public Container getContainer(Integer containerId);

    /**
     * Get Container By name
     *
     * @param name
     * @return
     */
    public Container getContainer(String name);

   
}
