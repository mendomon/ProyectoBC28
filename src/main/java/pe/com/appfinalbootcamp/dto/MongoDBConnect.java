package pe.com.appfinalbootcamp.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;


public class MongoDBConnect {
	
	private static final Logger Logger = LoggerFactory.getLogger(MongoDBConnect.class);

	public static void main(String[] args) {
		
		Logger.info("Inicio del proceso de conexion a MongoDB");
		//Conectar a instancia local en modo seguro
		String uri = "mongodb://superuser:passw0rd@localhost";
		
		MongoClient mongoClient = MongoClients.create(uri);
		
		MongoIterable<String> dbNames = mongoClient.listDatabaseNames();
		for (String dbName : dbNames)
			System.out.println(dbName);
		
		Logger.info("Fin del proceso de conexion a MongoDB");
	}

}
