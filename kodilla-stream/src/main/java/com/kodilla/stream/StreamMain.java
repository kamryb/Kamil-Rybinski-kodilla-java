package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AV", text-> "ABC" + text + "ABC");
        poemBeautifier.beautify("volvothebestauditheghost", text-> text.toUpperCase());
        poemBeautifier.beautify("mitshubishi", text-> text.toLowerCase());
        poemBeautifier.beautify("nissan ", text-> text + text);

   //v7.2
        System.out.println("Using Stream to gerate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }


}
