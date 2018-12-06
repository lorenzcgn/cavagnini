/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavagnini;
import java.util.*;
import java.lang.*;

/**
 *
 * @author 75844087
 */
public class Cavagnini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String s = input.next();
        System.out.println(s);
        String  smax = s.toUpperCase();
        String smin = s.toLowerCase();
        System.out.println(smax+smin);
        
        
        
    }
    
}
