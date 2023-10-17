import java.util.Scanner;

public class sequencia {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        num = entrada.nextInt();
        while( num >= 0) {
            System.out.println(num);
            num--;
        }
        entrada.close();
    }
}
