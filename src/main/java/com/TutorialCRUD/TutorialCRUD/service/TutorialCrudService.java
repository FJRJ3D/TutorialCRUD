package com.TutorialCRUD.TutorialCRUD.service;

import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import com.TutorialCRUD.TutorialCRUD.repository.ITutorialCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TutorialCrudService {
    @Autowired
    ITutorialCrudRepository iTutorialCrudRepository;

    public Tutorial updateTutorial(Tutorial tutorial, int id) {
        Optional<Tutorial> optionalTutorial = iTutorialCrudRepository.findById(id);
        Tutorial newTutorial = optionalTutorial.get();
        newTutorial.setTitle(tutorial.getTitle());
        newTutorial.setDescription(tutorial.getDescription());
        return iTutorialCrudRepository.save(newTutorial);
    }
}
