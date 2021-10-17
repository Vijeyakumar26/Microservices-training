package com.htc.user.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.user.entity.User;


@Repository
public interface IUser extends JpaRepository<User, Long> 
{

}
//@RepositoryRestResource(collectionResourceRel="user",path="user")
//public interface UserServiceRepository extends PagingAndSortingRepository<User,Long> {
//
//	List<User> findByUserId(@Param("userId") Long userId);
//	
//}