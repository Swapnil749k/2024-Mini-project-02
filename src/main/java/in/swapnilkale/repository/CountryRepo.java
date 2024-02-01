package in.swapnilkale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.swapnilkale.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
