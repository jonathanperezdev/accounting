package com.cqrs.eventsourcing.accounting.dto.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoneyCreditDTO {
    private double creditAmount;
    private String currency;
}
