
package Plantacao_De_Cafe;

import java.util.Scanner;

public class Plantacao_De_Cafe{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o custo da sua Plantação:");
        int custo = input.nextInt();
        
        System.out.println("Informe a quantidade de sacas Vendidas:");
        int QuantsacasVend = input.nextInt();
        
        int sacaDeCafe = 100;
        int valorTotalVend = QuantsacasVend * sacaDeCafe;
        System.out.println("Total das vendas de Café = "+valorTotalVend+" R$.\n");
        
        if(valorTotalVend > custo){
            int operacao1 = valorTotalVend - custo;
            System.out.println("- O seu lucro é "+operacao1+" R$.\n");
        }else{
            if(valorTotalVend == custo){
                System.out.println("O valor total das vendas de Café,");
                System.out.println(" se igualaram aos gastos de Plantação,");
                System.out.println("  por isso, você NÃO obteve Lucro.\n");
            }else{
                int operacao2 = custo - valorTotalVend;
                System.out.println("- O seu prejuizo é de "+operacao2+" R$.\n");
            }
        }
        
    }
    
}