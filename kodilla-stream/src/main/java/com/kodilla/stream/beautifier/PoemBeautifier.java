package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beatufiy(String word, PoemDecorator poemDecorator)
    {
        String result = poemDecorator.decorate(word);
        System.out.println(result);
    }
}
