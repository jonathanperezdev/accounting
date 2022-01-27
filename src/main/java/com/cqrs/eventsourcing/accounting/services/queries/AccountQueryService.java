package com.cqrs.eventsourcing.accounting.services.queries;

import com.cqrs.eventsourcing.accounting.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    List<Object> listEventsForAccount(String accountNumber);
    AccountQueryEntity getAccount(String accountNumber);;
}
