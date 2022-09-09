package Controller;

import Model.No;

public class Pilhas {
	No topo;
	
	public Pilhas() {
		topo = null;
	}
	
	public boolean isEmpty() {
		return (topo == null);
	}
	
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		
		if (!isEmpty()) {
			elemento.proximo = topo;
		}
		
		topo = elemento;
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar!");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha!");
		}
		
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
		
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
			
		return cont;
	}
}
