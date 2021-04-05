/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author seck
 */
@Named(value = "bean")
@SessionScoped
public class Bean implements Serializable {

    private DashboardModel model;

    
    

    public DashboardModel getModel() {
        return model;
    }

    /**
     * Creates a new instance of Bean
     * @param model
     */
    public void setModel(DashboardModel model) {
        this.model = model;
    }

    public Bean() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        column1.addWidget("sports");
        column1.addWidget("finance");
        column2.addWidget("lifestyle");
        column2.addWidget("weather");
        column3.addWidget("politics");
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
    }
    
    
    

    
}
