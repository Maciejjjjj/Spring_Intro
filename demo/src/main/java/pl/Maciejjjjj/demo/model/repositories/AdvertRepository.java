package pl.Maciejjjjj.demo.model.repositories;

import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.Maciejjjjj.demo.model.domain.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Long> {

    List<Advert> findAllByOrderByPostedDesc();

}
