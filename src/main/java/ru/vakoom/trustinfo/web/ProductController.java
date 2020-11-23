package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.Product;
import ru.vakoom.trustinfo.repo.ProductRepo;
import ru.vakoom.trustinfo.service.mapper.ProductMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    @GetMapping("/product")
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping("/product")
    public Product save(@RequestBody ru.vakoom.trustinfo.model.dto.aggregator.Product productDto) {
        Product product = productMapper.map(productDto);
        return productRepo.save(product);
    }

}
