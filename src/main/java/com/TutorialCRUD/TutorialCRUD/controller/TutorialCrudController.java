package com.TutorialCRUD.TutorialCRUD.controller;


import com.TutorialCRUD.TutorialCRUD.model.Tutorial;
import com.TutorialCRUD.TutorialCRUD.service.TutorialCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialCrudController {
    @Autowired
    TutorialCrudService tutorialCrudService;

    @GetMapping(path = "/tutorials")
    public ArrayList<Tutorial> getAllTutorials(){
        return tutorialCrudService.getAllTutorials();
    }
    /*public editTutorial(){
        return null;
    }*/
}
