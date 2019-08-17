
package Model;


import java.util.ArrayList;

/**
 * ManagedBean que inicializa las variables a utilizar en el index
 * @author Germán García
 * @author Julián Parra
 */
public class modelList {
    /**
     * Almacena el nombre de la lista en un arreglo
     */
    ArrayList<String> listaVariables = new ArrayList<String>();
   
    public boolean insertar(encaVariables var){
        listaVariables.add(var.getVariable());
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
