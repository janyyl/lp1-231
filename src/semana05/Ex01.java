import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Olá, seja bem-vindo!");
        System.out.println("Insira as seguintes informações");
           Scanner sc = new Scanner  (System.in);
        System.out.println("Digite o comprimento do seu aquário");
        Double comprimento  = sc.nextDouble();
        System.out.println("Digite o valor da altura ");
        Double altura = sc.nextDouble();
        System.out.println("insira a largura do seu aquário");
        Double largura = sc.nextDouble();
        
        Double volume = (comprimento*altura*largura)/1000; 

        System.out.println("A quantiade do volume do seu aquário é, em litros:" + volume);


        System.out.println("Para calcularmos a temperatura do termotasto digite a temperatura do ambiente: ");
        Double temperatura_ambiente = sc.nextDouble();
        System.out.println("Digite a temperatura que deseja que o aquário atinja;");
        Double temperatura_desejada = sc.nextDouble();

        Double potencia = volume*0.05*(temperatura_desejada-temperatura_ambiente);

        System.out.println("A potencia do seu termostato em watts, será:");

        Double filtragem_minima = (volume*2);
        Double filtragem_maxima = (volume*3);

        System.out.println("Filtragem por hora minima deverá ser de:" + filtragem_minima);
        System.out.println("filtragem por hora maxima deverá ser de;" + filtragem_maxima);


        sc.close();

    }
}
