package pacote_aula3;

public class Aula3 {
    public static void main(String[] args){
        /*Data d1 = new Data(2,3,2013);
        Data d2 = new Data(1,3,2014);
        Data.imprimeData(Data.maisRecente(d1, d2));
        Cliente c1 = new Cliente("joao",250,d1);
        Cliente c2 = new Cliente("jose",300,d2);
        Cliente.maisVelho(c1,c2);*/
        Computador comp1 = new Computador(4,250,3,"Xeon 100");
        Computador comp2 = new Computador(6,700,7,"Pentium 200");
        Computador comp3 = new Computador(2,1000,5,"Celeron 300");
        Empregado e1 = new Empregado("Joao",comp1);
        Empregado e2 = new Empregado("Pedro",comp2);
        Empregado e3 = new Empregado("Maria",comp3);

        System.out.println("Computadores: ");
        System.out.println("Nome: "+e1.getNome()+"\nComputador: ");
        e1.getPc().imprimeCmp();
        System.out.println("Nome: "+e2.getNome()+"\nComputador: ");
        e2.getPc().imprimeCmp();
        System.out.println("Nome: "+e3.getNome()+"\nComputador: ");
        e3.getPc().imprimeCmp();
        Empregado.transferir(e1,e2); //Transfere o PC de Joao p/ Pedro e compra um p/ Joao
      //  e1.getPc().imprimeCmp();    
      //  e2.getPc().imprimeCmp();
        Empregado.transferir(e3,e1); //Transfere o PC de Maria p/ Joao e compra um p/ Maria
        System.out.println("\n\nComputadores: ");
        System.out.println("Nome: "+e1.getNome()+"\nComputador: ");
        e1.getPc().imprimeCmp();
        System.out.println("Nome: "+e2.getNome()+"\nComputador: ");
        e2.getPc().imprimeCmp();
        System.out.println("Nome: "+e3.getNome()+"\nComputador: ");
        e3.getPc().imprimeCmp();
    }
}
