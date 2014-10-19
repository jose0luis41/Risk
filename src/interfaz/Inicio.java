package interfaz;


import java.awt.BorderLayout;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Inicio extends JFrame{
	
/**
 * atributo que representa la relacion con la clase Fondo	
 */
private Fondo fondo;
/**
 * atributo que representa la relacion con la clase InterfazPrincipal
 */
private InterfazPrincipal principal;
/**
 * atributo que representa la relacion con la clase InterfazOpciones
 */
private InterfazOpciones opciones;
/**
 * atributo que representa la musica
 */
private Clip music;
	
/**
 * Metodo: Constructor
 * Se encarga de inicializar los atributos de la clase Fondo
 */
public Inicio(){

setTitle("Risk");
setSize(1370,1370);

setLayout(new BorderLayout());
setDefaultCloseOperation(EXIT_ON_CLOSE);

fondo = new Fondo("Sources/Fondo.jpg", this);
add(fondo);


principal = new InterfazPrincipal();
opciones = new InterfazOpciones(this);
music = Sonido();
music.start();
}



/**
 * Metodo:main
 * Se encarga de Crear la Clase y d ehacerla visible
 * @param args
 */
public static void main(String[] args){
	Inicio ventana = new Inicio();
	ventana.setVisible(true);
	//Sonido();
	
	
}

/**
 * Metodo: Sonido
 * Se encarga de crear la musica
 * @return Clip con la musica
 */
@SuppressWarnings("resource")
public static Clip Sonido(){
	String sound = "Sources/Sonidos/SonidoInicial.wav";
	Clip musica = null;
	//boolean IT = true;
	try {
		
		@SuppressWarnings("unused")
		InputStream in = new FileInputStream(sound);
		AudioInputStream audio = AudioSystem.getAudioInputStream(new File("Sources/Sonidos/SonidoInicial.wav"));
		AudioFormat format = audio.getFormat();
		int gr = (int) (format.getFrameSize() * audio.getFrameLength());
		byte[] mySound = new byte[gr];
		DataLine.Info info = new DataLine.Info(Clip.class,format, gr);
		audio.read(mySound,0,gr);
		
		Clip clip = (Clip) AudioSystem.getLine(info);
		clip.open(format, mySound, 0, gr);
		//clip.start();
		//Thread.sleep(40000);
		
		//clip.stop();
		//if(Getss()){
		//clip.stop();	
		//}
		musica = clip;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return musica;
}

public InterfazPrincipal getJuego(){
	return principal;
}

public InterfazOpciones getOpciones(){
	return opciones;
}

public Clip darSonido(){
	return music;
}
}
