package com.github.r0bs0ncarl0s.financeiro.application;

import com.github.r0bs0ncarl0s.financeiro.application.input.PersistTransactionInput;
import com.github.r0bs0ncarl0s.financeiro.application.output.TransactionOutput;
import com.github.r0bs0ncarl0s.financeiro.domain.Transaction;
import com.github.r0bs0ncarl0s.financeiro.domain.TransactionRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class PersistTransactionUseCase {
    private final TransactionRepository transactionRepository;

    public PersistTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Tool(name = "persist-transaction", description = "Persiste uma nova transação financeira")
    public TransactionOutput execute(PersistTransactionInput input) {
        var transaction = transactionRepository.save(
                new Transaction(input.description(), input.amount(), input.category()));

        return TransactionOutput.from(transaction);
    }
}
