package org.ex.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "FriendsAppHib")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "city", nullable = false)
    private String city;
     private LocalDateTime FriendCreatedOn= LocalDateTime.now();


    // Default constructor required by JPA
    public Friend() {}


    // All-args constructor
    public Friend(Long id, String name, String email, String phone, String city, String userName, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;

    }

    // Getters & Setters (follow JavaBean naming convention)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }


}
