package com.eventostec.api.repositories;

import com.eventostec.api.domain.coupom.Coupom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoupomRepository extends JpaRepository<Coupom, UUID> {
}
