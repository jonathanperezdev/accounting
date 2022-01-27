package com.cqrs.eventsourcing.accounting.services.queries;

import com.cqrs.eventsourcing.accounting.entities.AccountQueryEntity;
import com.cqrs.eventsourcing.accounting.repositories.AccountRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountQueryServiceImpl implements AccountQueryService {

    private final EventStore eventStore;
    private final AccountRepository accountRepository;


    public AccountQueryServiceImpl(EventStore eventStore, AccountRepository accountRepository) {
        this.eventStore = eventStore;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
        return eventStore.readEvents(accountNumber)
                .asStream()
                .map(Message::getPayload)
                .collect(Collectors.toList());
    }

    @Override
    public AccountQueryEntity getAccount(String accountNumber) {
        return accountRepository.findById(accountNumber).get();
    }
}
