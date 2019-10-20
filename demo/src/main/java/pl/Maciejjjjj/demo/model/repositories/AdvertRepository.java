package pl.Maciejjjjj.demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Maciejjjjj.demo.model.domain.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Long> {
    
}
