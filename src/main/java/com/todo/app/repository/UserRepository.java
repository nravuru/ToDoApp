/**
 * 
 */
package com.todo.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.app.entity.User;

/**
 * @author naresh.ravurumckesson.com
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUserName(String username);

}
