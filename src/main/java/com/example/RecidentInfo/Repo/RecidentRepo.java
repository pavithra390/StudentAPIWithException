package com.example.RecidentInfo.Repo;

import com.example.RecidentInfo.Entity.RecidentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecidentRepo extends CrudRepository<RecidentEntity,Integer> {
}
