package ListaSimple;

import ListaSimple.IListaSimple;

public class ListaSimple<T> implements IListaSimple<T> {
	

	private NodoSimple<T> first;
	
	public ListaSimple(){
		first=null;
	}

	@Override
	public void agregar(T valor) {
		if(first==null){
			first= new NodoSimple<T>(valor);
		}
		else{
			NodoSimple<T> newN= new NodoSimple<T>(valor);
			NodoSimple<T> temp=first;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(newN);
		}
	}

	@Override
	public void agregar(int pos, T valor){
		
		if(pos==darLongitud()||pos>darLongitud()){
			throw new IndexOutOfBoundsException();
		}
		if(pos==0){
			NodoSimple<T> nuevo = new NodoSimple<T>(valor);
			nuevo.setNext(first);
			first=nuevo;
		}
		if(pos==darLongitud()-1){
			NodoSimple<T> newN= new NodoSimple<T>(valor);
			NodoSimple<T> temp=first;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(newN);
		}
		int counter=0;
		NodoSimple<T> nuevo = new NodoSimple<T>(valor);
		NodoSimple<T> temp2=first;
		while(counter<pos-1){
			temp2=temp2.getNext();
			counter++;
		}
		nuevo.setNext(temp2.getNext());
		temp2.setNext(nuevo);
	}

	@Override
public void eliminar(int pos){
		
		int counter=0;
		boolean deleted=false;
		if(pos>=this.darLongitud()){
			throw new IndexOutOfBoundsException("posicion mayor que longitud");
		}
	
			if(pos==0){
				if(first.getNext()!=null){
					first=first.getNext();
				}
				else{
				first=null;
				deleted=true;
				}
			}
			else{
				NodoSimple<T> temp=first;
				NodoSimple<T> temp3=null;
				while(counter<pos){
					temp=temp.getNext();
					counter++;
					if(temp3==null){
						temp3=first;
					}
					else{
						temp3=temp3.getNext();
					}
				}
				NodoSimple<T> temp2=temp.getNext();

				temp3.setNext(temp2);
				temp.setNext(null);
				deleted=true;
			}

	}

	@Override
	public T darElemento(int pos){
		
		int counter=0;
		NodoSimple<T> temp2=first;
		while(counter<pos){
			temp2=temp2.getNext();
			counter++;
		}
		return temp2.getElement();
	}

	@Override
	public int darLongitud() {
		if(first==null){
			return 0;
			
		}else{
			
			int cont = 1;
			NodoSimple<T> tem = first;
			while(tem.getNext()!=null){
				cont++;
				tem =tem.getNext();
			}
			return cont;
		}
	}

	@Override
	public boolean esVacia() {
		
		if(first==null){
			return true;
		}
		else{
			return false;
		}
	}

}
