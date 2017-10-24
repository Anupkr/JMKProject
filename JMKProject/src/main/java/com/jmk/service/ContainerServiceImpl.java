package com.jmk.service;

import com.jmk.beans.Container;
import com.jmk.dao.ContainerDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 *
 * @author anup
 */
@Service
public class ContainerServiceImpl implements ContainerService {

    @Autowired
    private ContainerDAO containerDAO;

    @Override
    public String createContainer(Container container) {

        String message;
        if (container != null && container.getName().trim().length() > 0) {
            try {
                Integer containerId = containerDAO.createContainer(container);
                if (containerId != null && containerId > 0) {
                    message = StatusMessage.STATUS_SUCCESS;
                } else {
                    message = "Container Could not add, please Try Again";
                }

            } catch (DuplicateKeyException ex) {
                message = container.getName() + " already exists";
            } catch (Exception e) {
                System.out.println(e);
                message = "Container Creation Failed, please try again";
            }

        } else {
            message = "Container Creation Failed, please Try Again";
        }

        return message;
    }

    @Override
    public List<Container> getAllContainer() {
        return containerDAO.getAllContainer();
    }

}
