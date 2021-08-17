package pl.wojciechdomagala.dietapp.userregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wojciechdomagala.dietapp.userregister.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
