import static org.junit.jupiter.api.Assertions.assertEquals;

import banking.BankingApp;
import org.junit.jupiter.api.Test;

public class BankingAppTest {

	@Test
	void testThatBankingAppStartBalanceIsZero(){

		BankingApp bankingApp = new BankingApp();
		assertEquals( 0, bankingApp.getBalance());
	}


	@Test
	void testThatBankingAppCanDeposit(){

		//given
		BankingApp bankingApp = new BankingApp();
		assertEquals(0,bankingApp.getBalance() );

		//when
		bankingApp.deposit(1000);

		//assert
		assertEquals( 1000, bankingApp.getBalance());
	}

	@Test
	void testThatBankingAppCanMakeMultipleDeposits(){

		//given
		BankingApp bankingApp = new BankingApp();
		assertEquals(0,bankingApp.getBalance());

		//when
		bankingApp.deposit(1000);

		//assert
		assertEquals( 1000, bankingApp.getBalance());

		bankingApp.deposit(1000);
		bankingApp.deposit(1000);

		//assert
		assertEquals( 3000, bankingApp.getBalance());


	}

	@Test
	void testThatBankingAppCannotDepositNegativeAmount(){

		//given
		BankingApp bankingApp = new BankingApp();
		assertEquals(0,bankingApp.getBalance());

		//when
		bankingApp.deposit(-1000);

		//assert
		assertEquals( 0, bankingApp.getBalance());
	}

	@Test
	void testThatBankingAppCanWithdraw(){
		//given
		BankingApp bankingApp = new BankingApp();
		//when
		bankingApp.deposit(1000);
		assertEquals( 1000, bankingApp.getBalance());

		bankingApp.withdraw(500);
		assertEquals( 500, bankingApp.getBalance());
	}

	//test that should not withdraw negative amount
	//test that should not withdraw above balance
	//test for transfer

	@Test
	void testThatBankingAppCannotWithdrawNegativeAmount(){
		//given
		BankingApp bankingApp = new BankingApp();
		//when
		bankingApp.withdraw(-100);
		assertEquals(0, bankingApp.getBalance());
	}

	@Test
	void testThatBankingAppCannotWithdrawAboveBalance(){
		BankingApp bankingApp = new BankingApp();
		assertEquals(0,bankingApp.getBalance());

		bankingApp.deposit(2000);
		assertEquals(2000, bankingApp.getBalance());

		bankingApp.withdraw(3000);
		assertEquals(2000, bankingApp.getBalance());
	}

	@Test
	void testThatBankingAppCanTransfer(){
		BankingApp customer1 = new BankingApp();
		BankingApp customer2 = new BankingApp();

		customer1.deposit(3000);
		customer1.withdraw(300);

        customer2.transfer(customer2, 300);

		assertEquals(2700, customer1.getBalance());
		assertEquals(300, customer2.getBalance());
	}






}