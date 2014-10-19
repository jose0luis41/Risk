package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



@SuppressWarnings("serial")
public class PanelConectar extends JPanel{
	
private JLabel conexion;

private ImageIcon fondo;



public PanelConectar(){	
setLayout(new GridBagLayout());
setSize(400,400);
fondo = new ImageIcon("Sources/wait.gif");
conexion = new JLabel("Esperando avistar tropas enemigas ...");	
	


add(conexion);
setVisible(true);

}

	
	
	
/*public static void main(String[] args){
	JFrame ventana = new JFrame();
	DialogConectar run = new DialogConectar();
	ventana.add(run);
	ventana.setVisible(true);
}
*/	

protected void paintComponent(Graphics g){
Dimension d = getSize();
g.drawImage(fondo.getImage(),0,0,d.width,d.height,null);
this.setOpaque(false);
super.paintComponent(g);

}

}
