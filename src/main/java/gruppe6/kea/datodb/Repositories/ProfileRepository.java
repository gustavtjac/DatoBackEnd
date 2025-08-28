package gruppe6.kea.datodb.Repositories;

import gruppe6.kea.datodb.Model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile,Integer> {
    List<Profile> getProfilesByUsername(String username);
}
