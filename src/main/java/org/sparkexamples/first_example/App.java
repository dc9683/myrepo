package org.sparkexamples.first_example;

import java.io.Serializable;

import org.apache.spark.SparkContext;

/**
 * Hello world!
 *
 */
public class App implements Serializable
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static void startStream(SparkContext sc, int interval) {
    	System.out.println("DCH----DCH-----DCH");
    }
    
    public static void coba() {
    	System.out.println("david coba !!!!!");
    }
}
