package model;

import java.io.Serializable;

public class Client implements Serializable {
    private String name;
    private String password;
    private int id;
    private boolean status;

    public Client(String name, String password) {
        this.name = name;
        this.password = password;
        this.status = false;
    }

    public Client(String name, String password, int id, boolean status) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
