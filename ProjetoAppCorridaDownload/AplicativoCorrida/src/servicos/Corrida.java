package servicos;

import contas.Motorista;
import contas.Passageiro;
import java.util.Scanner;

public  class Corrida {
    //Atributos
    private String saida;
    private String destino;
    private double distancia;
    private int avaliacao;
    private String form_pag;
    private double valor;
    private double taxaKm;
    private String zona;
    Scanner scan = new Scanner(System.in);

    //Getters
    public String getSaida() {
        return saida;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public String getForm_pag() {
        return form_pag;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaKm() {
        return taxaKm;
    }

    public String getZona() {
        return zona;
    }
    
    //Setters

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setForm_pag(String form_pag) {
        this.form_pag = form_pag;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean setTaxaKm(String zona) {
        if(zona == "Norte" || zona == "norte"){
            taxaKm = 2.8;
            return true;
        }else if(zona == "Sul" || zona == "sul"){
            taxaKm = 3.2;
            return true;
        }else if(zona == "Oeste" || zona == "oeste"){
            taxaKm = 2.5;
            return true;
        }else if(zona == "Leste" || zona == "leste"){
            taxaKm = 3.5;
            return true;
        }else if(zona == "Centro" || zona == "centro"){
            taxaKm = 4;
            return true;
        }else{
            return false;
        }
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    //Metodos
    public void corrida(Motorista motorista, Passageiro passageiro, String saida, String destino, double distancia, String zona, String form_pag){
        if(setTaxaKm(zona)){
            System.out.println("Zona aceita e definida com sucesso");
            valorCorrida(distancia,taxaKm);
            System.out.println("Valor da corrida " + valor);
            System.out.println("Deseja prosseguir ? 1-Sim\n2-Nao");
            int resp = scan.nextInt();
            
            if(resp == 1){
               if(validarPagamento(form_pag, passageiro,valor)){
                    motorista.setSaldo(valor);
                    this.saida = saida;
                    this.destino = destino;
                    System.out.println("Qual sua avaliacao para esta corrida ?");
                    avaliacao = scan.nextInt();
                }else{
                    System.out.println("Pagamento não confirmado");
                }
            }
        }else{
            System.out.println("Falha ao concluir a corrida, zona inválida");
        }
        
    }
    
    public double valorCorrida(double distancia, double taxaKm){
        return distancia*taxaKm;
    }
    
    public boolean validarPagamento(String form_pag, Passageiro passageiro, double valor){
        if(form_pag == "dinheiro"){
            return true;
        }else if(form_pag == "cartao"){
            int cartao = 0;
            
            System.out.println("Qual cartao deseja utilizar ?");
            cartao = scan.nextInt();
            
            passageiro.pagar(valor, passageiro.getCartoes()[cartao-1]);
            return true;
        }else{
            return false;
        }
    }
}