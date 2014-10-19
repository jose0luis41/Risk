package ListaDoble;

public interface ILista <T>{
	

	
	
	/**
	 * Agregar
	 * <pre> valor!= null
	 * <pos> se agrega un nuevo elemento a la lista
	 * @param valor: indica el objeto que se va a agregar
	 */
	
	
	public void agregar(T valor);
	
	
	
	/**
	 * agregar, agrega un valor T en una posicion de la lista
	 * pre: pos>=0, valor != null
	 * pos: se agrega un nuevo T en pos a la lista
	 * @param: int pos, T valor
	 * @throws Exception 
	 * @trhows: lanza excepcion si pos excede el tama?o de la lista
	 */
	public void agregar(int pos, T valor) throws Exception;
	
	
	
	
	
	/**
	 * eliminar, elimina un objeto de la lista
	 * pre: pos>=0, lista != vacio, pos<longitud
	 * pos: se elimina un elemento de la lista
	 * @param: int pos, posicion de el elemnto a elminar
	 * @trhows : lanza una excepcion si el elemento no existe
	 */
	public void eliminar(int pos);
	
	
	/**
	 * darElemento, retorna un elemento de la lista
	 * pre: lista != vacio, pos<longitudLista y pos>=0
	 * @param: int pos, posicion del elemento buscado
	 * @return: retorna un T que se encuentre dentro de la lista
	 * @throws Exception 
	 */
	public T darElemento(int pos) throws Exception;
	
	
	/**
	 * darLongitud: retorna la longitud de la lista
	 * @return: retorna un entero con la longitud de la lista
	 */
	public int darLongitud();
	
	/**
	 * esVacia, metodo que se encarga de verificar si esta vacia
	 * @return: retorna un valor de verdad si la lista esta o no vacia
	 */
	public boolean esVacio();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
