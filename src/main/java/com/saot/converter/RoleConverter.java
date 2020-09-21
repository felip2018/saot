package com.saot.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("roleConverter")
public class RoleConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String role = "";
        if(value != null){
            int idRole = (int) value;
            
            switch(idRole){
                case 1:
                    role = "AGENTE CENTRO DE CONTROL";
                    break;
                case 2:
                    role = "LIDER DE CUADRILLA";
                    break;
                case 3:
                    role = "AGENTE DE LOGISTICA";
                    break;
            }
            
        }
        return role;
    }
}
