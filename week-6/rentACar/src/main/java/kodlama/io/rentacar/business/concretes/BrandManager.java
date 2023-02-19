package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.requests.UpdateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentacar.dataAccess.abtracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class))
                .collect(Collectors.toList());
        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse brandResponse = modelMapperService.forResponse()
                .map(brand, GetByIdBrandResponse.class);

        return brandResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = modelMapperService.forRequest().map(updateBrandRequest, Brand.class);

        brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);
    }
}
