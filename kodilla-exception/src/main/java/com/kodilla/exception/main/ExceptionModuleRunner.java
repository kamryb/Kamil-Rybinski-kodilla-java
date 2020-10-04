package com.kodilla.exception.main;

import  com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWthoutHandling;
import com.kodilla.exception.test.SecondChallenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExceptionModuleRunner {

    public static void main(String args[]) throws IOException {

      SecondChallenge secondChallenge = new SecondChallenge();
      try {
          secondChallenge.probablyIWillThrowException(2,1.5);
      } catch (Exception e) {
          e.printStackTrace();
      }

    }


}
