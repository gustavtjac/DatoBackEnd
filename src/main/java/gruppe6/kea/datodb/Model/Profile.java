package gruppe6.kea.datodb.Model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    // image container!!!!!!

    @OneToMany(mappedBy = "profile",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Dato> datoList = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dato> getDatoList() {
        return datoList;
    }

    public void setDatoList(List<Dato> datoList) {
        this.datoList = datoList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
