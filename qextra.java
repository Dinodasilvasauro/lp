package questaoextra;

import java.util.Scanner;


public class QuestaoExtra {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        int[] listaA;
        listaA = new int[10];
        int[] listaB;
        listaB = new int[10];
        
        for(int i = 0; i < 10; i++){
            listaA[i] = a.nextInt();
        }

        System.arraycopy(listaA, 0, listaB, 0, 10);
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9-i; j++){
                if (listaB[j] < listaB[j+1]){
                    int x = listaB[j]; 
                    listaB[j] = listaB[j+1]; 
                    listaB[j+1] = x;
                }
            }
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print(listaB[i] + " ");
        }
    }
}
