package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.KeyPath;
import ru.vakoom.trustinfo.repo.KeyPathRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class KeyPathController {

    private final KeyPathRepo keyPathRepo;

    @GetMapping("/keyPath")
    public List<KeyPath> getAll() {
        return keyPathRepo.findAll();
    }

}
