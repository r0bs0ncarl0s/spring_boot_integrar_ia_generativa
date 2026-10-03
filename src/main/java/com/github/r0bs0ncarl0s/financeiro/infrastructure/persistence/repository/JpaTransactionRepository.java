package com.github.r0bs0ncarl0s.financeiro.infrastructure.persistence.repository;

import com.github.r0bs0ncarl0s.financeiro.domain.Category;
import com.github.r0bs0ncarl0s.financeiro.domain.Transaction;
import com.github.r0bs0ncarl0s.financeiro.domain.TransactionRepository;
import com.github.r0bs0ncarl0s.financeiro.infrastructure.persistence.entity.TransactionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaTransactionRepository implements TransactionRepository {
    private final TransactionEntityRepository transactionEntityRepository;

    public JpaTransactionRepository(TransactionEntityRepository transactionEntityRepository) {
        this.transactionEntityRepository = transactionEntityRepository;
    }

    @Override
    public Transaction save(Transaction transaction) {
        var entity = TransactionEntity.from(transaction);
        return transactionEntityRepository.save(entity).toDomain();
    }

    @Override
    public List<Transaction> findAllByCategory(Category category) {
        return transactionEntityRepository.findAllByCategory(category)
                .stream()
                .map(TransactionEntity::toDomain)
                .toList();
    }
}
