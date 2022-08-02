package pe.com.appfinalbootcamp.repo;

import pe.com.appfinalbootcamp.model.AFPClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IAFPClientRepo extends MongoRepository<AFPClient, Serializable>{

}
