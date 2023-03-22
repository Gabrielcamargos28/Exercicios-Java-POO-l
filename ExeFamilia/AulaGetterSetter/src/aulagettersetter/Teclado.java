/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagettersetter;

/**
 *
 * @author gabri
 */
public class Teclado {

    private String modelo;
    private boolean wireless;
    private String tipo;

    public Teclado(String modelo, boolean wireless, String tipo) {
        this.modelo = modelo;
        this.wireless = wireless;
         if(tipo.equals("Membrana")||tipo.equals("Mecanico")||tipo.equals("Magnetico")){
            this.tipo = tipo;
        }else{
            System.out.println("Tipo incorreto, o programa FECHOU");
            System.exit(0);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getWireless() {
        String resp = wireless == true ? "Wireless: Sim": "Wireless: Nao"; 
        return resp;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getTipo() {
        if(equals("Mecanico")){
            return tipo + "\nRegulamentado pela anatel";
        }else{
            return tipo;
        }
    }
    public void setTipo(String tipo) {
        if(tipo.equals("Membrana")||tipo.equals("Mecanico")||tipo.equals("Magnetico")){
            this.tipo = tipo;
        }else{
            System.out.println("Tipo incorreto, o programa FECHOU");
            System.exit(0);
        }
    }

}
