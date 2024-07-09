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

    public boolean deleteTask(int id) {
        try {
            iTutorialCrudRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public Tutorial updateTutorial(Tutorial tutorial, int id) {
        Optional<Tutorial> optionalTutorial = iTutorialCrudRepository.findById(id);
        Tutorial newTutorial = optionalTutorial.get();
        newTutorial.setTitle(tutorial.getTitle());
        newTutorial.setDescription(tutorial.getDescription());
        return iTutorialCrudRepository.save(newTutorial);
    }
}
