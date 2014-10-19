package TEST;

import ListaDoble.Doble;
import junit.framework.TestCase;


public class TestListaEnlazadaDoble extends TestCase{
	
	private Doble<Integer> doble;
	
	
	private void setupEscenario1(){
		doble = new ListaDoble.Doble<Integer>();
		
	}

	
	private void setupEscenario2(){
		doble = new Doble<Integer>();
		
		doble.agregar(4);
		doble.agregar(3);
		doble.agregar(56);
		doble.agregar(8);
		doble.agregar(1);
	}
	
	public void testAgregar(){
		setupEscenario2();
		assertTrue(doble.darPrimero().darElemento()==4);
		assertTrue(doble.darUltimo().darElemento() == 1);
	}
	
	public void testEliminar(){
		setupEscenario2();
		doble.eliminar(0);
		doble.eliminar(2);
		
		
	
		assertTrue(doble.darPrimero().darElemento()==3);
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testBuscarElemento(){
		setupEscenario1();
		doble.agregar(4);
	
	}
}
