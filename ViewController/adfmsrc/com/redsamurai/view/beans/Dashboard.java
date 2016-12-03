package com.redsamurai.view.beans;

import com.redsamurai.view.utils.JSFUtils;

import java.util.Map;

import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.render.ClientEvent;

public class Dashboard {
    private static final String INFOTILE_EVENT_PAYLOAD = "index";
    
    public Dashboard() {
        super();
    }
    
    public void infoTileSelectionHandler(ClientEvent clientEvent) {
        Map eventParams = clientEvent.getParameters();
        if (eventParams.containsKey(INFOTILE_EVENT_PAYLOAD)){
            int selectedTile = ((Double)eventParams.get(INFOTILE_EVENT_PAYLOAD)).intValue();
            JSFUtils.setManagedBeanValue("pageFlowScope.selectedTile", selectedTile);
            AdfFacesContext.getCurrentInstance().addPartialTarget(clientEvent.getComponent());
        }
    }
}
