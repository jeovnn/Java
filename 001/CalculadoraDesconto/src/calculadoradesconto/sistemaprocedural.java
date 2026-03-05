/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradesconto;

import java.text.DecimalFormat;

/**
 *
 * @author jeova
 */
public class sistemaprocedural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorvenda = 500.0;
        double valorfinal = aplicadesconto(valorvenda);
        exibirrelatorio(valorfinal);
        
    }
    public static void exibirrelatorio(double valor){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("venda finalizada. Valor: R$ " + df.format(valor));
    }
    
    public static double aplicadesconto(double valor){
        if (valor > 100) return valor * 0.90;
        return valor;
    }
    
}
