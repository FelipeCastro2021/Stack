package View;

import Controller.Pilhas;

public class Principal {

	public static void main(String[] args) {
		Pilhas p = new Pilhas();
		p.push(5);
		p.push(4);
		p.push(3);
		p.push(2);
		p.push(1);
		
		int topo = 0;
		try {
			topo = p.top();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Topo: " + topo);
		
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
	}

}
