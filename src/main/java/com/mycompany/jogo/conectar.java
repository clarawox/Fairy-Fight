package com.mycompany.jogo;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.Random;
import org.bson.Document;

public class conectar {
    
    int venceu=0, empate=0;

    public void getValues() {
        System.out.println("getValues");
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase db = mongo.getDatabase("cliente");
        MongoCollection<Document> docs = db.getCollection("cadastro");
        for (Document doc : docs.find()) {
            System.out.println("item: " + doc);
        }
        System.out.println("getValues okay");
    }

    public static void insertUser(String name, String user, String senha) {
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("usuarios");
            MongoCollection<Document> collection = database.getCollection("user");
            try {
                Document doc = new Document();
                doc.put("Name", name);
                doc.put("User", user);
                doc.put("Senha", senha);

                collection.insertOne(doc);

            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }

        }
    }

    public static String getSenha(String user) {
        String senha = "";
        try ( MongoClient mongo = new MongoClient("localhost", 27017);) {
            MongoDatabase database = mongo.getDatabase("usuarios");
            MongoCollection<Document> collection = database.getCollection("user");
            try {
                DistinctIterable<String> docs = collection.distinct("Senha", Filters.eq("User", user), String.class);
                MongoCursor<String> results = docs.iterator();
                while (results.hasNext()) {

                    senha = results.next();
                }
                //System.out.println("Name: " + name);
            } catch (MongoException me) {
                System.err.println("An error occurred: " + me);
            }
        }
        return senha;
    }

    public int briga(String elemento) {
        
        ArrayList elementos = new ArrayList();
        elementos.add("ar");
        elementos.add("agua");
        elementos.add("fogo");
        elementos.add("terra");
        elementos.add("raio");
        Random r = new Random();
        
        int randomitem = r.nextInt(elementos.size());
        Object inimigo = elementos.get(randomitem);

        switch (elemento) {
            case "fogo": 
                if(inimigo == "agua"){
                    venceu = 2;
                } else if (inimigo == "ar"){
                    venceu = 1;
                } else if (inimigo == "terra"){
                    venceu = 1;
                } else if (inimigo == "raio"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
                
            case "agua":
                if(inimigo == "terra"){
                    venceu = 2;
                } else if (inimigo == "fogo"){
                    venceu = 1;
                } else if (inimigo == "ar"){
                    venceu = 1;
                } else if (inimigo == "raio"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;

            case "ar":
                if(inimigo == "fogo"){
                    venceu = 2;
                } else if (inimigo == "terra"){
                    venceu = 1;
                } else if (inimigo == "raio"){
                    venceu = 1;
                } else if (inimigo=="agua"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
            
            case "terra":
                if(inimigo == "fogo"){
                    venceu = 2;
                } else if (inimigo == "agua"){
                    venceu = 1;
                } else if (inimigo == "raio"){
                    venceu = 1;
                } else if (inimigo == "ar"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
                
            case "raio":
                if(inimigo == "ar"){
                    venceu = 2;
                } else if (inimigo == "agua"){
                    venceu = 1;
                } else if (inimigo == "fogo"){
                    venceu = 1;
                } else if (inimigo == "terra"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
          
        }
        
        return venceu;
    }    
        
    
    
    public int brigaM(String player1, String player2) {

        
        switch (player1) {
            case "fogo": 
                if(player2.equals("agua")){
                    venceu = 2;
                } else if (player2 == "ar"){
                    venceu = 1;
                } else if (player2 == "terra"){
                    venceu = 1;
                } else if (player2 == "raio"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
                
            case "agua":
                if(player2 == "terra"){
                    venceu = 2;
                } else if (player2 == "fogo"){
                    venceu = 1;
                } else if (player2 == "ar"){
                    venceu = 1;
                } else if (player2 == "raio"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;

            case "ar":
                if(player2 == "fogo"){
                    venceu = 2;
                } else if (player2 == "terra"){
                    venceu = 1;
                } else if (player2 == "raio"){
                    venceu = 1;
                } else if (player2=="agua"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
            
            case "terra":
                if(player2 == "fogo"){
                    venceu = 2;
                } else if (player2 == "agua"){
                    venceu = 1;
                } else if (player2 == "raio"){
                    venceu = 1;
                } else if (player2 == "ar"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
                
            case "raio":
                if(player2 == "ar"){
                    venceu = 2;
                } else if (player2 == "agua"){
                    venceu = 1;
                } else if (player2 == "fogo"){
                    venceu = 1;
                } else if (player2 == "terra"){
                    venceu = 2;
                } else {
                    venceu = 3;
                } break;
          
        }
        return venceu; 
    }

}
