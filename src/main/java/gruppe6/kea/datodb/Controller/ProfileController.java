package gruppe6.kea.datodb.Controller;


import gruppe6.kea.datodb.Model.Profile;
import gruppe6.kea.datodb.Repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/{username}")
    public Profile getProfileFromUsername(@PathVariable String username){
        return profileRepository.getProfilesByUsername(username).getFirst();
    }


}
