/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohstatic;

/**
 *
 * @author Fadhiil Rachman
 */
public class ContohStatic {
    static void iLoveYou(){
        System.out.println("I love you");
    }
    void berliana(){
        System.out.println("Berliana...");        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iLoveYou();
        (new ContohStatic()).berliana();
    }
    
}