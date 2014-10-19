package interfaz;



import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Mapa extends JPanel{

private JLabel mapa;


public Mapa(){
setLayout(new BorderLayout());
ImageIcon imagen = new ImageIcon("Sources/mapa-risk.jpg");
mapa = new JLabel(imagen);

add(mapa, BorderLayout.CENTER);

}
	
	
}
