package com.example.dictionaryspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word,Long> {
    
    List<Word> findByWordLikeIgnoreCase(String var1);
}
