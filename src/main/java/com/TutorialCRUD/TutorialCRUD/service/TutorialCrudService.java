package com.TutorialCRUD.TutorialCRUD.service;

import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import com.TutorialCRUD.TutorialCRUD.repository.ITutorialCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class TutorialCrudService {
    @Autowired
    ITutorialCrudRepository iTutorialCrudRepository;

    public ArrayList<Tutorial> getAllTutorials(){
        return (ArrayList<Tutorial>) iTutorialCrudRepository.findAll();
    }
   /* public editTutorial(){
        return iTutorialCrudRepository.save()
    }*/
}
