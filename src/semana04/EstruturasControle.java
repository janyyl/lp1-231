package semana04;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class EstruturasControle {
       public static void main(String[] args) {
        // if 

        final int MAIORIDADE = 18;
        var idade = 17;

        if (idade >= MAIORIDADE) {
            System.out.println("Maior de idade"); 
        }
    
        var ligado = true;
        if (ligado) {
            System.out.println("Está ligado");
        } else {
            System.out.println("está desligado");
        }
        // switch
        // literal String
        // enoe

        int n = 3;
        switch (n) {
            case 1:
                System.out.println("numero 1");
                break;
            case 2:
                System.out.println("numero 2");
                break; 
            default:
                break;
    
        }

        int contador = 0;
        do {
                System.out.println("Do while ligad!");
                contador++;
        } while (contador < 3);


        // i = 0; 0 < 3: 
        // i = 2; 1 < 3:
        // i = 3; 2 < 3:
        // i = 0; 3 < 3: 

        for ( int i = 0; i < 3; i++) {
            System.out.println("For ligado!");

        }

        //String nome = "João";
 
        // Array 
        // armaneza mais de um elemento 
        // acesso vila index - numero inteiro
        // tamanho fixo no momento de criação 

        // nome = [_____, _____, _____]
        //
        String[] nomes = new String[3];
        nomes [0] =  "Maria";
        nomes [1] =  "Marta";
        nomes [2] =  "Marcia";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //foreach 
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        int[] numeros = { 1, 3, 5, 0 };
        for (int numero : numeros){
            System.out.println(numero);
        }



       }   
}
    