package pacote_aula3;

import java.util.Scanner;

public class Empregado {

    private String nome;
    private Computador pc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPc(Computador pc) {
        this.pc = pc;
    }

    public Computador getPc() {
        return pc;
    }
    
    public Empregado(String n, Computador c){
        nome = n;
        pc = c;
    }
    
    public Empregado(String n, int m, int h, int v, String p){
        nome = n;
        pc = new Computador(m,h,v,p);
    }

    private  Computador comprar(){
        int h,m,v; String p;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os dados do novo computador");
        System.out.println("Processador: ");
        p = in.nextLine();
        System.out.println("Velocidade: ");
        v = in.nextInt();
        System.out.println("HD: ");
        h = in.nextInt();
        System.out.println("Memória: ");
        m = in.nextInt();
        Computador c = new Computador(m,h,v,p);
        return c;
    }

    public static void transferir(Empregado e1, Empregado e2){
        System.out.printf("\nPC de %s :\n",e1.nome);
        e1.pc.imprimeCmp();
        System.out.printf("Será transferido para %s \n",e2.nome);
        e2.pc = e1.pc;
        e1.pc = e1.comprar();
    }
    public void transferir(Empregado e2){
        System.out.printf("\nO PC de %s foi transferido para %s \n",this.nome,e2.nome);
        e2.pc = this.pc;
        this.comprar();
    }
    public static void troca(Empregado e1, Empregado e2){
        System.out.printf("\nO PC de %s foi transferido para %s \n",e1.nome,e2.nome);
        Computador pc_tmp = e1.pc;
        e1.pc = e2.pc;
        e2.pc = pc_tmp;
    }
}