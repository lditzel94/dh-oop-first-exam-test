package org.ld;

public class Technician {

    private String firstName;
    private String lastName;
    private String dni;
    private String file;

    public Technician( String firstName, String lastName, String dni, String file ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.file = file;
    }

    public Technician( String lastName, String dni ) {
        this.lastName = lastName;
        this.dni = dni;
    }
}
