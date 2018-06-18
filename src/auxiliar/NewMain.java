/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[20];
        int count = 0;
        
        while(count < 20) {
            Random r = new Random();
            int na = r.nextInt(10) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 20; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
    }
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
