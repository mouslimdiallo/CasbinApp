package com.gandalsmart.Enforcer;

import com.gandalsmart.Main;
import java.lang.String.*;

public class Enforcer{

    Enforcer e;
    private String obj;
    private String sub;
    private String act;
    public String envi;

    public Enforcer() {
        e = new Enforcer("App_model.conf", "App_policy.csv");
        e.loadPolicy();
    }

    private void loadPolicy() {
        super();
        this.sub = sub;
        this.obj = obj;
        this.act = act;
        this.envi = envi;

    }
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getAct() {
        return act;
    }

    public String getEvi()
    {
        return envi;
    }

    public static <Envi> boolean CompareTemps(Envi, envi){

        boolean b = envi.time.getHour() >= 7 && envi.time.getHour() <= 20;
        return b;
    }
}



