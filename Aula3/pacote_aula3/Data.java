package pacote_aula3;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int d, int m, int a){
        if((d >= 1)&&(d <= 31))
            dia = d;
        else 
            dia = 1;
        if((m >= 1)&&(m <= 12))
            mes = m;
        else 
            mes = 1;
        if(a >= 2000)
            ano = a;
        else
            ano = 2000;
    }
    public static Data maisRecente(Data d1, Data d2){
         if(d1.ano >= d2.ano)
             if (d1.mes >= d2.mes)
                 if(d1.dia >= d2.dia)
                      return d1;
                 else
                     return d2;
             else 
                 return d2;
         else
             return d2;
    }
    public static void imprimeData(Data d1){
        System.out.printf("%02d/%02d/%04d\n",d1.dia,d1.mes,d1.ano);
    }
            
}
