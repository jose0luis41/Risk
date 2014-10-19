package ListaSimple;

public class NodoSimple<T> {
	
	private T element;
	private NodoSimple<T> sig;
	
	public NodoSimple(T elem){
		element=elem;
		sig=null;
	}
	
	public NodoSimple<T> getNext(){
		return sig;
	}
	
	public T getElement(){
		return element;
	}
	public void setNext(NodoSimple<T> n){
		sig=n;
	}
	public void setElement(T n){
		element=n;
	}

}
