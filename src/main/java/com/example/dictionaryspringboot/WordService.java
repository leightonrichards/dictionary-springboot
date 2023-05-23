package com.example.dictionaryspringboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
    private final WordRepository wordRepository;
    public WordService( WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public final long count() {
        return this.wordRepository.count();
    }

    public final List<Word> findByWordLikeIgnoreCase( String word) {
        return this.wordRepository.findByWordLikeIgnoreCase(word);
    }
}
