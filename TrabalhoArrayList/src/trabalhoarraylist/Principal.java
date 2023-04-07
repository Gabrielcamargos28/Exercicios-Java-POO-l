/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoarraylist;

import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoologico ZooPatrocinio = new Zoologico();
        boolean teste;
        ArrayList auxMamiferos = new ArrayList();
        ArrayList auxPeixes = new ArrayList();
        ArrayList auxAves = new ArrayList();
        /*Mamiferos*/
        auxMamiferos.add("Macaco");
        auxMamiferos.add("Lemure");
        auxMamiferos.add("Leao");
        auxMamiferos.add("Leao");
        auxMamiferos.add("Pinguin");
        /*peixes*/
        auxPeixes.add("Tubarao");
        auxPeixes.add("Tilapia");
        auxPeixes.add("Boto");
        auxPeixes.add("Pirarucu");
        auxPeixes.add("Bagre");
        /*aves*/
        auxAves.add("Gaviao");
        auxAves.add("Pardal");
        auxAves.add("Canarinho");
        auxAves.add("Coruja");
        auxAves.add("Pica-pau");
        
        ZooPatrocinio.setMamiferos(auxMamiferos);
        ZooPatrocinio.setAves(auxAves);
        ZooPatrocinio.setPeixes(auxPeixes);
        /*quantos tem*/
        System.out.println("Animais do Zoo Patrocinio: "+(ZooPatrocinio.getAves().size()+ZooPatrocinio.getMamiferos().size()+ZooPatrocinio.getPeixes().size()));
        /*todos os animais*/
        System.out.println("Mamiferos: ");
        for(int i =0;i<auxMamiferos.size();i++){
            System.out.println(ZooPatrocinio.getAves().get(i));
        }
        
        System.out.println("-------------------------");
        System.out.println("Aves: ");
        for(int i =0;i<auxAves.size();i++){
            System.out.println(ZooPatrocinio.getAves().get(i));
        }
        System.out.println("-------------------------");
        System.out.println("Peixes:");
        for(int i =0;i<auxPeixes.size();i++){
            System.out.println(ZooPatrocinio.getPeixes().get(i));
        }
        System.out.println("------------------------");
        auxAves.remove(2);
        auxAves.remove(1);
        System.out.println("Aves: ");
        for(int i =0;i<auxAves.size();i++){
            System.out.println(ZooPatrocinio.getAves().get(i));
        }
        //auxAves.add("Pelicano");
        if(!auxAves.contains("Pelicano")){
            auxAves.add("Pelicano");
        }else{
            auxAves.remove("Pelicano");
        }
        System.out.println("Aves: ");
        for(int i =0;i<auxAves.size();i++){
            System.out.println(ZooPatrocinio.getAves().get(i));
        }
    
    
    
    }
    
}
