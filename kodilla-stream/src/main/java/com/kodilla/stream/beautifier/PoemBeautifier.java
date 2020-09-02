package com.kodilla.stream.beautifier;

import static java.lang.System.out;

public class PoemBeautifier implements PoemDecorator {
    String text;
    PoemDecorator poemDecorator;
    public void beautify(String text, PoemDecorator poemDecorator){
            String result;
        result = poemDecorator.decorate(text);
        out.println("Result decorator: " + result);
    }

    @Override
    public String decorate(String text){
       return text;
    }
}
