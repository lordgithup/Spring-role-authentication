package it.nxtvision.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import it.nxtvision.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}

