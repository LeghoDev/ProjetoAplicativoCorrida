package contas;

import contas.Motorista;
import contas.Passageiro;
import java.util.Scanner;

public class Cadastrar {
    public static Scanner scan = new Scanner(System.in);
    public static Motorista []motoristas = new Motorista[200];
    public static Passageiro []passageiros = new Passageiro[200];
    public static int motoristasCadastrados;
    public static int passageirosCadastrados;
    
    public static void cadastroMotorista(){
        if(motoristasCadastrados < motoristas.length){
            motoristas[motoristasCadastrados] = new Motorista();
            
            System.out.println("Qual seu nome ?");
            motoristas[motoristasCadastrados].setNome(scan.next());
            
            System.out.println("Qual seu sobrenome ?");
            motoristas[motoristasCadastrados].setSobrenome(scan.next());
                
            System.out.println("Qual seu telefone ?");
            motoristas[motoristasCadastrados].setTelefone(scan.next());
                    
            System.out.println("Nº CNH");
            motoristas[motoristasCadastrados].setCNH(scan.nextInt());
                    
            
            System.out.println("Qual o modelo do veiculo ?");
            motoristas[motoristasCadastrados].setVeiculo(scan.next());
            
            System.out.println("Renavam ?");
            motoristas[motoristasCadastrados].setRenavam(scan.nextInt());
            
            System.out.println("Cadastro quase pronto\nDefina um usuario");
            motoristas[motoristasCadastrados].setUsuario(scan.next());
            
            System.out.println("Defina uma senha");
            motoristas[motoristasCadastrados].setSenha(scan.next());
            
            System.out.println("Cadastro concluido com sucesso");
        }
    }
}
