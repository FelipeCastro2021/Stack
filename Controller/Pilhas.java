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
			throw new Exception("N�o h� elementos para desempilhar!");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("N�o h� elementos na pilha!");
		}
		
		return topo.dado; // Dado do topo
	}
	
	// Opera��o destrutiva
	public int size() {
		int cont = 0;
		
		if (!isEmpty()) {
			No auxiliar = topo; // Topo aponta para todos os dados presentes na pilha. Fazendo uma duplicada da pilha no AUXILIAR
			cont = 1;
		
			while (auxiliar.proximo != null) { // Enquanto ponteiro n�o estiver apontando para nulo
				cont++;
				auxiliar = auxiliar.proximo; // Vai passando cada valor para auxiliar. Substituindo o topo pelo pr�ximo ficando nula em algum momento
			}
		}
			
		return cont;
	}
}
