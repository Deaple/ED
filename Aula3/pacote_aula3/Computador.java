package pacote_aula3;

public class Computador {

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    private int memoria;

    public int getMemoria() {
        return memoria;
    }

    public int getHd() {
        return hd;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getProcessador() {
        return processador;
    }
    private int hd;
    private int velocidade;
    private String processador;
    public Computador(int m, int h, int v, String p){
        memoria = m;
        hd = h;
        velocidade = v;
        processador = p;
    }
    public void imprimeCmp(){
        System.out.printf("%s Mhz -  HD %d GB - %d MB de RAM\n",processador,hd,memoria);
    }
}
