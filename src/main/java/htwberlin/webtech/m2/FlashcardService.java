package htwberlin.webtech.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {


    @Autowired
    FlashcardRepository repo;

    public Flashcard save (Flashcard flashcard) {
        return repo.save(flashcard);
    }

    public Flashcard get(Long id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException());
    }

}
