package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.FilterItem;
import ru.vakoom.trustinfo.repo.FilterItemRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FilterItemController {

    private final FilterItemRepo filterItemRepo;

    @GetMapping("/filterItem")
    public List<FilterItem> getAll() {
        return filterItemRepo.findAll();
    }

}
