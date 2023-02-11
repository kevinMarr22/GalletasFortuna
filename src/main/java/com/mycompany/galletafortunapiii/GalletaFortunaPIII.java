/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.galletafortunapiii;

import java.util.ArrayList;
public class GalletaFortunaPIII {
      public static void main(String[] args) {
        
        //crea nuestra lista
        ArrayList fortuna = new ArrayList();
        
        //la fortuna que te puede tocar
        fortuna.add("manten tu mente abierta a nuevas experiencias");
        
        fortuna.add("no dejes de perseguir tus sueños");
        
        fortuna.add("cuida tus abitos");
        
        fortuna.add("tu fin se acerca");
        
        
        //la funcion que elige la fortuna aleatoriamente
        int f = (int) (Math.random() *4);
        
        //imprime nuestra suerte
        System.out.println("Tu fortuna dice: "+fortuna.get(f));
     }
    
}
