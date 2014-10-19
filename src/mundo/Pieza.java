package mundo;

import Colas.Cola;

abstract  class Pieza extends Cola{

	
public final static int SOLDADO = 1;

public final static int CABALLO = 1;	

public final static int CANON = 1;	
	
private int tipo;



public Pieza(){
	
}



public int darTipo(){
	return tipo;
}

public void cambiarTipo(int N){
	tipo = N;
}

public boolean Atacar(){
	return true;
}


public void TirarDados(){
	
	
	
}

public boolean eliminarOponente(){
	return true;
}

public boolean Rendirse(){
	return true;
}




}
