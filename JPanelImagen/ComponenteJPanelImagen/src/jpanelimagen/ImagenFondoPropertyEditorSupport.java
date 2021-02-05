/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author AntDVD
 */
public class ImagenFondoPropertyEditorSupport  extends PropertyEditorSupport{
    
    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = imagenFondoPanel.getSelectedValue();
        String ruta = imagenFondo.getRutaImagen().getAbsolutePath();
         ruta = ruta.replace('\\','/');
        return "new jpanelimagen.ImagenFondo("+"new java.io.File(\""+ruta+"\"),"+imagenFondo.getOpacidad()+"f)";
    }

    //Este método enlaza con el método creado en el Panel
    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }
    
    
    
}
