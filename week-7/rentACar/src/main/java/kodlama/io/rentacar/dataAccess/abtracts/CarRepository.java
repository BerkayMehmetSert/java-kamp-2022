package kodlama.io.rentacar.dataAccess.abtracts;

import kodlama.io.rentacar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}