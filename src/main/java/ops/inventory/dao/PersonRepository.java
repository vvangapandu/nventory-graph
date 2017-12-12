package ops.inventory.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ops.inventory.dao.model.movie.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	Person findByName(@Param("name") String name);
}