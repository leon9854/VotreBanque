package org.sid.dao;

import org.sid.enities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository  extends JpaRepository<Compte, String> {



}
