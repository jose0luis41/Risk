package TEST;

import TAD_PILA.Pila;
import junit.framework.TestCase;

public class TestPila extends TestCase{

	private Pila<Integer> pila;
	
	
	public void setupEscenario1(){
		pila = new Pila<Integer>();
		pila.empuje(3);
		pila.empuje(8);
		pila.empuje(6);
		pila.empuje(9);
		pila.empuje(1);
		pila.empuje(3);
		pila.empuje(5);
		pila.empuje(18);
	}
	
	public void setupEscenario2(){
		pila = new Pila<Integer>();
	}
	
	/**
	 * Caso para cuando hay elementos en la pila
	 */
	public void testAgregar(){
		setupEscenario1();
		assertEquals("No se est� agregando de la manera correcta", "7", Integer.toString(pila.getTop()));
		assertEquals("No se est� agregando el elemento en la parte superior", "18", pila.darElementoParteSuperior().toString());
	}
	
	/**
	 * Caso para cuando no hay ni un solo elemento en la pila
	 */
	public void testAgregar1(){
		setupEscenario2();
		assertEquals("No est� contando la capacidad bien", -1, pila.getTop());
		assertFalse(pila.getTop()!=-1);
		
	}
	
	/**
	 * Caso para verificar si la pila est� vacia cuando no hay ningun  solo elemento
	 */
	
	public void testEstaVacio(){
		setupEscenario2();
		assertEquals("No se verifica bien si la lista est� vacia", true, pila.estaVacia());
	}
	
	/**
	 * Caso para verificar si la pila est� vacia cuando hay elementos
	 */
	
	public void testEstaVacio2(){
		setupEscenario1();
		assertEquals("No se verifica bien si la lista est� vacia", false, pila.estaVacia());
	}
	
	/**
	 * Caso para eliminar el elemento superior de la pila 
	 */
	
	public void testEliminar(){
		setupEscenario1();
		pila.pop();
		assertEquals("No se est� eliminando el elemento de la cima", 5, pila.darElementoParteSuperior().intValue());
		pila.pop();
		pila.pop();
		pila.pop();
		assertEquals("No se disminuye la capacidad", 3, pila.getTop());
	}
	
	
	
	
}
