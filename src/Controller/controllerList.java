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
    DefaultListModel modelolista;

    public controllerList(encaVariables variable, modelList modC, viewFrame frm) {
        this.variable = variable;
        this.modC = modC;
        this.frm = frm;
        this.frm.btn_agregar.addActionListener(this);
        modelolista = new DefaultListModel();  
        frm.jlist_valores.setModel(modelolista);        
        
    }

    public void iniciar() {
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btn_agregar) {
            variable.setVaraible(frm.txt_valor.getText());
            String a = frm.txt_valor.getText();
            if (modC.insertar(variable)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            modelolista.addElement(a);
        }
    }
}
