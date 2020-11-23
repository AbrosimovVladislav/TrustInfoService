package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.KeyPath;
import ru.vakoom.trustinfo.model.Shop;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Long> {
}
