package com.gm.controles;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ServerTimeBean {

    public String time;

    public String getTime() {
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public void updateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.time=sdf.format(new Date());
    }

}
