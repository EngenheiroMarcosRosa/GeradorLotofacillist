
package geradorlotofacillist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author marco
 */
public class GeradorLotoFacilList {
    
    int contador = 0;
    String valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
    
    public static void main(String[] args) {
        
        int contador = 0;
        String valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
        
        List<String> list = Arrays.asList(valores);
        Collections.shuffle(list);
                    while(contador < 15){
                        
                        System.out.print(list.get(contador));
                        contador++;
                        System.out.print(" ");
                    }
                        System.out.println("");
                }
    
}
