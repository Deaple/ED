package atividade_ed;
public class Pilha{
	private No topo;
	
	public Pilha(){
		topo = null; 
	}

	public int pop(){ //remove o primeiro item da pilha
		if(isEmpty()){
			System.out.println("Não há elementos para renover!");
			return 0;
		} else {
			int tmp = topo.getInfo();
			topo = topo.getProx();
			return tmp;
		}
	}

	public void push(int i){
		No novo = new No(i); //Cria um novo No com i
		novo.setProx(topo);	 //novo se torna o topo e dá continuidade no setProx(topo)
		topo = novo;		 //topo recebe novo, sendo o novo topo com uma info a mais
	}

	public boolean isEmpty(){
		return (topo==null);
	}

	//Exercicio

	public void uniao(Fila f){ //3 - Inserir uma fila no topo de uma pilha
		//topo da pilha deve ser = ao inicio da fila
		/*if(isEmpty()){
			topo = f.getInicio();
		}
		else{
			No tmp = topo.getProx();
			topo = f.getInicio();
			topo.setProx(tmp);
		}*/ //tentativa 1
		if(isEmpty()){
			topo = f.getInicio();
		}else{
			//No temp =  f.getInicio(); 
			//topo = f.getInicio();	//coloca o inicio da fila no topo da pilha
			//2 tentativa porem a fila é modificda
			Fila tmp = new Fila();
			tmp = f;
			tmp.getFim().setProx(topo);
			topo = tmp.getInicio();
		}	
	}

	public void printP(){
		No temp = topo;
		System.out.print("Pilha: ");
		while(temp!=null){
			System.out.print(temp.getInfo()+" ");
			temp = temp.getProx();
		}
		System.out.println();
	}

	public void removePilha(Fila f){ //4 - Remove um elemento da pilha e adiciona na fila f
		if(isEmpty()){
			System.out.println("Nao ha elementos na pilha para remover");
		}
		else {
			//f.enqueue(this.pop()); //adiciona o topo para a fila f
			f.enqueue(topo.getInfo());
			topo = topo.getProx();
		}
	}

	public static void unePilhas(Pilha p1, Pilha p2){//Une pilhas a e b, onde topo de p1 = topo de p2
		No tmp = p2.topo; //Referencia para TOPO de p2
		while(tmp.getProx()!=null){ //Enquanto o proximo no de tmp não for nulo
			tmp =tmp.getProx();		//Para quando o proximo(penultimo) no de tmp for nulo
		}
		tmp.setProx(p1.topo); 		//penultimo seta o ultimo para o TOPO de p1
		p1.topo= p2.topo;			//p1 recebe uma referencia de p2.topo, que tem porultimo elemento uma referencia de tmp
									//e tmp guarda o topo de p1
		p2.topo = null;				//esvazia a lista de p1, o GC resolve o resto
	}

}