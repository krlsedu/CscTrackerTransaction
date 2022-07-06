package com.csctracker.csctrackertransaction.controller;

import com.csctracker.controller.ControllerRegister;
import com.csctracker.csctrackertransaction.model.Transaction;
import com.csctracker.service.ServiceRegister;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController extends ControllerRegister<Transaction> {
    public TransactionController(ServiceRegister<Transaction> serviceRegister) {
        super(serviceRegister);
    }
}
