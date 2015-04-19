package atividade_ed;
public class Principal{	
	public static void main(String[] args){
		
		//Questão 5
		/*Pilha p1 = new Pilha();
		Pilha p2 = new Pilha();

		for(int i=0;i<5;i++){
			p1.push(i+1);
			p2.push(i + 2);
		}
		p1.printP();
		p2.printP();
		Pilha.unePilhas(p1,p2);
		p1.printP();
		p2.printP();
		Pilha p3 = new Pilha();
		p3.push(100);
		p3.push(42);
		p3.push(0);
		p3.push(10);
		p1.pop();
		Pilha.unePilhas(p3,p1);
		p1.printP();
		p3.printP();
		/*

		//Questão 4
		/*Fila f = new Fila();
		Pilha p = new Pilha();
		p.push(3);
		p.push(2);
		p.push(1);
		p.push(8);
		p.printP();
		p.removePilha(f);
		p.printP();
		f.imprimeFila();
		f.enqueue(9);
		f.enqueue(5);
		f.enqueue(10);
		p.push(21);
		p.push(12);
		p.removePilha(f);
		p.printP();
		f.imprimeFila();*/

		//Questão 3
		/*Fila f = new Fila();
		Pilha p = new Pilha();
		p.push(3);
		p.push(2);
		p.push(7);
		p.printP();
		f.enqueue(6);
		f.enqueue(1);
		f.enqueue(9);
		f.imprimeFila();
		p.uniao(f);
		Fila f1 = new Fila();
		for(int i=0;i<5;i++)
			f1.enqueue(i+1);
		p.pop();//-6
		p.pop();//-1
		p.uniao(f1);//+1,2,3,4,5
		p.pop();//-1
		p.printP();//2,3,4,5,9,7,2,3*/

		//Questão 1
		/*Fila f = new Fila();
		f.enqueue(6);
		f.enqueue(5);
		f.enqueue(4);
		f.enqueue(1);
		f.enqueue(8);
		f.imprimeFila();
		f.exercicio();
		f.getFim().setProx(null);//parar o loop
		f.imprimeFila();*/

		//Questão 2
		/*Fila a = new Fila();
		a.enqueue(1);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(8);
		a.enqueue(13);
		a.enqueue(56);
		a.enqueue(57);
		a.enqueue(60);
		a.enqueue(88);
		a.enqueue(99);
		Fila b = new Fila();//final: 4,8,56,60,88
		Fila c = new Fila();//final: 1,3,13,57,99
		while(!a.isEmpty()){
			int j = a.dequeue(); 
			if(j%2==0)
				b.enqueue(j);
			else
				c.enqueue(j);
		}
		b.imprimeFila();
		System.out.println();
		c.imprimeFila();*/
	}
}