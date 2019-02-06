package com.Security.security.Entity;

import javax.persistence.*;

@Entity
@Table(name="someData_table", catalog = "latecoredb")

public class SomeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="someData_id")
    private Long id;

    @Column(name="someData_mesage")
    private String mesage;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    public SomeData() {
    }

    public SomeData(String mesage, User user) {
        this.mesage = mesage;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
