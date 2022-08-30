package org.ld;

import java.util.Date;

public class Scooter {
    protected Technician technician = null;
    protected Date entryToRepair;
    protected Date limitToRepair;
    protected Date startOfRepair;
    protected Date endOfRepair;
    protected String status;

    public Scooter( Date entryToRepair, Date limitToRepair, Date startOfRepair, Date endOfRepair, String status ) {
        this.entryToRepair = entryToRepair;
        this.limitToRepair = limitToRepair;
        this.startOfRepair = startOfRepair;
        this.endOfRepair = endOfRepair;
        this.status = status;
    }

    public void setTechnician( Technician technician ) {
        this.technician = technician;
    }

    public boolean repairedOnTime() {
        return ( endOfRepair == limitToRepair ) && status.equals( "Reparado" );
    }
}
