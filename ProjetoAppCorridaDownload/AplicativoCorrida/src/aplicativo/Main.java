package aplicativo;

import contas.Motorista;
import contas.Passageiro;
import contas.Cadastrar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("Bem-vindo a Expresso City\n\n1-Cadastrar\n2-Logar\n3-Sair");
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Voce e\n1-Passageiro\n2-Motorista");
                    op=scan.nextInt();
                    switch(op){
                        case 1:
                            break;
                        case 2:
                            Cadastrar.cadastroMotorista();
                            break;
                        default:
                            System.out.println("Opcao invalida");
                    }break;       
            }
        }while(op < 3);
    }
}