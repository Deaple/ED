package pacote_aula3;

public class Cliente {
    String nome;
    Data nascimento;
    int nr_conta;
    double saldo;
    public Cliente(String n, double s, Data dn){
        nome = n;
        saldo = s;
        nascimento = dn;
    }
    public Cliente(String n, double s, int d, int m, int a){
        nome = n;
        saldo = s;
        nascimento = new Data(d,m,a);
    }
    public static void maisVelho(Cliente c1, Cliente c2){
         Data novo = Data.maisRecente(c1.nascimento, c2.nascimento);
         if(novo == c1.nascimento)//c2 é mais velho
             System.out.println(c2.nome);
         else                     //c1 é mais velho  
             System.out.println(c1.nome);
    }
}
