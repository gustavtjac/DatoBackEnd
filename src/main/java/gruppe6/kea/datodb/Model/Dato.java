package gruppe6.kea.datodb.Model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Dato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDateTime spawnTime;
    @Column(nullable = false)
    private String title;

    private String description;

    private String location;

    @ManyToOne()
    @JoinColumn(name = "profile_id")
    private Profile profile;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getSpawnTime() {
        return spawnTime;
    }

    public void setSpawnTime(LocalDateTime spawnTime) {
        this.spawnTime = spawnTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
