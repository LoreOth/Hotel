/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel h = new Hotel("Favaloro", "Buenos Aires");
        
        Client c = new Client ("Juan", 123);
        Client c2 = new Client ("Pedro", 454);
        Client c3 = new Client ("Martin", 666);
        Client c4 = new Client ("Cesar", 111);
        Client c5 = new Client ("Lola", 222);
        Client c6 = new Client ("Frida", 444);
        
        h.occupyRoom(c, 2);
        h.occupyRoom(c2, 32);
        h.occupyRoom(c3, 22);
        h.occupyRoom(c4, 12);
        h.occupyRoom(c5, 8);
        h.occupyRoom(c6, 11);
        System.out.println("The number of occupied rooms is, \n");
        System.out.println(h.occupiedRooms());
        //The room whose ID is passed by parameter is released
        h.freeRoom(111);
        System.out.println("The number of occupied rooms is, \n");
        System.out.println(h.occupiedRooms());
        
        System.out.println("Client data, \n");
        System.out.println(h.toString());
        
        
    }
    
}
