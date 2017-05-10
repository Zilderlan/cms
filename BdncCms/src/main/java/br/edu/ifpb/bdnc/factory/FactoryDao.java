/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.factory;

import br.edu.ifpb.bdnc.interfaces.FactoryDaoMongoDbIf;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoNeo4jIf;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoPostgresrIf;
import br.edu.ifpb.bdnc.interfaces.FactoryDaoRedisIf;

/**
 *
 * @author PC-CASA
 */
public class FactoryDao {

    private static final int DAO_POSTGRE = 1;
    private static final int DAO_MONGODB = 2;
    private static final int DAO_REDIS = 3;
    private static final int DAO_NEO4J = 4;

    public static FactoryDaoPostgresrIf createFactory() {
        return new FactoryDaoPostgre();
    }

    public static FactoryDaoMongoDbIf createFactoryMongo() {
        return new FactoryDaoMongoDb();
    }

    public static FactoryDaoRedisIf createFactoryRedis() {
        return new FactoryDaoRedis();
    }

    public static FactoryDaoNeo4jIf createFactoryNeo4j() {
        return new FactoryDaoNeo4j();
    }
}
