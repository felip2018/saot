package com.saot.ejb;

import com.saot.model.OrdenTrabajo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrdenTrabajoFacadeLocal {

    void create(OrdenTrabajo ordenTrabajo);

    void edit(OrdenTrabajo ordenTrabajo);

    void remove(OrdenTrabajo ordenTrabajo);

    OrdenTrabajo find(Object id);

    List<OrdenTrabajo> findAll();

    List<OrdenTrabajo> findRange(int[] range);

    int count();
    
}
