package ru.solarlab.celebrator.controllers;

import org.springframework.web.bind.annotation.*;
import ru.solarlab.celebrator.entity.model.in.CreateBirthdayModel;
import ru.solarlab.celebrator.entity.model.in.UpdateBirthdayModel;
import ru.solarlab.celebrator.entity.model.out.BirthdayModel;
import ru.solarlab.celebrator.services.BirthdayService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BirthdayController {

    private final BirthdayService birthdayService;

    public BirthdayController(BirthdayService birthdayService){
        this.birthdayService = birthdayService;
    }

    @GetMapping
    public List<BirthdayModel> getAllPeople() {
        return birthdayService.getAll();
    }

    @PostMapping
    public void create(@RequestBody CreateBirthdayModel createBirthdayModel){
        birthdayService.createBirthday(createBirthdayModel);
    }

    @PutMapping
    public void update(@RequestBody UpdateBirthdayModel updateBirthdayModel){
        birthdayService.editBirthday(updateBirthdayModel);
    }

    @DeleteMapping
    public void delete(@RequestParam Map<String, Object> body) {
        System.out.println(body.get("id"));
        birthdayService.delete(body.get("id").toString());
    }

}























