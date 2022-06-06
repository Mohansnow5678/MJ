package chap5;

public class Method2 {

	public static void main(String[] args) {
		
		Mybank sbi=new Mybank();
	   Money myMoney=new Money();
		sbi.acceptmoney(myMoney);
        sbi.TransferMoney(10000,new Account());
	
	}}

class Mybank
{
	public void acceptmoney(Money m)
	{
}
	public void TransferMoney(int amt, Account acct)
	{
		acct.credit(100);
		acct.debit(200);
		
		
	}}	
		
class Money{
	
}

class Account{
	public void debit(int drid) {
		System.out.println(drid);
	}
	public void credit(int crdid)
	{
		System.out.println(crdid);
	}
	
}

