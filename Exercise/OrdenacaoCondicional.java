package Exercise;

import Controller.Pilhas;
import Model.No;

public class OrdenacaoCondicional {
	No topo;
	Pilhas p = new Pilhas();
	
	public OrdenacaoCondicional() {
		topo = null;
	}
	
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		
		if (p.isEmpty() || elemento.dado <= 60) {
			elemento.proximo = topo;
		}
		
		topo = elemento;
	}
	
	public int pop(int e) throws Exception {
		int valor = 0;
		
		if (p.isEmpty()) {
			throw new Exception("Não há elementos para desempilhar!");
		} else if(e > 60) {
			valor = topo.dado;
			topo = topo.proximo;
		}
		return valor;
	}	
}

