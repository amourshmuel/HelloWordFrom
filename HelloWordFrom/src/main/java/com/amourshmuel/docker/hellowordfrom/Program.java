package com.amourshmuel.docker.hellowordfrom;

import com.amourshmuel.docker.utils.StdOut;

/**
 * Created by Shmuel on 8/29/2016, Project: HelloWordFrom.
 */
public class Program {

    public static void main(String[] args){
        if(args.length>0)
            StdOut.println("Hello World from: "+ args[0].toString() );
        else
            StdOut.println("Hello World from: Shmuel");
    }
}
