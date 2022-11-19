package com.fastporte.fastportewebservice.repository;

import com.fastporte.fastportewebservice.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends JpaRepository<Card, Long> {

}
