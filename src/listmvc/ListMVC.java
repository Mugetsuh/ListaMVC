/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listmvc;

import Controller.controllerList;
import Model.encaVariables;
import Model.modelList;
import View.viewFrame;

/**
 *
 * @author DaveHell
 */
public class ListMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        encaVariables mod = new encaVariables();
        modelList modC = new modelList();
        viewFrame frm = new viewFrame();
        
        controllerList crtl = new controllerList(mod, modC, frm);
        crtl.iniciar();
        frm.setVisible(true);
        System.out.println("corriendo");
    }
    
}
