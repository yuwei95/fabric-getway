package com.example.demohyperledger;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args){
        Path networkConfigFile = Paths.get(".");
        System.out.println(networkConfigFile.toUri());
    }
}
