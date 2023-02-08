package com.example.tdd;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {

    public String compute(int i) {
        String word = "";

        word = word.isBlank() ? i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : "" : word;
        word = word.isBlank() ? i % 3 == 0 ? "Fizz" : "" : word;
        word = word.isBlank() ? i % 5 == 0 ? "Buzz" : "" : word;
        word = word.isBlank() ? String.valueOf(i) : word;

        return word;
    }

}
