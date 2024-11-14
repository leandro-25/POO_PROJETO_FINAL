package com.example.springdigitalbank.repository;

import com.example.springdigitalbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}