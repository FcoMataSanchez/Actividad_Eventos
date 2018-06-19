/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1;

import java.util.EventListener;

/**
 *
 * @author alumneDAM
 */
public interface CanviDadesContacteListener extends EventListener {
    
    public void canviCompte(Usuari usuario,CanviDadesContacteEvent e);
    public void canviTelefon(Usuari usuario,CanviDadesContacteEvent e);
}
