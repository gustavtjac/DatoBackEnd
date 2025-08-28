package gruppe6.kea.datodb.Config;

import gruppe6.kea.datodb.Model.Dato;
import gruppe6.kea.datodb.Model.Profile;
import gruppe6.kea.datodb.Repositories.DatoRepository;
import gruppe6.kea.datodb.Repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    DatoRepository datoRepository;


    @Override
    public void run(String... args) throws Exception {
        Profile profile = new Profile();
        profile.setPassword("123");
        profile.setUsername("gustavtjac");
        profileRepository.save(profile);


        Dato dato = new Dato();
        dato.setProfile(profile);
        dato.setTitle("God DAto :)");
        dato.setSpawnTime(LocalDateTime.now());
        dato.setLocation("Søborg");
        datoRepository.save(dato);

        Dato dato2 = new Dato();
        dato2.setProfile(profile);
        dato2.setTitle("Dårlig dato");
        dato2.setSpawnTime(LocalDateTime.now());
        dato2.setLocation("Brønshøj");
        datoRepository.save(dato2);






    }
}
