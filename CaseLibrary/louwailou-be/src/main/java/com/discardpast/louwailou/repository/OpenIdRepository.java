package com.discardpast.louwailou.repository;

import com.discardpast.louwailou.dao.user.OpenId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpenIdRepository extends JpaRepository<OpenId,Integer> {

}
