package hello;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

	
	
	List<User> findByEmail(String email);
	List<User> findByPassword(String password);
	
}
