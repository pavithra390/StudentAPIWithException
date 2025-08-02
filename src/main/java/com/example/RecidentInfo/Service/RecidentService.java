package com.example.RecidentInfo.Service;
import com.example.RecidentInfo.Entity.RecidentEntity;
import com.example.RecidentInfo.Repo.RecidentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class RecidentService {
    @Autowired
    RecidentRepo rr;

    public void storeRecidentInfo(RecidentEntity recident) {
        rr.save(recident);
    }
    public void storeAllRecordsinfo( Iterable<RecidentEntity> recident){
        rr.saveAll(recident);
    }
    public void updatingRecidentInfo(RecidentEntity recident) {
        rr.save(recident);
    }
    public Optional<RecidentEntity> gettingRecidentInfo(Integer id) {
        return rr.findById(id);
    }
    public Iterable<RecidentEntity> gettingAllRecidentInfo() {
        return rr.findAll();
    }
    public void deletingRecidentInfo(Integer id) {
        rr.deleteById(id);
    }
    public void deletingAllRecidentInfo() {
        rr.deleteAll();
    }


}
