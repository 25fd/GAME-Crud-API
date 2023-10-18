package com.humber.eap.week6.repository;

import com.humber.eap.week6.models.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, String> {

}
