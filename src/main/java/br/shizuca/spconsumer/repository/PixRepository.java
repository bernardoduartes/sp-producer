package br.shizuca.spconsumer.repository;

import br.shizuca.spconsumer.model.Pix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PixRepository extends JpaRepository<Pix, Integer> {
    Pix findByIdentifier(String identifier);
}
