package net.zaizheli.repositories;

import net.zaizheli.domains.Message;

public interface MessageRepository extends
			AtomicOperationsRepository<Message, String> {
	
}
