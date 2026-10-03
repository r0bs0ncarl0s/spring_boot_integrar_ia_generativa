package com.github.r0bs0ncarl0s.financeiro.infrastructure.persistence.repository;

import com.github.r0bs0ncarl0s.financeiro.domain.Category;
import com.github.r0bs0ncarl0s.financeiro.infrastructure.persistence.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository extends CrudRepository<TransactionEntity, UUID> {
    List<TransactionEntity> findAllByCategory(Category category);
}
