package ru.solarlab.celebrator.services;

import org.springframework.stereotype.Service;
import ru.solarlab.celebrator.entity.Birthday;
import ru.solarlab.celebrator.entity.Celebrate;
import ru.solarlab.celebrator.entity.model.out.CelebrateModel;
import ru.solarlab.celebrator.repositories.BirthdayRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class CelebrateService {

    private final BirthdayRepo birthdayRepo;

    public CelebrateService(BirthdayRepo birthdayRepo) {
        this.birthdayRepo = birthdayRepo;
    }

    public List<CelebrateModel> getNearsCelebrate(int nextCount) {
        List<Birthday> people = birthdayRepo.getAll();
        List<Celebrate> celebrates = new ArrayList<>();
        LocalDate now = LocalDate.now();

        for (Birthday el : people) {
            if (el.getDate().getMonth().getValue() == now.getMonth().getValue() && el.getDate().getDayOfMonth() >= now.getDayOfMonth()) {
                celebrates.add(new Celebrate(el));
                continue;
            }

            if (el.getDate().getMonth().getValue() > now.getMonth().getValue()) {
                celebrates.add(new Celebrate(el));
                continue;
            }

            var ell = new Celebrate(el);
            ell.setMark(1);
            celebrates.add(ell);
        }

        Comparator<Celebrate> comp = Comparator.comparing(Celebrate::getMark).thenComparing(Celebrate::getMonth).thenComparing(Celebrate::getDay);
        celebrates.sort(comp);

        while (celebrates.size() != nextCount) {
            celebrates.remove(celebrates.size() - 1);
        }

        List<CelebrateModel> celebrateModels = new ArrayList<>();
        for (var el : celebrates) {
            celebrateModels.add(new CelebrateModel(el));
        }
        return celebrateModels;
    }
}
