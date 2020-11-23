package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
