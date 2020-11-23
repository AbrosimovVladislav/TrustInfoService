package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.Brand;
import ru.vakoom.trustinfo.model.FilterItem;

@Repository
public interface FilterItemRepo extends JpaRepository<FilterItem, Long> {
}
