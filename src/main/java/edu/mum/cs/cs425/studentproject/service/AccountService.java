package edu.mum.cs.cs425.studentproject.service;

import java.util.List;

import edu.mum.cs.cs425.studentproject.model.Account;

public interface AccountService {
	public void addAccount(Account account);
	public List<Account> getAllAccountList();
	public Double getBankLiquidity();
}
