package com.github.r0bs0ncarl0s.financeiro.infrastructure.http.response;

import com.github.r0bs0ncarl0s.financeiro.application.output.TransactionOutput;

public record TransactionResponse(String id, String category, String description, double amount) {
    public static TransactionResponse from(TransactionOutput output) {
        return new TransactionResponse(output.id(), output.category(), output.description(), output.value());
    }
}
