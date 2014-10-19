package interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Fondo2 extends JPanel implements ActionListener{
/**
 * atributo con la imagen de fondo de la clase
 */
private ImageIcon image;	
/**
 * atributo con la relacion a la InterfazOpciones
 */
private InterfazOpciones principal;
/**
 * atributo JButton que representa el boton salir
 */
private JButton butSalir;
/**
 * atributo JButton que representa el boton reglas
 */
private JButton butReglas;
/**
 * atributo JButton que representa el boton creditos
 */
private JButton butCreditos;
/**
 * atributo JButton que representa el boton sonido
 */
private JButton butSonido;
/**
 * constante que representa el comando del Jbutton salir
 */
public final static String SALIR = "salir";
/**
 * constante que representa el comando del Jbutton reglas
 */
public final static String REGLAS = "reglas";
/**
 * constante que representa el comando del Jbutton creditos
 */
public final static String CREDITOS = "creditos";
/**
 * constante que representa el comando del Jbutton sonido
 */
public final static String SONIDO = "sonido";


/**
 * Metodo: Constructor
 * se encarga de inicializar los atributos de esta clase
 * @param data, con la url de la imagen de fondo
 * @param ventana, con La InterfazOpciones
 */
public Fondo2(String data, InterfazOpciones ventana){
super();
setSize(370,370);
setLayout(new GridBagLayout());
image = new ImageIcon(data);
setSize(image.getIconWidth(),image.getIconHeight());

principal = ventana;

JPanel panelInterno = new JPanel();
panelInterno.setLayout(new GridLayout(2,2));

butSonido = new JButton();
butSonido.setIcon(new ImageIcon("Sources/out.gif"));
butSonido.setMargin(new Insets(50,50,50,50));
butSonido.setActionCommand(SONIDO);
butSonido.addActionListener(this);


butReglas = new JButton();
butReglas.setIcon(new ImageIcon("Sources/Reglas.gif"));
butReglas.setMargin(new Insets(50,50,50,50));
butReglas.setActionCommand(REGLAS);
butReglas.addActionListener(this);


butCreditos = new JButton();
butCreditos.setIcon(new ImageIcon("Sources/Credits_Button.gif"));
butCreditos.setMargin(new Insets(50,50,50,50));

butSalir = new JButton();
butSalir.setIcon(new ImageIcon("Sources/Decolver.gif"));
butSalir.setMargin(new Insets(50,50,50,50));
butSalir.setActionCommand(SALIR);
butSalir.addActionListener(this);

panelInterno.add(butSonido);
panelInterno.add(butReglas);
panelInterno.add(butCreditos);
panelInterno.add(butSalir);
add(panelInterno);

}
	
/**
 * Metodo: paintComponent
 * se encarga de pintar los componentes de esta clase para este caso la imagen de fondo	
 */
protected void paintComponent(Graphics g){
Dimension d = getSize();
g.drawImage(image.getImage(),0,0,d.width,d.height,null);
this.setOpaque(false);
super.paintComponent(g);

}	
	
	
	
	
	
	
	/**
	 * Metodo: actionPerformed
	 * Se encarga de gestionar las acciones de los JButton de esta clase
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		 if(comando.equalsIgnoreCase(SONIDO)){
			if(controlSound()){
			principal.darSonido2().start();	
			butSonido.setIcon(new ImageIcon("Sources/In.gif"));
			
			}
			else{
			butSonido.setIcon(new ImageIcon("Sources/out.gif"));	
			principal.darSonido2().stop();
			}
		}
		 
		 if(comando.equalsIgnoreCase(SALIR)){
			this.setVisible(false);
			principal.darVentana().setVisible(true);;
		 }
	}
/**
 * Metodo : controlSonido
 * Se encarga de gestionar cuando el sonido debe parar o no
 * @return boolean, con true si debe parar o false de caso contrario
 */
	public boolean controlSound(){
		if(butSonido.getIcon().toString().equalsIgnoreCase(new ImageIcon("Sources/out.gif").toString())){
			return true;
		}
		else{
			return false;
		}
	}
	
}
