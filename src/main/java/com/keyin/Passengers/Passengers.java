package com.keyin.Passengers;

public class Passengers {
    private long Passid;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Passengers(long id, String firstName, String lastName, String phoneNumber){
        this.Passid = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
}
    public long getId(){
        return Passid;
    }

    public void setId() {
        this.Passid = Passid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setfirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {this.phoneNumber= phoneNumber;}
}
