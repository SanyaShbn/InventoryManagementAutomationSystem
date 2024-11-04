package by.shubinalex.inventorymanagementautomationsystem.repository;

import by.shubinalex.inventorymanagementautomationsystem.entity.Role;
import by.shubinalex.inventorymanagementautomationsystem.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUserId(@Param("id") Long userId);
    Optional<User> findByUserLogin(String userLogin);
    Optional<User> findByEmail(String email);
    List<User> findByRole(Role role);
}
