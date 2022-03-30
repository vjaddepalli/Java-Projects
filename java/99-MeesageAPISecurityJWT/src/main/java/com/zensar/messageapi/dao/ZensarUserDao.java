package com.zensar.messageapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.messageapi.entity.ZensarUser;

@Repository
public interface ZensarUserDao extends JpaRepository<ZensarUser, Integer> {

	ZensarUser findByUsername(String string);

}
