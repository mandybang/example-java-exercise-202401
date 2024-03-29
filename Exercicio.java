import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp = 0;
        int soma = 0;

        for (int tempDia = 1; tempDia <= 12; tempDia++) {
            System.out.print("Digite a temperatura " + tempDia + " (entre 4 e 10): ");
            temp = input.nextDouble();

            if (temp >= 4 && temp <= 10) {
               soma += temp;
               
            }
            else {
                System.out.println("Favor digitar a temperatura entre 4 e 10ºC");
                tempDia--;
            }
        }
        System.out.println("A média de hoje das temperaturas é: " + soma/12 + " ºC");
        input.close();
    }
}

