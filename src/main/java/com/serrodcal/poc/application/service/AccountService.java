package com.serrodcal.poc.application.service;

import com.serrodcal.poc.application.command.CreateAccountCommand;
import com.serrodcal.poc.application.command.MakeTransactionAccountCommand;
import com.serrodcal.poc.application.dto.AccountInformationDTO;
import com.serrodcal.poc.application.dto.BalanceAccountDTO;
import com.serrodcal.poc.application.dto.NewAccountDTO;
import com.serrodcal.poc.application.dto.TransactionAccountResultDTO;
import com.serrodcal.poc.application.query.FindAccountQuery;
import com.serrodcal.poc.application.query.GetBalanceQuery;
import com.serrodcal.poc.domain.repository.AccountRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@ApplicationScoped
public class AccountService {

    @Inject
    @Named("postgresqlAccount")
    AccountRepository accountRepository;

    public Uni<NewAccountDTO> createAccount(CreateAccountCommand command) {
        return Uni.createFrom().item(new NewAccountDTO(
                UUID.randomUUID().toString(),
                "ES1212341234121234567890")
        );
    }

    public Uni<BalanceAccountDTO> getBalanceByUUID(GetBalanceQuery query) {
        return null;
    }

    public Uni<AccountInformationDTO> findAccount(FindAccountQuery query) {
        return Uni.createFrom().item(new AccountInformationDTO(
                query.getUuid(),
                "ES1212341234121234567890",
                0,
                1492.89,
                "EUR",
                new Date(630370800000l)
        ));
    }

    public Uni<TransactionAccountResultDTO> makeTransaction(MakeTransactionAccountCommand command) {
        return null;
    }

}
