package ru.solarlab.celebrator.services;

import org.springframework.stereotype.Service;
import ru.solarlab.celebrator.entity.Birthday;
import ru.solarlab.celebrator.entity.model.in.CreateBirthdayModel;
import ru.solarlab.celebrator.entity.model.in.UpdateBirthdayModel;
import ru.solarlab.celebrator.entity.model.out.BirthdayModel;
import ru.solarlab.celebrator.repositories.BirthdayRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class BirthdayService {

    private final BirthdayRepo birthdayRepo;

    public BirthdayService(BirthdayRepo birthdayRepo) {
        this.birthdayRepo = birthdayRepo;
    }

    public List<BirthdayModel> getAll(){
        return birthdayRepo.findAllModels();
    }

    public void createBirthday(CreateBirthdayModel createBirthday) {
        Birthday birthday = new Birthday(
                createBirthday.getName(),
                createBirthday.getLastName(),
                createBirthday.getMidName(),
                createBirthday.getSex(),
                createBirthday.getRole(),
                LocalDate.parse(createBirthday.getDate()),
                createBirthday.getImage()
        );
        birthdayRepo.save(birthday);
    }

    public void editBirthday(UpdateBirthdayModel updateBirthdayModel) {
        Birthday currentBirthday = birthdayRepo.getById(UUID.fromString(updateBirthdayModel.getId()));

        currentBirthday.setName(updateBirthdayModel.getName());
        currentBirthday.setLastName(updateBirthdayModel.getLastName());
        currentBirthday.setMidName(updateBirthdayModel.getMidName());
        currentBirthday.setSex(updateBirthdayModel.getSex());
        currentBirthday.setDate(LocalDate.parse(updateBirthdayModel.getDate()));
        currentBirthday.setRole(updateBirthdayModel.getRole());
        currentBirthday.setImage(updateBirthdayModel.getImage());

        birthdayRepo.save(currentBirthday);
    }

    public void delete(String id){
        Birthday birthday = birthdayRepo.getById(UUID.fromString(id));
        birthdayRepo.delete(birthday);
    }


}
