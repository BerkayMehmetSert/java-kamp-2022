package kodlama.io.rentacar.dataAccess.abtracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
