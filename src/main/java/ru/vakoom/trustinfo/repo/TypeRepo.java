package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.Shop;
import ru.vakoom.trustinfo.model.Type;

@Repository
public interface TypeRepo extends JpaRepository<Type, Long> {
}
