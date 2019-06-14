
package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class Persona {
    @Id
    private int cuit;
    private String razonSocial;
    private int numeroInym;
    private String domicilioLegal;

    public Persona() {
    }
    
    
    
}
