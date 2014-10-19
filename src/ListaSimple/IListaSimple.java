package ListaSimple;

public interface IListaSimple <T> {
		
		/**
		 * agrega un nuevo elemento a la lista
		 * <b>pre</b>: n!=null
		 * <b>pos</b>: la lista tiene un nuevo elemento
		 * @param: n,  elemento en la lista
		 */
		public void agregar(T valor);
		
		/**
		 * agregar, agrega un T en una posicion de la lista
		 * pre: pos>=0, valor != null
		 * pos: se agrega un nuevo T en pos a la lista
		 * @param: int pos, T valor
		 * @throws Exception si pos excede el tamaño de la lista
		 */
		public void agregar(int pos, T valor) throws Exception;
		
		/**
		 * eliminar, elimina un objeto de la lista
		 * pre: pos>=0, lista != vacio, pos<longitud
		 * pos: se elimina un elemento de la lista
		 * @param: int pos, posicion de el elemnto a elminar
		 * @throws Exception si pos excede el tamaño de la lista
		 */
		public void eliminar(int pos) throws Exception;

		/**
		 * darElemento, retorna un elemento de la lista
		 * pre: lista != vacio, pos<longitudLista y pos>=0
		 * @param: int pos, posicion del elemento buscado
		 * @return: retorna un T que se encuentre dentro de la lista
		 * @throws Exception si pos excede el tamaño de la lista
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
		public boolean esVacia();

	}


