import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) throws Exception {
        int num, i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite qual tabuada deverá ser exibida: ");
        num = entrada.nextInt();
        i = 1;
        while(i<= 10){
            System.out.println(num*i);
            i++;
        }
        entrada.close();
    }
    
}
