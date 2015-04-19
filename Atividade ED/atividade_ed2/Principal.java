package atividade_ed2;

public class Principal{
	public static void main(String[] args) {
		Lista l1 = new Lista();
		Lista l2 = new Lista();
		for(int i=0;i<=1;i++)
			l1.incluir(i);
		for(int i=4;i<7;i++)
			l2.incluir(i);
		l1.print();
		l2.print();
		Lista.intercalar3(l1,l2);
		l1.print();
		l2.print();
	}	

}