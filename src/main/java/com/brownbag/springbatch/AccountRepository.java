package com.brownbag.springbatch;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brownbag.springbatch.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
