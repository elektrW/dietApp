package pl.wojciechdomagala.dietapp.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechdomagala.dietapp.person.model.PersonData;

@Repository
public interface PersonRepository extends JpaRepository<PersonData, Long> {
}
