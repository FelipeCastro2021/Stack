package View;

import Controller.Pilhas;
import Exercise.OrdenacaoCondicional;

public class Principal {

	public static void main(String[] args) {
		Pilhas p = new Pilhas();
		OrdenacaoCondicional oc = new OrdenacaoCondicional();
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		
		int topo = 0;
		try {
			topo = p.top();
			System.out.println("Topo: " + topo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int tamanho = p.size();
		
		System.out.println("Tamanho da pilha: " + tamanho);
		
		while (!p.isEmpty()) {
			int dado;
			try {
				dado = p.pop();
				System.out.println(dado);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("");
			
			tamanho = p.size();
			System.out.println("Tamanho da pilha: " + tamanho);
			try {
				topo = p.top();
				System.out.println("Topo: " + topo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=======================================================================");
		
		int[] valores = {10, 50, 15, 99, 152, 18, 44, 93, 118, 60, 75, 63};
		
		for (int valor : valores) {
			if (p.isEmpty()) {
				p.push(valor);
			} else if (valor <= 60) {
				p.push(valor * 2);
			} else {
				try {
					System.out.println(p.pop());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
