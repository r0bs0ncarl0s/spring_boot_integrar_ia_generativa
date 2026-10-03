package com.github.r0bs0ncarl0s.financeiro.application.input;

import com.github.r0bs0ncarl0s.financeiro.domain.Category;
import org.springframework.ai.tool.annotation.ToolParam;

public record PersistTransactionInput(@ToolParam(description = "Descrição do gasto") String description,
                                      @ToolParam(description = "Valor do gasto (em centavos)") long amount,
                                      @ToolParam(description = "Categoria de uma transação") Category category) {
}
