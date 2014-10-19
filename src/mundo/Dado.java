package mundo;

import java.awt.Color;

import TADHash.TablaHash;

public class Dado extends TablaHash{

private Color color;

private int numero;




public Dado(int N){
	super(N);
	//super();
	//color = Ncolor;
	//numero = Nnum;
}

public int RandomDado(){
	return 0;
}



public Color darColor(){
	return color;
}

public void cambiarColor(Color Ncolor){
	color = Ncolor;
}

public int darNumero(){
	return numero;
}

public void cambiarNumero(int NNumero){
	numero = NNumero;
}

}