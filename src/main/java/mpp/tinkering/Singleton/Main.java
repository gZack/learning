package mpp.tinkering.Singleton;

import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        Statement dbSingleton = DbSingleton.getStatement();


    }
}
