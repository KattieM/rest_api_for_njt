package com.example.demo.domain;


import javax.persistence.*;

@Entity
@Table(name = "credentials")
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Credentials() {
    }

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Credentials)) return false;

        Credentials credentials = (Credentials) obj;
        if(this.id.equals(credentials.getId())
                && this.username.equals(credentials.getUsername())
                && this.password.equals(credentials.getPassword()))
            return true;

        return false;
    }

    @Override
    public String toString() {
        String s = "username: " + username + "\npassword: " + password;
        return s;
    }

}