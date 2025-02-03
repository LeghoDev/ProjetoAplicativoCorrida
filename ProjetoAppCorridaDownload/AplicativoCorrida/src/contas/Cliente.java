package contas;

public abstract class Cliente {
    //Atributos
    private String nome;
    private String sobrenome;
    private String telefone;
    private double saldo;
    private String usuario;
    private String senha;
    
    //Construtores
    public Cliente(){}
    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Cliente(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }
    
    //Getters
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSaldo(double saldo){
        this.saldo += saldo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
