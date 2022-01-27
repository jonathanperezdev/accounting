package com.cqrs.eventsourcing.accounting.services.commands;

import com.cqrs.eventsourcing.accounting.dto.commands.AccountCreateDTO;
import com.cqrs.eventsourcing.accounting.dto.commands.MoneyCreditDTO;
import com.cqrs.eventsourcing.accounting.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
