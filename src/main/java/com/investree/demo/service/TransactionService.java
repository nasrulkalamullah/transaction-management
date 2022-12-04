package com.investree.demo.service;

import com.investree.demo.model.Transaction;

import java.util.Map;

public interface TransactionService {
    public Map save(Transaction transaction);
    public Map updateStatus (Transaction transaction);
}
