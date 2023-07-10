package com.devpere.automovil;

import com.devpere.automovil.Igu.Principal;

/**
 *
 * @author cperemarti
 */
public class Automovil {

    public static void main(String[] args) {
        // Para llamar a la interface gráfica la instancio desde la lógica
        // Al objeto princ se le asigna el JFrame Principal
        Principal princ = new Principal();
        
        // Para que se vea la interfaz gráfica
        princ.setVisible(true);
        
        //Para que la interfaz aparezca centrada
        princ.setLocationRelativeTo(null);
        
    }
}
