package com.example.dictionaryspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    
    private final WordService wordService;

    @GetMapping({"/word/like/{token}"})
    
    public List startswith(@PathVariable("token")  String token) {
        return this.getWordService().findByWordLikeIgnoreCase(token);
    }

    
    public WordService getWordService() {
        return this.wordService;
    }

    public WordController( WordService wordService) {
        super();
        this.wordService = wordService;
    }
}
