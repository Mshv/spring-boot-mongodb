package aac.com.springmongodb.repository;

import aac.com.springmongodb.model.UserProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProductRepository extends MongoRepository<UserProduct, Integer> {

}
