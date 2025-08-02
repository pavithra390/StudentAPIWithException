package com.example.RecidentInfo.Controller;
import com.example.RecidentInfo.Entity.RecidentEntity;
import com.example.RecidentInfo.Service.RecidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RecidentController {
    @Autowired
    private RecidentService rs;
    @PostMapping("/posting/recident/record")
    //http://localhost:1881/posting/recident/record
    public String postingRecidentInfo(@RequestBody RecidentEntity rinfo){
        rs.storeRecidentInfo(rinfo);
        return "Record saved successfully";
    }
    @PostMapping("/saving/allrecords")
    //http://localhost:1881/saving/allrecords
    public String postingAllRecords(@RequestBody Iterable<RecidentEntity> rinfo){
        rs.storeAllRecordsinfo(rinfo);
        return "All records saved successfully";
    }
    @PutMapping("/updating/recident/info")
    //http://localhost:1881/updating/recident/info
    public String updateRecidentInfo(@RequestBody RecidentEntity rinfo){
        rs.updatingRecidentInfo(rinfo);
        return "Record updated successfully";
    }
    @GetMapping("/getting/recident/info/{recidentId}")
    //http://localhost:1881/getting/recident/info/7
    public Optional<RecidentEntity> getRecidentInfo(@PathVariable("recidentId") int id){
        return rs.gettingRecidentInfo(id);
    }
    @GetMapping("/getting/allrecident/info")
    //http://localhost:1881/getting/allrecident/info
    public Iterable<RecidentEntity> getAllRecidentInfo(){
        return rs.gettingAllRecidentInfo();
    }
    @DeleteMapping("/deleting/recident/info/{recidentId}")
    //http://localhost:1881/deleting/recident/info/7
    public String deleteRecidentInfo(@PathVariable("recidentId") int id){
         rs.deletingRecidentInfo(id);
         return "Recorde deleted successfully";
    }
    @DeleteMapping("/deleting/allrecident/info")
    //http://localhost:1881/deleting/allrecident/info
    public String deleteAllRecidentInfo(){
        rs.deletingAllRecidentInfo();
        return "All records deleted successfully";
    }


}
