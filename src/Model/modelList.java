
package Model;


import java.util.ArrayList;

/**
 *
 * @author DaveHell
 */
public class modelList {
    ArrayList<String> listaVariables = new ArrayList<String>();
   
    public boolean insertar(encaVariables var){
        listaVariables.add(var.getVaraible());
        mostrar(listaVariables);
        return true;
    }
    
    public ArrayList vervar(){         
        return mostrar(listaVariables);
        
    }
    
    public ArrayList mostrar (ArrayList Listar) {
        listaVariables.stream().forEach((String listaVariable) -> {            
            //System.out.println("Lista de Variables2 = " + listaVariable);
            encaVariables enca = new encaVariables();
            enca.miDato = listaVariable;
        });
        return Listar;
    }
    
    
    
}
