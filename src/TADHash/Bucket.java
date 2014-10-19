package TADHash;

public class Bucket<K,T> {


private T atributo;	
private K llave;
private Bucket<K,T> siguiente;

	
public Bucket(K Nllave, T Natributo){
	
llave = Nllave;
atributo = Natributo;
siguiente = null;
}
	
public T getAtributo(){
	return atributo;
}
	
public void setAtributo(T NAtributo){
	atributo = NAtributo;
}
	

public K getLlave(){
	return llave;
}
	
public void setLlave(K NLlave){
	llave = NLlave;
}

public Bucket<K,T> getSiguiente(){
	return siguiente;
}

public void setSiguiente(Bucket<K,T> nuevo){
	siguiente = nuevo;	
}

public String toString(){
 return (String) atributo;
}

public int hashCode(){
	
	
	
	
	return 0;
}

	
}
