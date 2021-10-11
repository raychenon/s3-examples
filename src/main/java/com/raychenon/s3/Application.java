package com.raychenon.s3;

public class Application {

    public static void main(String[] args){
        S3GetObject s3get = new S3GetObject();
        s3get.read(args[0], args[1]);
        System.out.println("Downloaded");
    }

}
