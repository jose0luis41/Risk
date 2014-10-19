package interfaz;

import java.awt.Color;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class DialogConectar extends JDialog{

private PanelConectar panel;
		
public DialogConectar(Inicio ven){
super(ven, true);

panel = new PanelConectar();

this.setContentPane(panel);
setTitle("¥Conexión¥");
setSize(400,400);
this.setBackground(Color.WHITE);

}
	
	
	
}
