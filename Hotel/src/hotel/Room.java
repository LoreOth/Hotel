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
public class Room {
    private Client data;
    private boolean busy;
    private int capacity;
    
    
    public Room(){
        this.busy=false;
        this.data=null;
        this.capacity=2;
    }

    public Client getData() {
        return data;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setData(Client data) {
        this.data = data;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    public void reserveRoom(Client aClient){
        this.busy=true;
        this.data=aClient;
        this.capacity=0;
        
    }
    public void vacateRoom(){
        this.busy=false;
        this.data=null;
        this.capacity=2; 
    }
    
    
}

