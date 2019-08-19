package Controller;

import Model.encaVariables;
import Model.modelList;
import View.viewFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 * ManagedBean que inicializa las variables a utilizar en el index
 * @author Germán García
 * @author Julián Parra
 */
public class controllerList implements ActionListener {
    
    /**
     * Nombre de la variable publica del metodo encapsulado de modelo
     */
    private encaVariables var_enca;
    
    /**
     * Nombre del metodo del modelo
     */
    private modelList var_modelo;
    
    /**
     * Nombre del metodo de la vista
     */
    private viewFrame vista_formulario;
    
    /**
     * Nombre del DefaultListModel
     */
    DefaultListModel def_lista;

    /**
     * Metodo que se encarga de guardar las variables recibidas de modelo y la vista
     * @param var_enca variable del modelo
     * @param var_modeolo variable del modelo que se encarga de la logica
     * @param vista_formulario variable que trae el formulario de la vista
     */
    public controllerList(encaVariables var_enca, modelList var_modeolo, viewFrame vista_formulario) {
        this.var_enca = var_enca;
        this.var_modelo = var_modeolo;
        this.vista_formulario = vista_formulario;        
        this.vista_formulario.btn_agregar.addActionListener(this);
        this.vista_formulario.btn_listar.addActionListener(this);
        def_lista = new DefaultListModel();  
        vista_formulario.jlist_valores.setModel(def_lista);        
        
    }

    /**
     * Constructor que inicializa el titulo  
     */
    public void iniciar() {
        vista_formulario.setTitle("Productos");
        vista_formulario.setLocationRelativeTo(null);
    }

    /**
     * Metodo que toma las acciones del formulario
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {        
        encaVariables enca = new encaVariables();
        if (e.getSource() == vista_formulario.btn_agregar) {
            var_enca.setVariable(vista_formulario.txt_valor.getText());
            enca.miDato = vista_formulario.txt_valor.getText();             
            if (var_modelo.insertar(var_enca)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }            
            def_lista.addElement(enca.miDato);
        }
        
        if (e.getSource() == vista_formulario.btn_listar) {            
            ArrayList pegarlista = var_modelo.vervar();
            def_lista.clear();
            def_lista.addElement(pegarlista);                  
        }
        
    }
    
    
}
