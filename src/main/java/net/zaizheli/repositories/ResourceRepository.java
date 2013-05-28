package net.zaizheli.repositories;

import net.zaizheli.domains.Resource;


public interface ResourceRepository extends 
		AtomicOperationsRepository<Resource, String> {
	
	Resource getByResId(String resId);
}
