/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source.introdução_ao_java;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Erick
 */
public class Datas_calendario {
    public static void main(String[] args) {
        /*
        Para data podemos tanto utilizar a classe Date quanto a Calendar.
        Porém a classe Date é considerada defasada, por isso usa-se mais a
        classe Calendar.
        */
    Date data = new Date();
    Calendar date = Calendar.getInstance();
        int hora = date.get(Calendar.HOUR);
        if(hora>12){
            System.out.println("bom dia");
        }else {
            System.out.print("Boa tarde ");
        }
        System.out.print(date.get(Calendar.HOUR));
}}