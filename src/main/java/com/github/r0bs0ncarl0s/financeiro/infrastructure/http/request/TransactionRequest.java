package com.github.r0bs0ncarl0s.financeiro.infrastructure.http.request;

import com.github.r0bs0ncarl0s.financeiro.application.input.PersistTransactionInput;
import com.github.r0bs0ncarl0s.financeiro.domain.Category;

public record TransactionRequest(String description, Category category, long amount) {
    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(description, amount, category);
    }
}
