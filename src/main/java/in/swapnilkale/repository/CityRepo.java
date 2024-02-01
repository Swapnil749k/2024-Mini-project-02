package in.swapnilkale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.swapnilkale.entity.City;

public interface CityRepo extends JpaRepository<City, Integer> {
	
	public List<City> findByStateId(Integer stateId);

}
