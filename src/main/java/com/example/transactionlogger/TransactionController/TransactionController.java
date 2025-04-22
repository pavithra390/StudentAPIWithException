package com.example.transactionlogger.TransactionController;
import com.example.transactionlogger.Service.TransactionService;
import com.example.transactionlogger.TransactionEntry.EntryPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
    @Autowired
    TransactionService ts;

    @PostMapping(value="/addingTransactionHistory")
    //http://localhost:1991/addingTransactionHistory
    public String addTransactionHistory(@RequestBody EntryPage ep){
        ts.addingTransactionHistory(ep);
        return "Transaction added successfully-->"+ep.getTransactionId();
    }
  @PutMapping(value="/addingPurpose")
  //http://localhost:1991/addingPurpose
    public String addPurpose(@RequestBody EntryPage ep){
        ts.editingTransactionHistory(ep);
      return "Purpose added successfully-->"+ep.getTransactionId();
  }
  @GetMapping(value="/gettingAllRecords")
  //http://localhost:1991/gettingAllRecords
  public Iterable<EntryPage> getTransactionHistory(){
        return ts.gettingAllTransactions();
  }

}
