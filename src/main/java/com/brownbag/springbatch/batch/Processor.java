package com.brownbag.springbatch.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.brownbag.springbatch.model.Account;
@Component
public class Processor implements ItemProcessor<Account, Account> {

	@Override
	public Account process(Account item) throws Exception {
		String accountTypeCd = item.getType();
		String type = ACCOUNT_TYPE_MAPPING.get(accountTypeCd);
		item.setType(type);
		return item;
	}

	private static final Map<String, String> ACCOUNT_TYPE_MAPPING = new HashMap<>();

	public Processor() {
		ACCOUNT_TYPE_MAPPING.put("001", "SAVING");
		ACCOUNT_TYPE_MAPPING.put("002", "CHECKING");
	}

}
