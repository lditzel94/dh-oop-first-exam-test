package org.ld;

import java.util.Date;
import java.util.List;

public class Beginner extends Scooter implements Status {
    private final List<String> stages = List.of( "Dañado", "Reparando", "Reparado", "En espera", "Sin Repuesto" );

    public Beginner( Date entryToRepair, Date limitToRepair, Date startOfRepair,
                     Date endOfRepair, String status ) {
        super( entryToRepair, limitToRepair, startOfRepair, endOfRepair, status );
    }

    public boolean isWaiting() {
        return status.equals( "En espera" );
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean isValidStatus() {
        return stages.contains( status );
    }
}
