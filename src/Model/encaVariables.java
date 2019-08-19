/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * ManagedBean que inicializa las variables a utilizar en el index
 * @author Germán García
 * @author Julián Parra
 */
public class encaVariables {
    
    /**
     * Almacena el nombre de la variable para el resultado de datos
     */
    private String variable;

    /**
     * Se encarga de guardar la variable
     * @param variable 
     */
    public encaVariables(String variable) {
        this.variable = variable;
    }
    
    /**
     * Constructor 
     */
    public encaVariables() {
    }

    /**
     * Se encarga de retornar la variable
     * @return variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Se encarga de guardar la variable
     * @param variable 
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }
    
    /**
     * Almacena el nombre de los valores
     */    
    public String miDato;

}
