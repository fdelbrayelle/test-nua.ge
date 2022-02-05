package tech.ippon.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ippon.myapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
