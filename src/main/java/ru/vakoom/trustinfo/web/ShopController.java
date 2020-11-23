package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.Shop;
import ru.vakoom.trustinfo.repo.ShopRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShopController {

    private final ShopRepo shopRepo;

    @GetMapping("/shop")
    public List<Shop> getAll() {
        return shopRepo.findAll();
    }

}
