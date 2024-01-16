package switch_case;

import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {

        // -----------------    CALCULE O SEU IMC   -------------------//

        Scanner sc = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();
        System.out.print("Digite o seu peso em Kgs: ");
        peso = sc.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5){
            System.out.println("Abaixo do Peso!");
        }
        else if (imc < 25){
            System.out.println("Peso ideal!");
        }
        else if (imc < 30){
            System.out.println("Sobrepeso!");
        }
        else if (imc < 40){
            System.out.println("Obesidade!");
        }
        else{
            System.out.println("Obesidade Mórbida!");
        }
    }
}
