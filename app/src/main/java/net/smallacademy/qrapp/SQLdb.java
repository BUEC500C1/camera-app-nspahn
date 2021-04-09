package net.smallacademy.qrapp;

public class SQLdb {
    private int id;
    private string user;
    private sting password;
    public string link;

    //CONSTRUCTOR
    public SQLdb(int id, string user, sting password, string link) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.link = link;
    }

    public SQLdb(int id){
    }

    //TO STRING
    @Override
    public String toString() {
        return "SQLdb{" +
                "id=" + id +
                ", user=" + user +
                ", password=" + password +
                ", link=" + link +
                '}';
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getUser() {
        return user;
    }

    public void setUser(string user) {
        this.user = user;
    }

    public sting getPassword() {
        return password;
    }

    public void setPassword(sting password) {
        this.password = password;
    }

    public string getLink() {
        return link;
    }

    public void setLink(string link) {
        this.link = link;
    }
}
