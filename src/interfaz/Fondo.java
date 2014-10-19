package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Fondo extends JPanel  implements ActionListener{

/**
 * atributo con la imagen de fondo	
 */
private ImageIcon image;
/**
 * atribtuo, que representa un Jbutton que funcionara para jugar
 */
private JButton butJugar;
/**
 * atribtuo, que representa un Jbutton que funcionara para opciones
 */
private JButton butOpciones;
/**
 * atribtuo, que representa un Jbutton que funcionara para salir
 */
private JButton butSalir;
/**
 *Constante para el Jbutton jugar
 */
public final static String JUGAR = "jugar";
/**
 *Constante para el Jbutton opciones
 */
public final static String OPCIONES = "opciones";
/**
 *Constante para el Jbutton salir
 */
public final static String SALIR = "salir";
/**
 *atributo que comunica con la clase principal en este caso Inicio
 */
private Inicio principal;
/**
 * atributo que representa la relacion con la InterfazPrincipal
 */
private InterfazPrincipal juego;
/**
 * atributo que representa la relacion con la InterfazOpciones
 */
private InterfazOpciones opciones;
/**
 * atributo que representa cuando se debe detener el sonido
 */
private boolean sonido;

/**
 * Metodo: Constructor
 * Se encarga de inicializar los atributos de la clase Fondo
 * @param data, con la url de la imagen de fondo
 * @param ventana, con las clase Inicio
 */
public Fondo(String data, Inicio ventana){
super();
setSize(300,200);
setLayout(new GridBagLayout());
image = new ImageIcon(data);
setSize(image.getIconWidth(),image.getIconHeight());

principal = ventana;
sonido = true;
opciones = new InterfazOpciones(ventana);
//scroll.setViewportView(new JLabel(image));
JPanel panelInterno = new JPanel();
panelInterno.setLayout(new GridLayout(3,3));

butJugar = new JButton();
butJugar.setIcon(new ImageIcon("Sources/Hola.png"));
butJugar.setMargin(new Insets(40,40,40,40));
butJugar.setBackground(Color.WHITE);
//butJugar.setFocusPainted(false);
//butJugar.setBorderPainted(false);
//butJugar.setContentAreaFilled(false);
//butJugar.setOpaque(false);
butJugar.setActionCommand(JUGAR);
butJugar.addActionListener(this);


butOpciones = new JButton();
butOpciones.setIcon(new ImageIcon("Sources/Opciones.gif"));
butOpciones.setMargin(new Insets(40,40,40,40));
butOpciones.setBackground(Color.WHITE);
butOpciones.setActionCommand(OPCIONES);
butOpciones.addActionListener(this);

butSalir = new JButton();
butSalir.setIcon(new ImageIcon("Sources/salir.gif"));
butSalir.setMargin(new Insets(40,40,40,40));
butSalir.setBackground(Color.WHITE);
butSalir.setActionCommand(SALIR);
butSalir.addActionListener(this);

//panelInterno.add(new JLabel(""));
panelInterno.add(butJugar);
//panelInterno.add(new JLabel(""));
panelInterno.add(butOpciones);
//panelInterno.add(new JLabel(""));
panelInterno.add(butSalir);
add(panelInterno);
}

/**
 * Metodo: paintComponent
 * se encarga de pintar los objetos en este caso la imagen de fondo
 */
protected void paintComponent(Graphics g){
Dimension d = getSize();
g.drawImage(image.getImage(),0,0,d.width,d.height,null);
this.setOpaque(false);
super.paintComponent(g);

}



/**
 * Metodo: actionPerformed
 * se encarga de gestionar las acciones de los JButton de esta clase
 */
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String comando = e.getActionCommand();
	
	if(comando.equalsIgnoreCase(JUGAR)){
	try {
		principal.darSonido().stop();
		//butJugar.setIcon(new ImageIcon("Sources/start.png"));
		Thread.sleep(3300);
		principal.setVisible(false);
		Thread.sleep(500);
		principal.getJuego().setVisible(true);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
		
		
	}
	
	if(comando.equalsIgnoreCase(OPCIONES)){
		try {
			//butJugar.setIcon(new ImageIcon("Sources/start.png"));
			
			Thread.sleep(3300);
			principal.setVisible(false);
			Thread.sleep(500);
			principal.darSonido().stop();
			//opciones.darSonido2().start();
			principal.getOpciones().setVisible(true);
			
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
	}
	
	if(comando.equalsIgnoreCase(SALIR)){
		
	int num = JOptionPane.showConfirmDialog(this, "Desea Salir");
	if(num == JOptionPane.YES_OPTION){
		System.exit(0);
	}
	else{
		
	}
}
}

public boolean Sound1(){
	return sonido;
}

}
