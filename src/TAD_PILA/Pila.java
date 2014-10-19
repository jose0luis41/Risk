package TAD_PILA;

import ListaDoble.Doble;

public class Pila<T> implements IPila<T>{
	
	
	protected Doble<T> pila;
	private int top;
	private int capacidad;
	private Pila<T> parteSuperior;
	
	public Pila(){ 
		pila = new Doble<T>();
		top=-1;
		capacidad = pila.darLongitud();
		
	}

	public int getCapacidad() {
		return capacidad;
	}

	

	@Override
	public void empuje(T elemento) {
		// TODO Auto-generated method stub
		try {
			pila.agregar(0, elemento);
			top++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Pila<T> getParteSuperior() {
		return parteSuperior;
	}



	@Override
	public void pop() {
		// TODO Auto-generated method stub
		pila.eliminar(0);
		top--;
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		boolean vacio = false;
		if(getTop()==-1){
			vacio = true;
		}
		return vacio;
	}

	@Override
	public T darElementoParteSuperior() {
		// TODO Auto-generated method stub
		T elemento = null;
		try {
			elemento = pila.darElemento(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return elemento;
	}

	public int getTop() {
		// TODO Auto-generated method stub
		return top;
	}

}
