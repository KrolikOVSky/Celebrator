package ru.solarlab.celebrator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.solarlab.celebrator.entity.Celebrate;
import ru.solarlab.celebrator.entity.model.out.CelebrateModel;
import ru.solarlab.celebrator.services.CelebrateService;

import java.util.List;

@RestController
public class CelebrateController {

    private final CelebrateService celebrateService;

    public CelebrateController(CelebrateService celebrateService) {
        this.celebrateService = celebrateService;
    }

    @GetMapping
    public List<CelebrateModel> test() {
        return celebrateService.getNearsCelebrate(5);
    }

}
