/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.conexao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author PC-CASA
 */
public class ConectionMongoDb {

    private static MongoClient mongoClient = null;

    public static MongoCollection<Document> openConnection() {
        mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase database = mongoClient.getDatabase("databasemongo");

        MongoCollection<Document> collection = database.getCollection("post");
        return collection;
    }

    public static void close() {
        mongoClient.close();
    }

}
