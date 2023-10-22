import java.util.Scanner;
import java.text.DecimalFormat;

public class calculadora_imc {
    public static void main(String[] args) throws Exception {
        Double altura, peso, imc;
        int escolha;
        DecimalFormat decimal = new DecimalFormat(".00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a altura ");
        altura = entrada.nextDouble();
        System.out.println("Informe o peso: ");
        peso = entrada.nextDouble();
        imc = peso / (altura * altura);
        System.out.println(imc);
        System.out.println("Você é:\n1.Adulto\n2.Idoso");
        escolha = entrada.nextInt();
        if(escolha == 1){
            if(imc < 18.5) {
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está abaixo do peso ideal");
            } else if(imc >= 18.5 && imc <= 24.9){
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está no peso ideal");
            } else if(imc >= 25 && imc <= 29.9){
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com excesso de peso");
            } else if(imc >= 30 && imc <= 34.9){
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com Obesidade de Classe 1");
            } else if(imc >= 35 && imc <= 39.9){
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com Obesidade de Classe 2");
            } else {
                System.out.println("\nResultado\nAdulto "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com Obesidade de Classe 3");
            }
        } else if(escolha == 2) {
            if(imc <= 22){
                System.out.println("\nResultado\nIdoso "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com o peso abaixo do adequado");
            } else if(imc >= 22 && imc < 27){
                System.out.println("\nResultado\nIdoso "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com o adequado");
            } else {
                System.out.println("\nResultado\nIdoso "+altura+"m "+peso+"Kg\nIMC: "+decimal.format(imc)+"\nVocê está com sobrepeso");
            }
        }        

        entrada.close();
    }
    
}
