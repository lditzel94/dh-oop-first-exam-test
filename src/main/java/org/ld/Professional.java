package org.ld;

import java.util.Date;

public class Professional extends Scooter implements Comparable {
    private int repairs;
    private String description;

    public Professional( Date entryToRepair, Date limitToRepair, Date startOfRepair,
                         Date endOfRepair, String status ) {
        super( entryToRepair, limitToRepair, startOfRepair, endOfRepair, status );
    }

    public int currentRepair() {
        return repairs + 1;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo( Object o ) {
        return this.repairs - ( ( Professional ) o ).repairs;
    }
}
