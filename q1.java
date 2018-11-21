package questao1;

import java.util.Scanner;

public class Questao1 {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int k = 0;
        int[] lista;
        lista = new int[10];
        
        for(int i = 0; i < 10; i++){
            lista[i] = a.nextInt();
            k+= lista[i];
        }
        
        System.out.println(k);
    }
    
}
