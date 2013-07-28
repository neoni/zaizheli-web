package net.zaizheli.repositories;

import net.zaizheli.constants.ApplicationStatus;
import net.zaizheli.domains.Application;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

public interface ApplicationRepository extends
					AtomicOperationsRepository<Application, String> {
	
	
	@Query("{ 'activity': {'$ref': 'activity', '$id': { '$oid': ?0 } } }")
	Page<Application> findByActivity(String id, Pageable pageable);
	
	@Query("{ 'activity': {'$ref': 'activity', '$id': { '$oid': ?0 } }, 'status': ?1 }")
	Page<Application> findByActivityAndstatus(String id, ApplicationStatus status, Pageable pageable);
	
	@Query("{ 'activity': {'$ref': 'activity', '$id': { '$oid': ?0 } }, 'applicant': {'$ref': 'user', '$id': { '$oid': ?1} } }")
	Application findByActivityAndapplicant(String id, String uid);
	
}
