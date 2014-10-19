package interfaz;



import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelOpciones extends JPanel{

private JButton buttonPlay;	
private JButton buttonStats;
private JButton buttonCards;
private JButton buttonMision;
private JButton buttonMenu;
	

public PanelOpciones(){
TitledBorder borde = new TitledBorder("Opciones");
setBorder(borde);
setLayout(new GridLayout(1,5));


buttonStats = new JButton();
buttonStats.setIcon(new ImageIcon("Sources/Stats.gif"));


buttonMision = new JButton();
buttonMision.setIcon(new ImageIcon("Sources/RiskMissionss.gif"));


buttonMenu = new JButton();
buttonMenu.setIcon(new ImageIcon("Sources/Menu.gif"));


buttonCards = new JButton();
buttonCards.setIcon(new ImageIcon("Sources/Cards.gif"));


buttonPlay = new JButton();
buttonPlay.setIcon(new ImageIcon("Sources/Play.gif"));



add(buttonPlay);
add(buttonStats);
add(buttonMision);
add(buttonCards);
add(buttonMenu);
}

}
