
package tarea1;

package poo.persona.p01;
import tarea1.persona;
import java.util.*;
import tarea1.*;
import tarea1.ImplPersona.*;

public class PooPersonaP01 {
public void ejemplo(){
    String dia ="Lunes";
    System.out.print (dia);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        ImplPersona jn=new ImplPersona();
        persona aq=new persona();
        int otp=0;
        Scanner teclado=new Scanner(System.in);
        
        do {            
            System.out.println("1 listar");
            System.out.println("2 crear");
            System.out.println("3 eliminar");
            System.out.println("ingrese la opcion 1 2 3 ");
            otp=teclado.nextInt();
            
            switch(otp){
                
                case 1: 
                    System.out.println("id nombres  paterno  materno     sexo");
                     
        ImplPersona ip=new ImplPersona();
        persona p1=new persona();
        p1.setNombres("Eder");
        p1.setAp_paterno("Gutierrez");
        p1.setAp_materno("Quispe");
        p1.setSexo("M");
        persona p2=new persona();
        p2.setNombres("Juan");
        p2.setAp_paterno("Perez");
        p2.setAp_materno("Quiroz");
        p2.setSexo("M");
        persona p3=new persona();
        p3.setNombres("Jhamil");
        p3.setAp_paterno("Apaza");
        p3.setAp_materno("Quispe");
        p3.setSexo("M");
        
        System.out.println("antes de eliminar");
        ip.create(p1);
        ip.create(p2);
        ip.create(p3);
        
        for(persona p:ip.list()){
            System.out.println(p.getId());
            System.out.println(p.getNombres());
            System.out.println(p.getAp_paterno());
            System.out.println(p.getAp_materno());
            System.out.println(p.getSexo());
                    
        }
                    break;
                /*case 2:
                    System.out.println("id nombres  paterno  materno     sexo");
                    for (persona l:jn.create(p1)) {
                        System.out.println(l.getId());
                        System.out.println(l.getNombres());
                        System.out.println(l.getAp_paterno());
                        System.out.println(l.getAp_materno());
                        System.out.println(l.getSexo());
                        
                    }break;
                case 3:
                    int numero=0;
                    System.out.println("id nombres  paterno  materno     sexo");
                    System.out.println("QUE PERSONA DESEA ELIMINAR");
                    numero=teclado.nextInt();
                    for (persona l:jn.delete()) {
                        System.out.println(l.getId());
                        System.out.println(l.getNombres());
                        System.out.println(l.getAp_paterno());
                        System.out.println(l.getAp_materno());
                        System.out.println(l.getSexo());
                        
                    }break;*/
            }
        } while (otp!=0);
        /*ImplPersona ip=new ImplPersona();
        persona p1=new persona();
        p1.setNombres("Eder");
        p1.setAp_paterno("Gutierrez");
        p1.setAp_materno("Quispe");
        p1.setSexo("M");
        persona p2=new persona();
        p2.setNombres("Juan");
        p2.setAp_paterno("Perez");
        p2.setAp_materno("Quiroz");
        p2.setSexo("M");
        persona p3=new persona();
        p3.setNombres("Jhamil");
        p3.setAp_paterno("Apaza");
        p3.setAp_materno("Quispe");
        p3.setSexo("M");
        
        System.out.println("antes de eliminar");
        ip.create(p1);
        ip.create(p2);
        ip.create(p3);
        
        for(persona p:ip.list()){
            System.out.println(p.getId());
            System.out.println(p.getNombres());
            System.out.println(p.getAp_paterno());
            System.out.println(p.getAp_materno());
            System.out.println(p.getSexo());
                    
        }
        System.out.println("despues de eliminar");
        ip.delete(1);
        ip.delete(2);
        ip.delete(3);
        
         for(persona c:ip.list()){
            System.out.println(c.getId());
            // System.out.println("");
            System.out.println(c.getNombres());
            System.out.println(c.getAp_paterno());
            System.out.println(c.getAp_materno());
            System.out.println(c.getSexo());
                    
        }*/
    }
    
}