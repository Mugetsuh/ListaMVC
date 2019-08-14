
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
        System.out.println(" =========== ");
//        listaVariables.stream().forEach((listaVariable) -> {
//            System.out.println("Lista de Variables = " + listaVariable);
//        });
        mostrar(listaVariables);
        return true;
    }
    
    public ArrayList mostrar (ArrayList Listar) {
        listaVariables.stream().forEach((String listaVariable) -> {            
            System.out.println("Lista de Variables2 = " + listaVariable);
        });
        return Listar;
    }
}
