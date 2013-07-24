package net.zaizheli.repositories;

import java.util.List;

import net.zaizheli.domains.Comment;
import net.zaizheli.repositories.AtomicOperationsRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;

public interface CommentRepository extends 
		AtomicOperationsRepository<Comment, String> {
	
	@Query("{ 'act': {'$ref': 'activity', '$id': { '$oid': ?0 } }}")
	List<Comment> findByAct(String id);
	
	@Query("{ 'act': {'$ref': 'activity', '$id': { '$oid': ?0 } }}")
	Page<Comment> findByAct(String id, Pageable pageable);
	
}
