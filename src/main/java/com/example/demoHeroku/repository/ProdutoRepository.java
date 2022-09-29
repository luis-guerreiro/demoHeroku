package com.example.demoHeroku.repository;

import com.example.demoHeroku.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<ProdutoModel,Integer> {


}
