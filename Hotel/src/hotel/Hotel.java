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
public class Hotel {

    private String name;
    private String address;
    private Room[] rooms;

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
        this.rooms = new Room[50];
        for (int i = 0; i < 50; i++) {
            this.rooms[i] = new Room();
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Given a customer C and a room number X, enter customer C in the room X. Assume that X is valid and that room is free.
    public void occupyRoom(Client C, int x) {
        this.rooms[x].reserveRoom(C);
        System.out.println("The room was successfully occupied");
    }

    //Given the ID of a client, release the room reserved by said client (consider that the secure DNI exists).
    public void freeRoom(int id) {
        boolean pude = false;
        int i = 0;
        while (i < 50 & !pude) {
            if (this.rooms[i].isBusy()) {
                if (this.rooms[i].getData().getNID() == id) {
                    this.rooms[i].vacateRoom();
                    pude = true;
                    System.out.println("The room was successfully released");
                }
                
            }
            i++;
        }

    }

    //Return the number of occupied rooms.
    public int occupiedRooms() {
        int i = 0;
        int total = 0;
        while (i < 50) {
            if (this.rooms[i].isBusy()) {
                total++;
            }
            i++;
        }

        return total;

    }
    
    @Override
    public String toString (){
        String aux="";
        for (int i=0; i<50; i++){
            if ( this.rooms[i].isBusy()){
                aux = aux +  this.rooms[i].getData().toString() +"***\n";
        }
        
    }
return aux;
}

}