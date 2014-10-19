package Colas;

import ListaDoble.Doble;
import ListaDoble.IdDoble;

public class Cola <T> implements QueueInterface<T>{
/**
 * Relacion ccon la clase Doble<T> la cual va a representar una cola
 */
protected Doble<T> cola;

/**
 * Constructor de la clase Cola, inicializa la relacion cola	
 */
public Cola(){
cola = new Doble<T>();
}
/**
 * Metodo: isEmpty()
 * metodo el cual se encarga de verificar si la cola esta vacia
 * @return: True, si esta vacia; False, si no lo esta 	
 */
public boolean isEmpty() {
return cola.esVacio();
}

/**
 * Metodo: getFront()
 * metodo el cual se encarga de retornar el primero de la cola
 * @return IdDoble<T>, con el primero de la cola	
 */
public IdDoble<T> getFront() {
return cola.darPrimero();
}

/**
 * Metodo: getBack()
 * metodo el cual se encarga de retornar el ultimo de la cola
 * @return IdDoble<T>, con el ultimo de la cola
 */
public IdDoble<T> getBack() {
return cola.darUltimo();
}

/**
 * Metodo: deQueue()
 * metodo el cual se encarga de desencolar en la cola(eliminar el primero)
 */
public void deQueue() {
cola.eliminar(0);	
}

/**
 * Metodo: enQueue()
 * metodo el cual se encarga de encolar en la cola(agregar de ultimo)
 * @param e , con el elemento el cual se va agregar
 */
public void enQueue(T e) {
cola.agregar(e);
}

/**
 * Metodo: clear()
 * metodo el cual se encarga de eliminar toda la cola	
 */
public void clear() {
cola = new Doble<T>();	
}

/**
 * Metodo: print()
 * metodo el cual se encarga de imprimir toda la cola de primero a ultimo
 */
public void print(){
cola.print();	
}

/**
 * Metodo: printback()
 * metodo el cual se encarga de imprimir toda la cola de ultimo a primero
 */
public void printback(){
cola.printback();	
}


}
