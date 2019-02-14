package com.bank.repository;

import org.apache.log4j.Logger;

import com.bank.model.Account;

public class JdbcAccountRepository {
	
	private static Logger logger=Logger.getLogger("bank");
	
	public JdbcAccountRepository() {
		logger.info("JdbcAccountRepository instance created...");
	}

	public Account loadAccount(String num) {
		// ..
		logger.info("loading account "+num);
		return null;
	}

	public void updateAccount(Account account) {
		logger.info("updating account ");
		// ..
	}

}
