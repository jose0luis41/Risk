package TADHash;

import java.lang.reflect.Array;

import ListaSimple.ListaSimple;


public class TablaHash<K,T> implements IHash<K,T> {

	
    private int capacidad;
    
    private double Fcarga;
    
    private int numElementos;
    
    //private Bucket<K,T> primero;
    
    private Bucket<K,T>[] lista;
    
    private int colisiones;
    
    public final static int CAP = 10;
	
	
	public TablaHash(int Ncapacidad){
	capacidad = Ncapacidad;
	numElementos = 0;
	Fcarga = getfactorCarga();
	final Bucket<K, T>[] nuevo
	= (Bucket<K, T>[]) Array.newInstance(Bucket.class, capacidad);
	lista=nuevo;
	colisiones = 0;
	}
	
	private int Hash(K Llave){//throws Exception{
		int direccion = 0;
		
		if(Llave instanceof Integer){
		int n = (Integer) Llave;
			direccion = n % capacidad; 
		}
		
		else if(Llave instanceof String){
		String n = (String) Llave;	
			direccion = n.length() % capacidad;
		}
		
		else if(Llave instanceof Double){
		double n = (Double) Llave;
		   direccion = (int) n % capacidad;
		}
		else{
		//throw new Exception("No se está cumpliendo con la condición establecida");	
           direccion = -1;		
		}
		
		return direccion;
	}
	

	@Override
	public T buscar(K key) throws Exception{
		// TODO Auto-generated method stub
	Bucket<K,T> buscado = null;	
	
	if(key == null){
		throw new Exception("La llave es nula");
	}
	else{
		
	int pos = Hash(key);
	if(pos == -1){
		throw new Exception("No existe ese objeto");
	}
	else{
	buscado = lista[pos];	
	}
	}
	return buscado.getAtributo();
	}

	@Override
	public void insertar(K key, T atributo)throws Exception {
		// TODO Auto-generated method stub
	if(key == null || atributo == null){
		throw new Exception ("la llave o el atributo es nula");
	}
	else{
	int pos = Hash(key);
	Bucket<K,T> nuevo = new Bucket<K,T>(key, atributo);
	boolean seEncontro = false;
	
	for(int i=pos; !seEncontro; i++){
	if(i == CAP-1){
		i = 0;
	}
	else if(lista[i] == null){
	lista[i] = nuevo;
	seEncontro = true;
	}
	else{
		colisiones++;
	}
	}
	if(seEncontro)
		numElementos++;
	}
	}

	@Override
	public void eliminar(K key) throws Exception {
		// TODO Auto-generated method stub
	// Falta mover los objetos por colisiones
	for(int i=0; i < CAP; i++){
		
	if(lista[i].getLlave().equals(key)){
		lista[i] = null;
	}
	else{
	throw new Exception("No hay elemento con esa llave ");	
	}
	}
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

	@Override
	public double getfactorCarga() {
		// TODO Auto-generated method stub
		return numElementos/capacidad;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numElementos == 0;
	}
	
	
	//HashCode se ereda de la clase Object
	
	
    //mejores funciones de hashing
	//f(key) = [ M = [(key*A) mod 1]]
	// para A = 0.61803
	//Secuencia de Figonachi
	//
	
	//Donald Knuth, ¿Quien es?

}
