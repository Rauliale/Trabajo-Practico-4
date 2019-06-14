
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="productores")
public class Productor extends Persona{
    private double cantHectarea;

    
    @ManyToMany
    private List<Servicio> servicios;
    
    @OneToMany
    private List<ServicioTerminado> serviciosTerminados;
    
    @OneToMany
    private List<ServicioCancelado> serviciosCancelados;
    
    
    
    
    public Productor() {
        this.servicios = new ArrayList<>();
        this.serviciosCancelados = new ArrayList<>();
        this.serviciosTerminados = new ArrayList<>();
    }
    
    
}
