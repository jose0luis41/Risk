package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class InterfazPrincipal extends JFrame{
	
	
private Mapa mapa;

private PanelOpciones panelOpciones;





public InterfazPrincipal(){
setTitle("Risk Mundial");	
setSize(1500, 1085);
setLayout(new BorderLayout());
setDefaultCloseOperation(EXIT_ON_CLOSE);
	
JPanel panelInterno = new JPanel();
panelInterno.setLayout(new FlowLayout());



mapa = new Mapa();
JScrollPane scroll = new JScrollPane(mapa);
add(scroll, BorderLayout.CENTER);
	
panelOpciones = new PanelOpciones();
panelInterno.add(panelOpciones, BorderLayout.EAST);

add(panelInterno, BorderLayout.SOUTH);

}


public static void main(String[] args){
InterfazPrincipal ventana = new InterfazPrincipal();
ventana.setVisible(false);
}
	

}
