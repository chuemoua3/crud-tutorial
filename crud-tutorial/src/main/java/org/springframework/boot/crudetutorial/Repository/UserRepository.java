package org.springframework.boot.crudetutorial.Repository;

import org.springframework.boot.crudetutorial.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}