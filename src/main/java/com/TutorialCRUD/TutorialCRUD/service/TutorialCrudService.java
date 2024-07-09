package com.TutorialCRUD.TutorialCRUD.service;

import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import com.TutorialCRUD.TutorialCRUD.repository.ITutorialCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TutorialCrudService {

    @Autowired
    ITutorialCrudRepository iTutorialCrudRepository;

    public Tutorial createTutorial(Tutorial newTutorial){
        return iTutorialCrudRepository.save(newTutorial);
    }
}
