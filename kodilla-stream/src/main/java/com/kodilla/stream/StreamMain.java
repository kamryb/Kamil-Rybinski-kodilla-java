package com.kodilla.stream;

//import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AV", text-> "ABC" + text + "ABC");
        poemBeautifier.beautify("volvothebestauditheghost", text-> text.toUpperCase());
        poemBeautifier.beautify("mitshubishi", text-> text.toLowerCase());
        poemBeautifier.beautify("nissan ", text-> text + text);
    }
}
