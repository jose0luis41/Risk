package mundo;

import java.util.List;

public interface IHeap<T> {

	public void insertar(T elemento);

	public T eliminar(T elemento);

	public T buscar(T elemento);

    public List preOrder();

    public List inOrder();

	public List postOrder();

	public T getRaiz();

	public int getAltura();

	public int getPeso();

	public T getMenor();
		
	public T getMayor();
		
	

}
