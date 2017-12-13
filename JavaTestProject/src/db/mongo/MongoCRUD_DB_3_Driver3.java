package db.mongo;

import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoCRUD_DB_3_Driver3 {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
		MongoCollection<Document> collection = getCollection(mongoDatabase,
				"student");

		FileUtil.write("");
		FileUtil.write("***************************************************************************************");
		FileUtil.write("Below will be the operations performed on mongodb for date="
				+ new Date());
		FileUtil.write("***************************************************************************************");
		FileUtil.write("");

		FileUtil.write("Printing student table data....");
		printCollection(collection);

		int id = new java.util.Random().nextInt(50) + 1;
		FileUtil.write("Inserting data in students collection with id=" + id);

		Document document = getDocument(id);

		// Insert Document
		insertDocument(collection, document);

		// Find Document
		findDocument(collection, id, document);

		// Print Collection
		FileUtil.write("Printing student table data after insertion of one record....");
		printCollection(collection);

		// Delete Document
		deleteDocument(collection, id, document);

		// Print Collection
		FileUtil.write("Printing student table data after deletion of record having id="
				+ id);
		printCollection(collection);

		mongoClient.close();
		FileUtil.closeResources();

	}

	private static void insertDocument(MongoCollection<Document> collection,
			Document document) {
		collection.insertOne(document);
	}

	private static void findDocument(MongoCollection<Document> collection,
			int id, Document document) {
		FindIterable<Document> find = collection.find(document);
		FileUtil.write("Searching the document having id=" + id);
		FileUtil.write(find.first().toJson());
	}

	private static void deleteDocument(MongoCollection<Document> collection,
			int id, Document document) {
		FileUtil.write("Removing data from collection having id=" + id);
		collection.deleteOne(document);
	}

	private static Document getDocument(int id) {
		Document document = new Document();
		document.put("name", "randomname_" + id);
		document.put("class", "Maths");
		return document;
	}

	private static MongoCollection<Document> getCollection(
			MongoDatabase mongoDatabase, String collectionName) {
		MongoCollection<Document> collection = mongoDatabase
				.getCollection(collectionName);
		return collection;
	}

	private static void printCollection(MongoCollection<Document> collection) {
		FindIterable<Document> find = collection.find();
		for (Document document : find) {
			FileUtil.write(document.toJson());
		}
	}

}
