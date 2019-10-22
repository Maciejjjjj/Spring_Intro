package pl.Maciejjjjj.demo.model.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.Maciejjjjj.demo.model.domain.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Long> {

    List<Advert> findAllByOrderByPostedDesc();

}
