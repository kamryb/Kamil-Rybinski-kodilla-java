package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;



public class StreamMain {
    public static void main(String[] args){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AV", text-> "ABC" + text + "ABC");
        poemBeautifier.beautify("volvothebestauditheghost", text-> text.toUpperCase());
        poemBeautifier.beautify("mitshubishi", text-> text.toLowerCase());
        poemBeautifier.beautify("nissan ", text-> text + text);
    }
}
