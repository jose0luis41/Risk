package TAD_PILA;

public interface IPila<T> {

	
	
	public void empuje(T elemento);
	
	public void pop();
	
	public boolean estaVacia();
	
	public T darElementoParteSuperior();
}
