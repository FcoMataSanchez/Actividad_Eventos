/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumneDAM
 */
public class Notificacio implements CanviDadesContacteListener {
    List<Usuari> listaUsuariosModificados = new ArrayList();
    
     
    @Override
    public void canviCompte(Usuari usuario,CanviDadesContacteEvent e) {
       
        listaUsuariosModificados.add(usuario);
        
    }

    @Override
    public void canviTelefon(Usuari usuario,CanviDadesContacteEvent e) {
       
        listaUsuariosModificados.add(usuario);
    }
    
    
}
