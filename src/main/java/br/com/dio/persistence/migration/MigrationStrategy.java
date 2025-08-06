package br.com.dio.persistence.migration;


import lombok.AllArgsConstructor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;

@AllArgsConstructor
public class MigrationStrategy {
    private final Connection connection;

    public MigrationStrategy(Connection connection) {
        this.connection = connection;
    }


    private void executeMigration(){
        var originalOutput = System.out;
        var originalErr = System.err;

        try(var fos = new FileOutputStream("liquibase.log")){

        }
        catch(IOException ex){
            ex.printStackTrace();
        } finally{
            System.out.println(originalOutput);
            System.out.println(originalErr);
        }


    }
}
