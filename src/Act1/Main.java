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
public class Main {
  
       public static void main(String[] args) {
           Notificacio n= new Notificacio();
           GestorUsuaris gu = new GestorUsuaris(); 
           
           gu.addCanviDadesContacteListener(n);
           Usuari usuario1 = new Usuari("1a","paco","paco.com","938648789");
           Usuari usuario2 = new Usuari("2a","juan","juan.com","938648789");
           Usuari usuario3 = new Usuari("3a","antonio","antonio.com","938648789");
           
           gu.afegir(usuario3);
           gu.afegir(usuario2);
           gu.afegir(usuario1);
           
           System.out.println(gu.listaUsuarios.get(usuario1.getNif()));
           System.out.println(gu.listaUsuarios.get(usuario2.getNif()));
           System.out.println(gu.listaUsuarios.get(usuario3.getNif()));
          
           Usuari usuario4 = new Usuari("1a","paco","paco.com","938675412");
           Usuari usuario5 = new Usuari("2a","juan","juanito.com","938648789");
           
           gu.actualitzar(usuario5);
           gu.actualitzar(usuario4);
           
           System.out.println(gu.listaUsuarios.get(usuario1.getNif()));
           System.out.println(gu.listaUsuarios.get(usuario2.getNif()));
           
           
       }
}
