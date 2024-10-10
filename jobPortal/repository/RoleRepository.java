// src/main/java/com/example/jobportal/repository/RoleRepository.java
package com.example.jobportal.repository;

import com.example.jobportal.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
