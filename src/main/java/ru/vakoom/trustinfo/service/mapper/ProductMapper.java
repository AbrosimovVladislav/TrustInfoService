package ru.vakoom.trustinfo.service.mapper;

import org.springframework.stereotype.Component;
import ru.vakoom.trustinfo.model.Product;

@Component
public class ProductMapper {

    public Product map(ru.vakoom.trustinfo.model.dto.aggregator.Product productDto) {
        return new Product()
                .setProductId(productDto.getProductId())
                .setAge(productDto.getAge().name())
                .setBrandId(productDto.getBrand().getBrandId())
                .setCharacteristics(productDto.getCharacteristics())
                .setDescription(productDto.getDescription())
                .setImageLink(productDto.getImageLink())
                .setLink(productDto.getLink())
                .setModel(productDto.getModel())
                .setTypeId(productDto.getType().getTypeId());
    }

}
