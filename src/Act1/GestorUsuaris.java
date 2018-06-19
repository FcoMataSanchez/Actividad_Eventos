/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
    import java.util.Map;

/**
 *
 * @author alumneDAM
 */
public class GestorUsuaris {
    
    Map<String,Usuari> listaUsuarios = new HashMap();
    List<CanviDadesContacteListener> oients = new ArrayList();

    
    
    public void afegir(Usuari u) {
        listaUsuarios.put(u.getNif(), u);
    }
    
    public void actualitzar(Usuari u){
        
        Usuari usuari = listaUsuarios.get(u.getNif());
         
        if(listaUsuarios.get(u.getNif()).getComptCorreu().equals(usuari.getComptCorreu())){
            usuari.setComptCorreu(u.getComptCorreu());
            System.out.println("Correo modificado");
            for (CanviDadesContacteListener oient : oients) {
                oient.canviCompte(usuari, new CanviDadesContacteEvent(this));
            }
            
      }
        if(listaUsuarios.get(u.getNif()).getTelefono().equals(usuari.getTelefono())){
          usuari.setTelefono(u.getTelefono());
            System.out.println("Telefono modificado");
            for (CanviDadesContacteListener oient : oients) {
                oient.canviCompte(usuari, new CanviDadesContacteEvent(this));
            }
      }
        
      
    }
    
     public void addCanviDadesContacteListener(CanviDadesContacteListener o) {
        oients.add(o);
    }
     
}
