import java.util.Random;// método do random

public class sena {


    public static void main(String[] args){

           Random generate = new Random();// recebendo um objeto desse tipo Random
           

           int i = 0;
           // loop vai repetir 6 vezes 
           while(i < 6){ 
            // gerando números aleatórios
            int number = generate.nextInt( 60);// próximo número inteiro
     

            System.out.println(number);
            
            //toda vez que fizer este bloco de código a variável i vai almentar em 1
            i = i + 1;
           }
    }
}


// como seria se fosse com o FOR()
/* 
for( int i = 0; i < 6; i++){ 
    // gerando números aleatórios
    int number = generate.nextInt( 60);// próximo número inteiro


    System.out.println(number);
    
    
   };

*/

// curiosidade dobre o for() no java em c++: for(;;) essa expressão faz loop infinito

// em linha de comando: não esquecer de compilar: javac sena.java
// depois: java sena
