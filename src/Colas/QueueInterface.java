package Colas;

import ListaDoble.IdDoble;

public interface QueueInterface<T> {
	
	/**
	 * Metodo: isEmpty()
	 * metodo el cual se encarga de verificar si la cola esta vacia
	 * @return: True, si esta vacia; False, si no lo esta 	
	 */
public boolean isEmpty();
	
/**
 * Metodo: getFront()
 * metodo el cual se encarga de retornar el primero de la cola
 * @return IdDoble<T>, con el primero de la cola	
 */
	
public IdDoble<T> getFront();
	
/**
 * Metodo: getBack()
 * metodo el cual se encarga de retornar el ultimo de la cola
 * @return IdDoble<T>, con el ultimo de la cola
 */
	
public IdDoble<T> getBack();
	
/**
 * Metodo: deQueue()
 * metodo el cual se encarga de desencolar en la cola(eliminar el primero)
 */
public void deQueue();
	
/**
 * Metodo: enQueue()
 * metodo el cual se encarga de encolar en la cola(agregar de ultimo)
 * @param e , con el elemento el cual se va agregar
 */
	
public void enQueue(T e);
	
/**
 * Metodo: clear()
 * metodo el cual se encarga de eliminar toda la cola	
 */
	
public void clear();

}
