package com.example.lab3;

public abstract class User {
    public String Name;
    public int ID;

    //getter
    public String getName() {
        return Name;
    }
    public int getID() {
        return ID;
    }
    public void setName(String newName) {
        this.Name = newName;
    }
    public void setID(int newID) {
        this.ID = newID;
    }
    //M
    abstract public String getSummary();
    //usera.Take_Notes();
}



//setter
    //public void setName(String newName){
    //    this.Name = newName;
    //}
   // public void setId(String newId){
    //    this.Id = newId;
    //}
    //Method
    //abstract public String getSummary();
    //void Take_notes(){




