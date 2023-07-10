package com.devpere.automovil.persistencia;

import com.devpere.automovil.logica.Automovil;
import com.devpere.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cperemarti
 */
public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        
        // Le paso el objeto auto para que se cree en la bae de datos
        autoJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        
        // Trae todos los registros de la tabla autos que está en la base de datos
        return autoJpa.findAutomovilEntities();
        
    }

    public void borrarAuto(int idAuto) {
        
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
