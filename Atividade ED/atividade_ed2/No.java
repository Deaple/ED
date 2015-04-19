package atividade_ed2;

public class No {

	private No prox;
	private int info;

	public No(int i,No p){
		prox = p;
		info = i;
	}

	public No(int i){
		info = i;
		prox = null;
	}

	public No getProximo(){
		return prox;
	}

	public int getInfo(){
		return info;
	}

	public void setProximo(No p){
		prox = p;
	}

	public void setInfo(int i){
		info = i;
	}
}