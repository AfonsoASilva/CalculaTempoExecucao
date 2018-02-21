import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.swing.JOptionPane;


public class CalcNumPrimo {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
        Random random = new Random();
        long tempoInicio;
        PrintWriter writer = new PrintWriter("dataset4.txt", "UTF-8");

		
		 int n[] = new int[10000];    
		 for (int i = 0; i < n.length; i++) {    
             n[i] = 100000000 + random.nextInt(1000000000);
             
             tempoInicio = System.currentTimeMillis();

             boolean primo = true;    
             for (int j = 2; j < n[i]; j++) {
                 if (n[i] % j == 0) {
                     primo = false;    
                     break;    
                 }    
             }    
             if (primo == true) {    
                 System.out.println(i+"-"+n[i] + " True ");
             }else{
            	 System.out.println(i+"-"+n[i] + " False ");
             }    
             writer.println(System.currentTimeMillis()-tempoInicio);         
         }		 
		 writer.close();
	}

}
