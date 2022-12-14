/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia3;

/**
 *
 * @author jorge
 */
public class Reloj {
    String Hora;
    String Minutos;
    String Segundos;
    
    public Reloj(){
        Hora="12";
        Minutos="00";
        Segundos="00";
    }
    public Reloj(String hor,String min,String seg){
        Hora=hor;
        Minutos=min;
        Segundos=seg;
    }
    public Reloj(int hseg){
        int auxhor,auxmin,auxseg;
        
        if((int)(hseg/60)>=60){
            auxhor=(int)(hseg/3600);
            Hora=auxhor+"";
            auxmin=((int)(hseg/60)%60);
            Minutos=auxmin+"";
        }
        if((int)(hseg/60)<60){
            Hora="00";
            auxmin=(int)(hseg/60);
            Minutos=auxmin+"";
        }
            
        auxseg=hseg%60;
        Segundos=auxseg+"";
    }
    
    public void setReloj(){
        
    }
    public void prueba () {
        System.out.println("Haciendo fork ");
    }
    
    public String getHoras(){
        return Hora;
    }
    public String getMinutos(){
        return Minutos;
    }
    public String getSegundos(){
        return Segundos;
    }
    public void setHoras(String hor){
        Hora=hor;
    }
    public void setMinutos(String min){
        Minutos=min;
    }
    public void setSegundos(String seg){
        Segundos=seg;
    }
    
    public void tick(){
        int auxnum;
        if(Segundos.equals("59")){
            Segundos="00";
        }else{
            auxnum=Integer.parseInt(Segundos);
            auxnum++;
            Segundos=auxnum+"";
        }
    }
    
    public void addReloj(Reloj r){
        Hora=r.Hora;
        Minutos=r.Minutos;
        Segundos=r.Segundos;
    }
    
    public String toString(){
        return (Hora+":"+Minutos+":"+Segundos);
    }
    
    public void tickDecrement(){
        int auxnum;
        if (Segundos.equals("00")){
            Segundos="59";
        }else{
            auxnum=Integer.parseInt(Segundos);
            auxnum--;
            Segundos=auxnum+"";
        }
    }
    
    public void restaReloj(Reloj r){
        int auxhora1, auxhora2;
        int auxmin1,auxmin2;
        int auxseg1,auxseg2;
        
        auxhora1=Integer.parseInt(Hora);
        auxhora2=Integer.parseInt(r.Hora);
        auxmin1=Integer.parseInt(Minutos);
        auxmin2=Integer.parseInt(r.Minutos);
        auxseg1=Integer.parseInt(Segundos);
        auxseg2=Integer.parseInt(r.Segundos);
        
        System.out.println("La diferencia es de: " + Math.abs(auxhora1-auxhora2)+
                ":"+Math.abs(auxmin1-auxmin2)+":"+Math.abs(auxseg1-auxseg2));
    }
    
}
