package com.cqrs.eventsourcing.accounting.repositories;

import com.cqrs.eventsourcing.accounting.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
