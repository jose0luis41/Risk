package ListaDoble;

public class IdDoble <T>{
	
	
	
	private T elemento;
	private IdDoble<T> sig;
	private IdDoble ant;
	
	public IdDoble(T param){
		elemento=param;
		
	}
	
	
	
	public IdDoble darSiguiente(){
		return sig;
	}
	
	
	public IdDoble darAnterior(){
		return ant;
	}
	
	public T darElemento(){
		return elemento;
	}
	
	public void cambiarSiguiente(IdDoble param){
		sig=param;
	}

	
	public void cambiarAnterior(IdDoble param){
		ant = param;
		
		
	}
}
