
package aula2703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Aula2703 {

    
    public static void main(String[] args) {
        List<String> pautaNomes = new ArrayList();
        
        pautaNomes.add("Erick");
        pautaNomes.add("João Vitor");
        pautaNomes.add("Roberto");
        
        System.out.println("==================");
       for(int i = 0; i< pautaNomes.size();i++){
           System.out.println(pautaNomes.get(i));   
       }
        System.out.println("==================");
        for(String item : pautaNomes)
            System.out.println(item);
        
        Collections.sort(pautaNomes);
        
        System.out.println("==================");
        pautaNomes.forEach((item)->{
                    System.out.println(item);
        });
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        int idade;
        int [] todasIdades;
        List todasIdadesList = new ArrayList();
        
        idade = 27;
        todasIdades[0]= 28;
        todasIdadesList.add(29);
        
        System.out.println(idade);
        System.out.println(todasIdades[0]);
        System.out.println(todasIdadesList.get(0));
 */ 
    }
  
}
