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
public class Aplicatie {

  
    public static void main(String[] args) {
        
        int alegere;
        Boolean didactica;
        Scanner scan = new Scanner(System.in);
     
        ActivitatiDidactice acv1 = new ActivitatiDidactice();
       
       do {
        System.out.println("Care este activitatea? (curs/laborator/extrascolara");
        acv1.numeActivitate = scan.nextLine();
        
        System.out.println("Este activitatea didactica?");
        String activitate = scan.nextLine();
        acv1.activitateDidactica(activitate);
        
        if (acv1.activitateDidactica(activitate)){
        System.out.println("Vei participa la activitate?");
        acv1.participare(scan.nextLine());
        }
        
        System.out.println("Parere despre activitate");
        acv1.parerePersonala();
        
         System.out.println("A cata activitate a zilei este?");
         acv1.pozActivitate = scan.nextInt();
        
         System.out.println("Cate ore va dura?");
         acv1.durata = scan.nextInt();
        
        acv1.afisareOrar();
        System.out.println("Doriti sa introduceti o noua activitate? \n [1]Da \n [2] Nu");
         alegere = scan.nextInt();
       }
        while (alegere == 1);
        
        
    }
    
}
