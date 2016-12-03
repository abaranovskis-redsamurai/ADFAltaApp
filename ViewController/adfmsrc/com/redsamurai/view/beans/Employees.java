package com.redsamurai.view.beans;

import com.redsamurai.view.common.WorkbetterBaseBean;

import java.util.Map;

import oracle.adf.share.logging.ADFLogger;
import oracle.adf.view.rich.render.ClientEvent;

public class Employees extends WorkbetterBaseBean {
    private static ADFLogger _logger = ADFLogger.createADFLogger(Employees.class);
    private static final String HIDDEN_NAV_BUTTON = "h_navb2";
    
    public Employees() {
        super();
    }

    public void doEditPerson(ClientEvent clientEvent) {
        if (!queueActionOnCommandComponmentById(HIDDEN_NAV_BUTTON)) {
            _logger.severe("Error: unable to locate hidden havigation component " + HIDDEN_NAV_BUTTON);
        }
    }
}
