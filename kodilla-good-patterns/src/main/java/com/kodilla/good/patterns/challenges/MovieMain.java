package com.kodilla.good.patterns.challenges;
import com.kodilla.good.patterns.challenges.MovieStore;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class MovieMain {

    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();

       // String theResult = movieStore.getMovies().keySet().stream()
       //         .filter(s->s.length()>1)
        //        .collect(Collectors.joining(" ! "));
       // System.out.println(theResult);

       //List<String> theResult = movieStore.getMovies().values().stream()
        String theResult = movieStore.getMovies().entrySet().stream()
                .flatMap(entry->entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(theResult);

    }
}
