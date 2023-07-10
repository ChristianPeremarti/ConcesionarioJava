package com.devpere.automovil.logica;

import com.devpere.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    // Instancio a la controladora de la persistencia para poder enviarle información
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    

    //recibo la información de la interfaz gráfica
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
     // Creo un nuevo automóvil antes de guardarlo en la persistencia
     
     Automovil auto = new Automovil();
     
     auto.setModelo(modelo);
     auto.setMarca(marca);
     auto.setMotor(motor);
     auto.setColor(color);
     auto.setPatente(patente);
     auto.setCantPuertas(cantPuertas);
        
    // A través de método agregarAutomovil le paso los parámetros a la persistencia que quiero agregar
    // a la base de datos. En vez de pasarle todos los parámetros, solo le paso el objeto auto
    
    controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        
        //Le digo a la persistencia que borre en la tabla el auto con determinado ID
        controlPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        //le pido a la persistencia que modifique el auto
        controlPersis.modificarAuto(auto);
    }



}
