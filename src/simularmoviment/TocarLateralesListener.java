/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simularmoviment;

import java.util.EventListener;

/**
 *
 * @author paco
 */
public interface TocarLateralesListener extends EventListener {
    
    public void modificarColor(TocarLateralesEvent e);
}
