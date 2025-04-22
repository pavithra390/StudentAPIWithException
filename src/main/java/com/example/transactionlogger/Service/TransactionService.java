package com.example.transactionlogger.Service;
import com.example.transactionlogger.REPO.TransactionRepo;
import com.example.transactionlogger.TransactionEntry.EntryPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepo tr;
    public void addingTransactionHistory(EntryPage ep){
        tr.save(ep);
    }
    public void editingTransactionHistory(EntryPage ep){
        tr.save(ep);
    }
    public Iterable<EntryPage> gettingAllTransactions(){
        return tr.findAll();
    }

}
