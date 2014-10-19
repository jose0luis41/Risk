package mundo;



public class Carta {

private String imagenCarta;	
	
private String tipo;

public final static String TIPO1 = "Territorio";
public final static String TIPO2 = "Mision";
public final static String TIPO3 = "Comodin";


public Carta(String imagen, String tipo){
	imagenCarta = imagen;
	this.tipo = tipo; 
}

public String darTipo(){
	return tipo;
}

public void cambiarTipo(String Ntipo){
	tipo = Ntipo;
}

public String darImagen(){
	return imagenCarta;
}

public void cambiarImagen(String Nimagen){
	imagenCarta = Nimagen;
}
}
