package com.csctracker.csctrackertransaction.service;

import com.csctracker.configs.ApplicationInfo;
import com.csctracker.csctrackertransaction.model.Transaction;
import com.csctracker.csctrackertransaction.repository.TransactionRepository;
import com.csctracker.service.ServiceRegister;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class TransactionService extends ServiceRegister<Transaction> {
    public TransactionService(ApplicationInfo applicationInfo, TransactionRepository transactionRepository) {
        super(applicationInfo, transactionRepository);
    }
}
