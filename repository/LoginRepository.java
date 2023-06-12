package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.company.entity.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	@Query(
			  value = "SELECT * FROM login u WHERE u.login_id = :loginID", 
			  nativeQuery = true)
	Login getByLoginId(String loginID) ;
	//String data=
}
