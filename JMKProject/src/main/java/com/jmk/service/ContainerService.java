package com.jmk.service;

import com.jmk.beans.Container;
import java.util.List;

/**
 *
 * @author anup
 */
public interface ContainerService {

    /**
     *
     * @param container
     * @return
     */
    public String createContainer(Container container);

    /**
     * @return
     */
    public List<Container> getAllContainer();
}
