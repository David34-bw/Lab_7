package com.example.lab_7.repositories;

import com.example.lab_7.models.Competitor;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProductRepository extends MongoRepository<Competitor, String> {

    List<Competitor> findByProductIsNotNull();
}