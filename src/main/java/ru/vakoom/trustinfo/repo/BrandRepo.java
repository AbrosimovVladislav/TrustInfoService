package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {
}
