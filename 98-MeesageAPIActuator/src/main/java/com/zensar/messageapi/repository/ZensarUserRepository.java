package com.zensar.messageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.entity.ZensarUser;

@Repository
public interface ZensarUserRepository extends JpaRepository<ZensarUser, Integer>{

	ZensarUser findByUsername(String username);

}
