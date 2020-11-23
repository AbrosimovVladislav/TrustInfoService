package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.Type;
import ru.vakoom.trustinfo.repo.TypeRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TypeController {

    private final TypeRepo typeRepo;

    @GetMapping("/type")
    public List<Type> getAll() {
        return typeRepo.findAll();
    }

}
