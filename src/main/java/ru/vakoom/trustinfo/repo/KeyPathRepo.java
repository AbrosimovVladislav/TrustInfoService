package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.KeyPath;

@Repository
public interface KeyPathRepo extends JpaRepository<KeyPath, Long> {
}
