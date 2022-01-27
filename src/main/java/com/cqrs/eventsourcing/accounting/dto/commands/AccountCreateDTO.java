package com.cqrs.eventsourcing.accounting.dto.commands;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountCreateDTO {
    private double startingBalance;
    private String currency;
}
