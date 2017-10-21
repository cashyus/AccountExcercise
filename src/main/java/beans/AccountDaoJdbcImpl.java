package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class AccountDaoJdbcImpl implements AccountDao {
	
	@Bean()
	public AccountDao accountDaoJdbc(){
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public AccountService accountService(){
		AccountServiceImpl bean = new AccountServiceImpl(null);
		return bean;
	}

	public void insert(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long accountId) {
		// TODO Auto-generated method stub
		
	}

	public Account find(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(List<Long> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

