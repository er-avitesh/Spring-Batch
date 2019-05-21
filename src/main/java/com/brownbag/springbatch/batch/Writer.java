package com.brownbag.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brownbag.springbatch.AccountRepository;
import com.brownbag.springbatch.model.Account;

@Component
public class Writer implements ItemWriter<Account> {

	@Autowired
	private AccountRepository repo;

	@Override
	public void write(List<? extends Account> items) throws Exception {
		repo.saveAll(items);

	}

}
