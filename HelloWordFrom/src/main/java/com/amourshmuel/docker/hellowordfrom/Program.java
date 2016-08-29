package com.amourshmuel.docker.hellowordfrom;

/**
 * Created by Shmuel on 8/29/2016, Project: HelloWordFrom.
 */
public class Program {

    public static void main(String[] args){
        if(args.length>0)
            System.out.println("Hello World from: "+ args[0].toString() );
        else
            System.out.println("Hello World from: Shmuel");
    }
}
