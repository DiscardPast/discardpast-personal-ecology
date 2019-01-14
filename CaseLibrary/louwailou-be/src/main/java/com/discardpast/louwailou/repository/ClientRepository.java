package com.discardpast.louwailou.repository;

import com.discardpast.louwailou.dao.user.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
