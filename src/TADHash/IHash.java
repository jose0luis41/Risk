package TADHash;

public interface IHash<K,T> {

	
public T buscar(K key)throws Exception;

public void insertar(K key, T atributo)throws Exception;

public void eliminar(K key)throws Exception;

public int getCapacidad();

public double getfactorCarga();

public boolean isEmpty();


}
