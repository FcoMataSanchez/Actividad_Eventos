/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1;

/**
 *
 * @author alumneDAM
 */
public class Usuari {
   String nif,nom,comptCorreu,telefono;

    public Usuari(String nif, String nom, String comptCorreu, String telefono) {
        this.nif = nif;
        this.nom = nom;
        this.comptCorreu = comptCorreu;
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public String getComptCorreu() {
        return comptCorreu;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setComptCorreu(String comptCorreu) {
        this.comptCorreu = comptCorreu;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuari:" + "nif=" + nif + ", nom=" + nom + ", comptCorreu=" + comptCorreu + ", telefono=" + telefono;
    }
   
   
}
