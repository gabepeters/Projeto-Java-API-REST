package me.dio.santander_dev_week.repository;

import me.dio.doain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class UserRepository extends JpaRepository<User, Long> {

}
