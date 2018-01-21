package com.yet.spring.core.beans;

/**
 *
 * @author imxo
 */
public class Client {
    
    private String id;
    private String Fullname;

    public Client(String id, String Fullname) {
        this.id = id;
        this.Fullname = Fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

}
