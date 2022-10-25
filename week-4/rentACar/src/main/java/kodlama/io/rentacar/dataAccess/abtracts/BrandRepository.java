package kodlama.io.rentacar.dataAccess.abtracts;

import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    // List of brands
    List<Brand> getAll();
}
