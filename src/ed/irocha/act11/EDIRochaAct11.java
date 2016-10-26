/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.act11;
import lalibreria.*;
/**
 *
 * @author casa
 */
public class EDIRochaAct11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        deque list = new deque();
        list.insertfirst(12);
        list.insertlast(24);
        list.insertlast("achu");
        list.insertlast(36);     
        list.insertfirst(48);
        list.insertlast(60);
        list.insertfirst(72);
        list.showlist();
        System.out.println("El tamaño es " + list.getsize()); 
        list.deletefirst();       
        list.deletelast();
        list.showlist();
        list.elist();           
        System.out.println("El tamaño es " + list.getsize());
        // TODO code application logic here
    }
    
}
