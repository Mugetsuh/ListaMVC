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
 *
 * @author DaveHell
 */
public class controllerList implements ActionListener {

    private encaVariables variable;
    private modelList modC;
    private viewFrame frm;
    DefaultListModel def_lista;

    public controllerList(encaVariables variable, modelList modC, viewFrame frm) {
        this.variable = variable;
        this.modC = modC;
        this.frm = frm;        
        this.frm.btn_agregar.addActionListener(this);
        this.frm.btn_listar.addActionListener(this);
        def_lista = new DefaultListModel();  
        frm.jlist_valores.setModel(def_lista);        
        
    }

    public void iniciar() {
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {        
        encaVariables enca = new encaVariables();
        if (e.getSource() == frm.btn_agregar) {
            variable.setVaraible(frm.txt_valor.getText());
            enca.miDato = frm.txt_valor.getText();             
            if (modC.insertar(variable)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }            
            def_lista.addElement(enca.miDato);
        }
        
        if (e.getSource() == frm.btn_listar) {            
            ArrayList pegarlista = modC.vervar();
            def_lista.clear();
            def_lista.addElement(pegarlista);      
            
                
            
            
            
        }
        
    }
    
    
}
