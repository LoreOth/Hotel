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
public class Client {
    private String name;
    private int NID;

    public Client(String name, int NID) {
        this.name = name;
        this.NID = NID;
    }

    public String getName() {
        return name;
    }

    public int getNID() {
        return NID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }
    
    public String toString(){
        return this.getName()+"\n"+"NID"+this.getNID()+"\n";
    }
    
}
