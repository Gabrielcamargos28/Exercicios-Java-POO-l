/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datas;

/**
 *
 * @author gabri
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        this.dia = dia >= 01 && dia <= 31 ? dia : 0;
    }

    public void setMes(int mes) {
        this.mes = mes >= 1 && mes <= 12 ? mes : 0;
    }

    public void setAno(int ano) {
        this.ano = ano >= 2000 && ano <= 2025 ? ano : 0;
    }

    public String mostrarData() {
        String mostrarData = String.format("%02d/%02d/%04d", dia, mes, ano);
        return mostrarData;
    }

    public void proximoDia() {
        if ((this.dia == 31)||(this.mes == 02 && this.dia == 28)) {
            this.dia = 01;
        } else {
            this.dia ++;
            System.out.println("Proximo dia: "+this.dia);
        }
    }
}
