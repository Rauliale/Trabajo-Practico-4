
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="prestadores")
public class Prestador extends Persona{
    private int zonaServicio;
    @OneToMany
    private List<TipoServicio> tipoServicios;
    
    @ManyToMany(mappedBy = "prestadores")
    private List<ServicioCancelado> serviciosCancelados;
   
    @ManyToMany(mappedBy = "prestadores")
    private List<ServicioTerminado> serviciosTerminados;
    
    @ManyToMany
    private List<Zona> zonas;
    

    public Prestador() {					// constructor 
        this.serviciosCancelados = new ArrayList<>();
        this.serviciosTerminados = new ArrayList<>();
        this.tipoServicios = new ArrayList<>();
        this.zonas = new ArrayList<>();


        
    }

    
    
    
    
}
