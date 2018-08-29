package com.qa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.Domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
