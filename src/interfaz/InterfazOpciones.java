package interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class InterfazOpciones extends JFrame{
	
	
private Fondo2 fondo2;

private Clip sonido2;

@SuppressWarnings("unused")
private boolean Stop;

private Inicio principal;

public InterfazOpciones(Inicio ventana){
setTitle("Risk");
setSize(1370,1370);

setLayout(new BorderLayout());
setDefaultCloseOperation(EXIT_ON_CLOSE);

fondo2 = new Fondo2("Sources/RiskOpciones.jpg", this);
add(fondo2);

sonido2 = sonido2();
Stop = false;
principal = ventana;


}
	


//public static void main(String[] args){
//InterfazOpciones ventana = new InterfazOpciones();
//ventana.setVisible(false);
//}

public static Clip sonido2(){

	String sound = "Sources/Sonidos/Espada THEME.wav";
	Clip musica = null;
	//boolean IT = true;
	try {
		
		@SuppressWarnings({ "unused", "resource" })
		InputStream in = new FileInputStream(sound);
		AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Sources/Sonidos/Espada THEME.wav"));
		AudioFormat format = audio.getFormat();
		int gr = (int) (format.getFrameSize() * audio.getFrameLength());
		byte[] mySound = new byte[gr];
		DataLine.Info info = new DataLine.Info(Clip.class,format, gr);
		audio.read(mySound,0,gr);
		
		Clip clip = (Clip) AudioSystem.getLine(info);
		clip.open(format, mySound, 0, gr);
		
		musica = clip;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return musica;	
	
	
}


public Clip darSonido2(){
	return sonido2;
}

public Inicio darVentana(){
	return principal;
}

}
