package in.bhartivikas.blogpost.repository;

import in.bhartivikas.blogpost.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
