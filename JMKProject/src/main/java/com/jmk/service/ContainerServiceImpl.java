package com.jmk.service;

import com.jmk.beans.Container;
import com.jmk.dao.ContainerDAO;
import com.jmk.util.StatusMessage;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author anup
 */
public class ContainerServiceImpl implements ContainerService
{

    @Autowired
    private ContainerDAO containerDAO;
    @Override
    public String createContainer(Container container)
    {
            System.out.print("5");

        JOptionPane.showMessageDialog(null, container.getName());
        String message = StatusMessage.STATUS_FAILED;
        if (container != null)
        {
            try
            {
                Integer containerId = containerDAO.createContainer(container);
                if (containerId != null && containerId > 0)
                {
                    message = "Container Succsessfully Added";
                } else
                {
                    message = "Container Could not add, please Try Again";
                }
            } catch (Exception e)
            {
                message="Container Creation Failed, please try again";
            }

        } else
        {
            message = "Container Creation Failed, please Try Again";
        }

        return message;
    }

    @Override
    public List<Container> getAllContainer()
    {
        return null;
    }

}
