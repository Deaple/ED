package atividade_ed2;
 
//import javax.swing.*;
 
public class Lista {
    //Lista encadeada (não completa- para exercício)
 
    private No inicio;
 
    public Lista() {
        inicio = null;
    }

    //Lista FTC - questao 3 - a
    public static void concatenar(Lista l1, Lista l2){
        No tmp = l1.inicio;
        //No ant = temp;
        while(tmp.getProximo()!=null){
            //ant = temp;
            tmp = tmp.getProximo();
        } //acaba o laco quando chegar no penultimo no
        tmp.setProximo(l2.inicio);
    }

    //transferir a lista maior - funcionando! 
    public static void intercalar3(Lista l1, Lista l2){
        if(l1.inicio==null||l2.inicio==null)
            System.out.println("Não há como intercalar listas vazias!");
        else {
            Lista l3 = new Lista();
            //No ant = l1.inicio;
            //verificar qual a lista com maior numero de noss, essa sera a lista "lider"
            No ant = l1.numPosicoes()>=l2.numPosicoes()?l1.inicio:l2.inicio;
            No prox = ant.getProximo();
            //No no2 = l2.inicio;
            //verificar qual a lista com menor numero de noss, essa sera a lista que perdera os nos
            No no2 = l1.numPosicoes()<l2.numPosicoes()?l1.inicio:l2.inicio;
            //Enquanto houver elementos na lista
            while(no2!=null){
                //Pega a informação do no da lista menor
                No novo = new No(no2.getInfo());
                //O novo no criado com a info da menor lista sempre aponta pro proximo no da maior lista
                novo.setProximo(prox);
                //Se for o No inicial, onde o ant.prox == prox, apenas o ant recebe o novo na 2ª posicao    
                if(ant.getProximo()==prox){
                    ant.setProximo(novo);
                    //Senao, e o novo no já foi incluido
                } else {
                    //o novo No passa a setar para o proximo do prox(um no a frente do que sera colocado)
                    novo.setProximo(prox.getProximo());    
                    //Seta o proximo de prox para o novo valor a ser inserido
                    prox.setProximo(novo);
                    //Pula o valor inserido e pega o proximo no da maior lista
                    prox = prox.getProximo().getProximo();
                }
                //controla o loop
                no2 = no2.getProximo();
        }
    }

    //segunda tentativa errada
    public static Lista intercalar2(Lista l1, Lista l2){
        Lista l3 = new Lista();
        No tmp_l1 = l1.inicio, tmp_l2 = l2.inicio, tmp_l3=l3.inicio;

        if(l1.numPosicoes()>=l2.numPosicoes())
            while(tmp_l1!=null){
                //
                //l3.incluir(tmp_l1.getInfo());
                if(tmp_l3==null){//lista vazia
                    tmp_l3 = tmp_l1;//começa com o primeiro No de l1
                } 
                if(tmp_l2!=null){
                    tmp_l3.setProximo(tmp_l2);    
                    tmp_l2 = tmp_l2.getProximo();
                }
                tmp_l1 = tmp_l1.getProximo();    
                tmp_l3.setProximo(tmp_l1);
            }
        else
            while(tmp_l2!=null){
                if(tmp_l3==null){
                    tmp_l3 = tmp_l2;
                } 
                if(tmp_l1!=null){
                    tmp_l3.setProximo(tmp_l1);    
                    tmp_l1 = tmp_l1.getProximo();
                }
                tmp_l2 = tmp_l2.getProximo();    
                tmp_l3.setProximo(tmp_l2);
            }
        l3.inicio = tmp_l3;
        return l3;    
    }

    //Lista FTC - questao 3 - b - funcionando, porém mal interpretada
    public static void intercalar(Lista l1, Lista l2){
        //poe uma lista no meio da outra
        if(l1.isEmpty()||l2.isEmpty()){
            System.out.println("Impossivel, uma das listas esta vazia!");
            return;
        }
        int meio=1,pos=1;
        No tmp = l1.inicio;  
        No ant = tmp;
        if(l1.numPosicoes()>1)  //Se a l1 tiver mais de uma posicao
            meio=l1.numPosicoes()/2; //calcula o meio com a funcao numPosicoes()

        while(pos<=meio){//até achar o meio
            ant = tmp;  //anterior ao tmp
            tmp = tmp.getProximo(); //percorre a lista
            pos++;  
        }
        //quando achar o meio da lista, seta pro anterior ao tmp o inicio da l2
        ant.setProximo(l2.inicio);
        //Agora percorre do anterior ao final da l2
        No tmp2 = ant; 
        while(tmp2.getProximo()!=null){
            tmp2 = tmp2.getProximo();
        }//percorre até o penultimo No

        tmp2.setProximo(tmp);//seta o resto da l1(tmp) para a concatenação de l1/2 e l2
        l2.inicio = null;   //acaba com l2
    }
    //exercicio
    public void insert(int e){
        No novo = new No(e);
        if(isEmpty()){
            inicio = novo;
        }   
        else{
            No tmp = inicio;
            while(tmp!=null){
                if(novo.getInfo()==tmp.getInfo()){
                    System.out.println(novo.getInfo()+" já existe!");
                    return;
                }
                else
                    tmp = tmp.getProximo();
            }
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void incluir(int e) {
        No novo = new No(e, null);
        if (isEmpty()) {
            inicio = novo;
        } else {
            novo.setProximo(inicio); //Se já houver elementos, seta o prox No com o inicio
            inicio = novo;           //E substitui o inicio pelo novo No
        }
    }
 
    boolean isEmpty() {
        return (inicio == null);
    }
 
    public void removerPos(int posicao) {//Recebe uma posição especifica da lista e a remove
        //Receber a posição, verificar se a lista contém o numeros de posições suificientes
        if((this.numPosicoes()<posicao)||posicao<=0){//Se houver menos No's na lista do que a posição/quantidade requerida
            System.out.println("Numero inválido! \nNumero de posições da lista: "+this.numPosicoes()+"\nPosição procurada: "+posicao);
            return;
        }
        else{//Se houver posições suficientes
            No temp, ant;
            ant = temp = inicio; 
            if((posicao == 1)&&(inicio.getProximo()!=null))//se a primeira elemento e existir mais de um No
                inicio = temp.getProximo();
            else{
                int pos = 1;
                while(pos!=posicao){  //Varre os No's até achar a posição
                    ant = temp;
                    temp = temp.getProximo();
                    pos++;
                }
                int val = temp.getInfo(); //Guarda o valor encontrado na posição
                ant.setProximo(temp.getProximo()); //remove o nó, setando o nó aterior para apontar para dois nós a frente
            }
        }   
    }
 
    public void removerElem(int e){
        No temp = inicio;
        No ant = inicio;
        int valor = inicio.getInfo();
        while ((temp.getProximo() != null) && (valor != e)) {//enquanto houver elemento na lista e o valor for diferente do procurado
            ant = temp;                 //No anterior ao temp
            temp = temp.getProximo();   //Controle do No
            valor = temp.getInfo();     //Informação
        }
 
        if ((temp.getInfo()== e) && (temp == inicio))//Se o valor procurado está na posição inicial da lista
        {
            if (inicio.getProximo() != null) {//Se houver mais elementos na lista
                inicio = inicio.getProximo();  //então o valor do inicio recebe o próximo nó
            }
            else
            {
                inicio = null;                  //Se houver apenas um elemento, então o inicio é nulo
            }
        }
        else if (temp.getInfo()== e) {          //Se o valor procurado não estiver na posição inicial e o valor procurado estiver na posição de temp.getInfo()
            ant.setProximo(temp.getProximo());  //anterior seta o nó temp para um nó à frente
        } else {                                //Se o valor não for encontrado, então ele não está na lista
            //JOptionPane.showMessageDialog(null, "O elemento nao esta na Lista");
            System.out.println("O elemento não está na lista");
        }
    }
 
    public void print() {
        No temp = inicio;
        String saida = "";
        while (temp != null) {
            saida += temp.getInfo() + " ";
            temp = temp.getProximo();
        }
        System.out.println("Lista: "+saida);
        //JOptionPane.showMessageDialog(null, saida);
    }
 
    public boolean pesquisaElem(int e) {
        No temp = inicio;
        if (inicio == null) {
            return false;
        } else {
            while (temp != null) {
                if (e == temp.getInfo()) {
                    return true;
                } else {
                    temp = temp.getProximo();
                }
            }
        }
        return false;
    }
 
    public int numPosicoes() {      //Retorna o numero de No's da lista
        if (isEmpty()) {            //Se a lista não tiver elementos, retorna 0
            return 0;
        }
        else {                      //Se houver elemetos, verifica quantas No's há na lista
            No temp = inicio;
            int num = 0;
            while (temp != null) {  //Enquanto houver elementos na lista
                num++;              //Contabiliza o numero de No's
                temp = temp.getProximo();
            }
            return num;
        }
    }

    public int pesquisaPos(int e) { //Pesquisa a posição de um elemento pelo seu valor e retorna sua posição
        No temp = inicio;
        int pos = 1;
        //int aux = 1;  Variavel inutil??
        if (inicio == null) {               //Se não houver elementos na lista, então retorna 0
            return 0;
        } else {
            while (temp != null) {          //Enquanto houver elementos na lista
                if (e == temp.getInfo()) {  //Se o elemento for encontrado neste nó, então retorna sua posição
                    return pos;
                } else {                    //Se o elemento ainda não foi encontrado, incrementa a posição
                    //aux++;  Variavel inutil??
                    pos++;
                    temp = temp.getProximo();
                }
            }
        }
        return 0;
    } 
    //questao 2 - prova
    public int remover(int k){//Remove todas as ocorrencias de k de dentro da lista
        No ant = inicio;
        No tmp = inicio;
        int val=0;
        while(tmp!=null){  
            if(inicio.getInfo()==k){    //Se o elemento estiver no iniciod a lista
                val = inicio.getInfo(); //pega o valor
                inicio = inicio.getProximo();   //seta o inicio para o prox elemento
                tmp = inicio;                   //tmp é inicio
                ant = tmp;                      //e ant é tmp
            }
            else{                           //Se o elemento nao estiver no inicio
                if(tmp.getInfo()==k){       //se o elemento for encontrado
                    val = tmp.getInfo();    //pega o valor
                    ant.setProximo(tmp.getProximo());   //seta o anterior para um No a frente do que contem o elemento k
                    tmp = tmp.getProximo();             //retira o no que contem o elemento k
                }
                else{                   //se o elemento nao for encontrado, percorre a lista
                    ant = tmp;
                    tmp = tmp.getProximo();
                }
            }
        }
        return val; //retorna o valor encontrado ou 0 se nao achou nada
    }
    
    //questao 3 - prova
    public void inserirK(int e, int k){
        int pos = 1;
        No tmp = inicio;
        No ant = inicio;
        while((tmp!=null)&&(pos!=k)){
            ant = tmp;
            tmp = tmp.getProximo();
            pos++;
        }

        if((pos==k)&&(this.numPosicoes()>=k)){
            No novo = new No(e);
            ant.setProximo(novo);
            novo.setProximo(tmp);
        }    
        else
            System.out.println("Posicao nao encontrada!");
    }    
}