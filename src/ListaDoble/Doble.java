package ListaDoble;


public class Doble<T> implements ILista<T>{

	private IdDoble<T> primero;
	private IdDoble<T> ultimo;
	
	public Doble(){
		primero=null;
		ultimo = null;
	}
	
	/**
	 * Agregar
	 * <pre> valor!= null
	 * <pos> se agrega un nuevo elemento a la lista
	 * @param valor: indica el objeto que se va a agregar
	 */
	
	
	@Override
	public void agregar(T valor) {
		// TODO Auto-generated method stub
		IdDoble<T> temp = new IdDoble<T>(valor);
		
		if(primero==null && ultimo==null){
			primero = temp;
			ultimo = temp;
		}else{
			IdDoble<T> aux = ultimo;
			ultimo.cambiarSiguiente(temp);
			ultimo.darSiguiente().cambiarAnterior(ultimo);
			ultimo.darSiguiente().cambiarSiguiente(null);
			ultimo = temp;				
		}
	}


	/**
	 * agregar, agrega un valor T en una posicion de la lista
	 * pre: pos>=0, valor != null
	 * pos: se agrega un nuevo T en pos a la lista
	 * @param: int pos, T valor
	 * @throws Exception 
	 * @trhows: lanza excepcion si pos excede el tama?o de la lista
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void agregar(int pos, T valor) throws Exception {
		// TODO Auto-generated method stub
		IdDoble<T> agregar = new IdDoble<T>(valor);

		if(pos==0 && esVacio()){
		primero = agregar;
		 ultimo = agregar;
		}else{

		if (primero != null) {
			IdDoble<T> temp = primero;
			int contador = 0;

			while (pos <= darLongitud() - 1 && pos > contador) {
				contador++;
				temp = temp.darSiguiente();
			}

			if (pos == 0) {
				primero.cambiarAnterior(agregar);
				agregar.cambiarSiguiente(primero);
				agregar.cambiarAnterior(null);
				primero = agregar;
			} else if (pos == darLongitud() - 1) {
				ultimo.cambiarSiguiente(agregar);
				agregar.cambiarAnterior(ultimo);
				agregar.cambiarSiguiente(null);
				ultimo = agregar;
			} else {
				if(temp.darAnterior()!=null && temp.darSiguiente()!=null){
				temp.darAnterior().cambiarSiguiente(agregar);
				agregar.cambiarAnterior(temp.darAnterior());
				agregar.cambiarSiguiente(temp);
				temp.cambiarAnterior(agregar);
				}
			}
		}}

//		} else {
//			throw new Exception(
//					"No se agrego el elemento a la lista en la posicion numero "
//							+ pos);
//		}

	}

	/**
	 * eliminar, elimina un objeto de la lista
	 * pre: pos>=0, lista != vacio, pos<longitud
	 * pos: se elimina un elemento de la lista
	 * @param: int pos, posicion de el elemnto a elminar
	 * @trhows : lanza una excepcion si el elemento no existe
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eliminar(int pos) {
		// TODO Auto-generated method stub

		IdDoble<T> tmp = primero;
		int cont = 0;
		while (pos <= darLongitud() - 1 && pos > cont) {
			cont++;
			tmp = tmp.darSiguiente();
		}

		if (primero.darSiguiente() == null && pos == 0) {
			primero = null;
			ultimo = null;
		}

		else if (pos == darLongitud()-1){
			IdDoble<T> ul = ultimo.darAnterior();
			ultimo.darAnterior().cambiarSiguiente(null);
			ultimo.cambiarAnterior(null);
			ultimo =ul;
			
		}

		else if (pos == 0) {
			IdDoble<T> prime = primero.darSiguiente();
			primero.cambiarSiguiente(null);
			prime.cambiarAnterior(null);
			primero = prime;
		

		} else {
			IdDoble<T> sig = tmp.darSiguiente();
			IdDoble<T> ant = tmp.darAnterior();
			
			if(sig!=null && ant!=null){
			ant.cambiarSiguiente(sig);
			sig.cambiarAnterior(ant);
			tmp.cambiarAnterior(null);
			tmp.cambiarSiguiente(null);
			}
		}

	}

	
	@SuppressWarnings("unchecked")
	public T buscarElemento(IdDoble<T> elem){
		IdDoble<T> elemento = null;
		IdDoble<T> temp = primero;
		
		while(temp!=null){
			if(temp==elem){
				elemento =  temp;
			}
				temp = temp.darSiguiente();
			
		}
		
		return (T) elemento;
	}
	
	public void cambiarPrimero(IdDoble<T> primero) {
		this.primero = primero;
	}


	public void cambiarUltimo(IdDoble<T> ultimo) {
		this.ultimo = ultimo;
	}

	/**
	 * darElemento, retorna un elemento de la lista
	 * pre: lista != vacio, pos<longitudLista y pos>=0
	 * @param: int pos, posicion del elemento buscado
	 * @return: retorna un T que se encuentre dentro de la lista
	 * @throws Exception 
	 */
	@Override
	
		public T darElemento(int pos)throws Exception {
			// TODO Auto-generated method stub
		IdDoble<T> tmp = primero;
		int contador = 0;
		while(pos <= darLongitud()-1 && pos > contador){
		contador ++;
		tmp = tmp.darSiguiente();
		}
		
		if(tmp.darElemento() != null){
			
			return tmp.darElemento();
		}
		
		else{
			throw new Exception("El elemento en esa posici�n es nulo o vacio");
		}
		}
		
		/*// TODO Auto-generated method stub
		
		IdDoble<T> temp = null;
		
		if(pos>darLongitud()-1){
			throw new Exception("La posicion dada es mayor a la longitud de la lista");
		}else {
			if(darLongitud()==0){
				throw new Exception("La lista est� vacia");
			}
			else {
				int contador=0;
				temp = primero;
				while(pos>contador){
					contador++;
					temp = temp.darSiguiente();
				}
			}
		}	
		return temp.darElemento();*/
	

	/**
	 * darLongitud: retorna la longitud de la lista
	 * @return: retorna un entero con la longitud de la lista
	 */
	@SuppressWarnings("unchecked")
	@Override
	public int darLongitud() {
		// TODO Auto-generated method stub
		
		int cont;
		IdDoble<T> tmp = primero;
		
		if(primero==null){
			cont=0;
		}else{
		
		cont=1;
		while(tmp.darSiguiente()!=null){
			cont++;
			tmp= tmp.darSiguiente();
		}
		}
		return cont;
	}

	
	/**
	 * esVacia, metodo que se encarga de verificar si esta vacia
	 * @return: retorna un valor de verdad si la lista esta o no vacia
	 */
	@Override
	public boolean esVacio() {
		
		boolean si = false;
		
		if(primero==null && ultimo ==null){
			si=true;
		}
		
		return si;
	}


	public IdDoble<T> darPrimero() {
		return primero;
	}


	

	public IdDoble<T> darUltimo() {
		return ultimo;
	}


	@SuppressWarnings("unchecked")
	public String print(){
		String cadena= "";
		IdDoble<T> actual=primero;
		for(actual=primero; actual!=null; actual=actual.darSiguiente()){
			cadena+=actual.darElemento()+" ";	
		}
		cadena+="--";
		//System.out.println(cadena);
		return cadena;
		
	}
	@SuppressWarnings("unchecked")
	public String printback(){
		String cadena="";
		IdDoble<T> actual;
		for(actual=ultimo; actual!=null; actual=actual.darAnterior()){
			cadena+=actual.darElemento()+ " ";	
		}
		cadena+="--";
		//System.out.println(cadena);
		return cadena;
	}
	
	public static void main(String[] args) {
		Doble<Integer> sorted = new Doble<Integer>();
		
			try {
				sorted.agregar(1);
				sorted.agregar(2);
				sorted.agregar(3);
				sorted.agregar(4);
				sorted.agregar(5);
				sorted.agregar(6);
				sorted.agregar(7);
				sorted.agregar(8);
				sorted.agregar(9);
				sorted.agregar(0);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
