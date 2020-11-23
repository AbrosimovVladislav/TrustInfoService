package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.Brand;
import ru.vakoom.trustinfo.model.Product;
import ru.vakoom.trustinfo.repo.BrandRepo;
import ru.vakoom.trustinfo.repo.ProductRepo;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BrandController {

    private final BrandRepo brandRepo;

    @GetMapping("/brand")
    public List<Brand> getAll() {
        return brandRepo.findAll();
    }

}
