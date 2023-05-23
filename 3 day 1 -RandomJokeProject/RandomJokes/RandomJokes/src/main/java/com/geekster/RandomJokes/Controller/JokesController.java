package com.geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JokesController {
   public static ArrayList<String>jokesList = new ArrayList<>();
   @PostMapping(value = "/jokes")
    public String postJokes(@RequestBody String Joke){
        jokesList.add(Joke);
        return "Joke_added";
    }
    @GetMapping(value = "/jokes")
    public String getJokes(){

//        jokesList.add("This is Joke 1");
//        jokesList.add("This is Joke 2");
//        jokesList.add("This is Joke 3");
//        jokesList.add("This is Joke 4");
//        jokesList.add("This is Joke 5");

        int randomNumber = 0+(int)(Math.random()*((jokesList.size()-1-0)+1));
        return jokesList.get(randomNumber);
    }
}
