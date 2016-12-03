package com.redsamurai.view.beans;

import com.redsamurai.view.utils.ADFUtils;
import com.redsamurai.view.utils.JSFUtils;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.event.SelectionEvent;

public class Countries {
    public Countries() {
        super();
    }

    public void selectCountry(SelectionEvent selectionEvent) {
        JSFUtils.invokeMethodExpression("#{bindings.CountriesView1.treeModel.makeCurrent}", Object.class, SelectionEvent.class, selectionEvent);
        Row row = ADFUtils.findIterator("CountriesView1Iterator").getCurrentRow();
        if (row != null) {
            String countryId = (String) row.getAttribute("CountryId");
            JSFUtils.setManagedBeanValue("sessionScope.countryId", countryId);
        }
    }
}
