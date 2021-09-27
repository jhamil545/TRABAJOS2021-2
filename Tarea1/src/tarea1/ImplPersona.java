
package tarea1;


import java.util.*;
import tarea1.persona;
public class ImplPersona {
    List<persona> lis=new ArrayList<>();
    int id=0;
    
    public void create(persona p){
        id=id+1;
        p.setId(id);
        lis.add(p);
    }
    
    public List<persona> list(){
       return lis;
    }
    
    public void delete(int id) {
        for(persona ps :lis){
            if(id==ps.getId()){
                System.out.println("Eliminado "+ps.getNombres());
                lis.remove(ps);
            }
        }
    }
    /*public void delete(int id){
        for(persona ps: lis){
            if (id == ps.getId()) {
                System.out.println("Eliminando a: "+ps.getNombres());
                lis.remove(ps);
                for(persona p : list()){
                System.out.print(p.getId()+" ");
                System.out.print(p.getNombres()+" ");
                System.out.print(p.getAp_paterno()+" ");
                System.out.print(p.getAp_materno()+" ");
                System.out.println(p.getSexo());
                }
            }
        }
    }*/
    
   /* public String saludo(){
        return "Hola";
    } 
    
    public int numero(){
      return 5;
    }
    
    public void despedida(){
        
    }*/


   
}