package atividade_ed;
public class No{
	private int info;
	private No prox;
	
	public No(int i, No p){
		info = i;
		prox = p;
	}	

	public No(int i){
		info = i;
		prox = null;
	}

	public int getInfo(){
		return info;
	}

	public No getProx(){
		return prox;
	}

	public void setInfo(int i){
		info = i;
	}

	public void setProx(No p){
		prox = p;
	}
}