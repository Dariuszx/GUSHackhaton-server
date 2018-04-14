package pl.com.gus.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRoleName(String roleName);
}