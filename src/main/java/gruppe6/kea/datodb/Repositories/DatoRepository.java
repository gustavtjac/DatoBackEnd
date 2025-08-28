package gruppe6.kea.datodb.Repositories;

import gruppe6.kea.datodb.Model.Dato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatoRepository extends JpaRepository<Dato,Integer> {
}
