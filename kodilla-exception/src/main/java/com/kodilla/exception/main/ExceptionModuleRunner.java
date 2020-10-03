package com.kodilla.exception.main;

import  com.kodilla.exception.io.FileReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();
        fileReader.readFile();

    }


}
