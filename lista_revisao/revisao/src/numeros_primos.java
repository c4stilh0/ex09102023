import java.util.Scanner;

public class numeros_primos {
    public static void main(String[] args) throws Exception {
    int escolha;
    Scanner entrada = new Scanner(System.in);
    System.out.println("1. Executar o código \n2. Sair");
    escolha = entrada.nextInt();
    
    if(escolha == 1){
        for(int i = 1; i>=100;i++){
            for(int j = 1; i%j==0 && i != j; j++){

            }
        System.out.println(i);
        }
    
    } else if (escolha == 2){
        System.out.println("Finalizado! ");
    } else {
        System.out.println("erro");
    }
    entrada.close();
}
}


