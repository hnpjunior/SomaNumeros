/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package somanumero.somanumero;


/**
 *
 * @author hermes
 */

import java.util.Scanner; // Programa utiliza a classe Scanner

public class somanumero {
    
    // Método principal inicia a execução do aplicativo Java

public static void main( String[] args)

    {

       // Cria um Scanner para obter entrada da janela de comando
	
		Scanner input = new Scanner( System.in ); 

		int number1; // primeiro número a adicionar 
		int number2; // segundo número a adicionar 
		int sum;     // soma de number1 e number2        

		System.out.print( " Digite o primeiro número: "); // prompt        

		number1 = input.nextInt(); // lê o primeiro nº fornecido pelo usuário        
		System.out.print( " Digite o segundo número: ");// prompt        
		number2 = input.nextInt(); // lê o segundo mº fornecido pelo usuário        
		sum = number1 + number2 ; // soma os números e armazena o total em sum      
		System.out.printf("O resultado é " +sum);// exibe o resultado da soma    
	} 
    
    
    
}
