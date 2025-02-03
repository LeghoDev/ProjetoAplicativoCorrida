package contas;

public class Motorista extends Cliente{
    //Atributos
    private int CNH;
    private String veiculo;
    private int renavam;
    private double[] avaliacoes;
    private double nota;
    private int nViagens;
    
    //Construtores
    public Motorista(){}
    public Motorista(String nome, String sobrenome,int CNH, String veiculo, int renavam){
        super(nome, sobrenome);
        this.CNH = CNH;
        this.veiculo = veiculo;
        this.renavam = renavam;
    }
    public Motorista(String nome, String sobrenome, String telefone, int CNH, String veiculo, int renavam){
        super(nome, sobrenome, telefone);
        this.CNH = CNH;
        this.veiculo = veiculo;
        this.renavam = renavam;
    }

    //Getters
    public int getCNH() {
        return CNH;
    }
    public String getVeiculo() {
        return veiculo;
    }
    public int getRenavam() {
        return renavam;
    }
    public double[] getAvaliacoes() {
        return avaliacoes;
    }
    public double getNota() {
        return nota;
    }
    public int getnViagens() {
        return nViagens;
    }

    //Setters
    public void setCNH(int CNH) {
        this.CNH = CNH;
    }
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }
    public void setNota(double avaliacao) {
        avaliacoes[nViagens-1] = avaliacao;
        int avaliacoesTotais=0;
        
        for(int i=0; i < avaliacoes.length; i++){
            avaliacoesTotais += avaliacoes[i];
        }
        this.nota = avaliacoesTotais/nViagens;
    }
}
