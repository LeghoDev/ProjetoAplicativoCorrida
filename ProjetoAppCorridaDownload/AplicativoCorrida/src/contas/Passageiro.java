package contas;

public class Passageiro extends Cliente {
    //Atributos
    private String enderecoCasa;
    private String enderecoTrabalho;
    private String enderecoSalvo[]= new String[10];
    private Cartao cartoes[] = new Cartao[10];
    private int cartoesCadastrados;
    
    //Construtores
    public Passageiro(){}
    public Passageiro(String nome, String sobrenome){
        super(nome, sobrenome);
    }
    public Passageiro(String nome, String sobrenome, String enderecoCasa){
        super(nome, sobrenome);
        this.enderecoCasa = enderecoCasa;
    }
    public Passageiro(String nome, String sobrenome, String telefone, String enderecoCasa){
        super(nome, sobrenome, telefone);
        this.enderecoCasa = enderecoCasa;
    }   
    public Passageiro(String nome, String sobrenome, String telefone, String enderecoCasa, String enderecoTrabalho){
        super(nome, sobrenome,telefone);
        this.enderecoCasa = enderecoCasa;
        this.enderecoTrabalho = enderecoTrabalho;
    }

    //Getters
    public String getEnderecoCasa() {
        return enderecoCasa;
    }
    public String getEnderecoTrabalho() {
        return enderecoTrabalho;
    }
    public String[] getEnderecoSalvo() {
        return enderecoSalvo;
    }
    public Cartao[] getCartoes() {
        return cartoes;
    }
    public int getCartoesCadastrados() {
        return cartoesCadastrados;
    }
    
    //Setters
    public void setEnderecoCasa(String enderecoCasa) {
        this.enderecoCasa = enderecoCasa;
    }
    public void setEnderecoTrabalho(String enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }
    public void setEnderecoSalvo(String[] enderecoSalvo) {
        this.enderecoSalvo = enderecoSalvo;
    }
    public void setCartoes(Cartao[] cartoes) {
        this.cartoes = cartoes;
    }
    public void setCartoesCadastrados(int cartoesCadastrados) {
        this.cartoesCadastrados = cartoesCadastrados;
    }
    
    //Metodos
    public void cadastrarCartao(int num, String titular, int cvv, String vencimento, double saldo){
        if(cartoesCadastrados < 10){
            this.cartoes[cartoesCadastrados] = new Cartao(num,titular,cvv,vencimento, saldo);
            cartoesCadastrados++;
            if(cartoesCadastrados > 9){
                cartoesCadastrados = 9;
            }
        } 
    }
    public void removerCartao(int n){
        int pos = n-1;
        
        for(int i=pos; i < cartoes.length-1; i++){
            cartoes[i]=cartoes[i+1];
        }
        cartoes[cartoes.length-1]=null;     
    }
    public void mostrarCartoes(Cartao[] cartao){
        for(int i=0; cartao[i] != null; i++){
            System.out.println("Numero do cartao: " + cartao[i].getNum());
            System.out.println("CVV do cartao: " + cartao[i].getCvv());
            System.out.println("Titular do cartao: " + cartao[i].getTitular());
            System.out.println("Vencimento do cartao: " + cartao[i].getVencimento());
            System.out.println("Saldo do cartao R$" + cartao[i].getSaldo());
            System.out.println();
        }
    }
    public void pagar(double valor, Cartao cartao){
        cartao.pagar(valor);
    }
}
