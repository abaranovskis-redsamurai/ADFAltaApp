package com.redsamurai.view.beans;

import com.redsamurai.view.utils.ADFUtils;

import javax.faces.event.ActionEvent;

import oracle.binding.OperationBinding;

public class EmployeesTable {
    public EmployeesTable() {
        super();
    }

    public void testCallListener(ActionEvent actionEvent) {
        OperationBinding ob = ADFUtils.findOperation("testCall");
        ob.execute();
        
        String firstName = (String) ADFUtils.getBoundAttributeValue("FirstName");
        System.out.println(firstName);
        ADFUtils.setBoundAttributeValue("FirstName", firstName + "ABC");
    }
}
