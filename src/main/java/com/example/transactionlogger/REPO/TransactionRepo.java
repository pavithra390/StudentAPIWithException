package com.example.transactionlogger.REPO;
import com.example.transactionlogger.TransactionEntry.EntryPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TransactionRepo extends CrudRepository<EntryPage, Integer> {

}
