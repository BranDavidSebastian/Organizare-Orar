/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orar;

import java.util.Scanner;

/**
 *
 * @author David PC
 */
public class ActivitatiDidactice {
    
    public int durata;
    public String numeActivitate;
    public int pozActivitate;
    public Scanner scan = new Scanner(System.in);
    
    
        public Boolean activitateDidactica(String tipActivitate) {
           
        if (tipActivitate.equals("Da")){
            System.out.println("Activitatea este didactica!");
        return true;
        }
            
        else {
            System.out.println("Activitatea nu este didactica!");
            return false;
        }
            
    }
    
    public void participare(String partikip) {
        
        if (partikip.equals("Da"))
            System.out.println("Am participat la activitatea didactica");
        else
            System.out.println("Nu am participat la activitatea didactica");
    }
    
    public void parerePersonala (){
        String input = scan.nextLine();
        System.out.println("Parerea ta despre activitate este: ");
        System.out.println(input);

        
    }
    
    public void afisareOrar (){
    
            System.out.println("Activitatea cu numarul " + pozActivitate + ", a fost " + numeActivitate + ". a durat " + durata + " ore " );
    
}
    
    
}
