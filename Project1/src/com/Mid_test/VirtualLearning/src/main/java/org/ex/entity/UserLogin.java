package org.ex.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="LoginTable")
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Login Id is required")
    @Size(min = 4, max = 30, message = "Login Id must be 4-30 chars")
    @Column(name = "login_id", nullable = false, length = 30)
    private String loginId;
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!]).*$",
            message = "Password must contain at least one digit, one uppercase letter, and one special character"
    )
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 100, message = "Password must be at least 6 chars")
    @Column(name = "password", nullable = false)
    private String password;

    public UserLogin()
    {

    }
    public UserLogin(Long id, String loginId, String password) {
        this.id = id;
        this.loginId = loginId;
        this.password = password;
    }
//all the getters and setters of table
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
