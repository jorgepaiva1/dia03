/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia3;
import java.util.Scanner;
import java.lang.Thread;
import java.io.*;
/**
 *
 * @author jorge
 */
public class RelojDemo {
    
    static public void main(String[]args){
        Scanner escanner=new Scanner(System.in);
        int segundos,longcar;
        int valido=0;
        System.out.print("introduzca la hora en segundos: ");
        segundos=escanner.nextInt();
        String numintroduc;
        numintroduc=segundos+"";
        
        while(valido==0){ //que se introduzca valores correctos
            longcar=numintroduc.length();
            if(numintroduc.matches("[0-86400]+")){
                valido=1;
            }else{
                System.out.println("introdujo valores incorrectos o segundos mayores que puede haber en un dia vuelva a introducir:");
                segundos=escanner.nextInt();
                numintroduc=segundos+"";
            }
        }
        
        Reloj reloj=new Reloj(segundos);
        
        System.out.println(reloj.toString());
        
        System.out.println("La hora durante 10 seg es:");
        for(int k=0;k<10;k++){
            reloj.tick();
            System.out.println(reloj.toString());
        }
        Reloj reloj2= new Reloj();
        
        System.out.println("El reloj marca las "+reloj2.toString());
        reloj.restaReloj(reloj2);
        
    }
}
