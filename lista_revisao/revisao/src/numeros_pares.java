import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) throws Exception {
        int escolha, i;
    Scanner entrada = new Scanner(System.in);
    System.out.println("1. Executar o código \n2. Sair");
    escolha = entrada.nextInt();
    i = 0;
    if(escolha == 1){
        while(i <= 200){
            if(i%2 == 0){
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    } else if (escolha == 2){
        System.out.println("Finalizado! ");
    } else {
        System.out.println("erro");
    }
    entrada.close();
    }
}
