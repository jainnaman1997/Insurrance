package cg;

import java.util.*;

import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Long, Account> accmap=new TreeMap<Long, Account>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true) {
		System.out.println("Menu");
		System.out.println("------");
		System.out.println("1. Create new Account");
		System.out.println("2. Print all accounts");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice) {
			case "1":	int id=0;
						long mb=0L;
						String ah="";
						double bal=0.0;
						// Accepting and validating input for account number
						System.out.println("Enter account number ");
						while(true) {
							String s_id=br.readLine();
							boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
							if(ch1==true) {
								try {
									id=Integer.parseInt(s_id);
									break;
								}catch(NumberFormatException e) {
									System.out.println("Account number must be numeric.\nRe-Enter");
								}
							}
							else {
								System.out.println("Re-Enter Account Number in 3 digits");
							}
						}	// End of account number while
						
						// Accepting and validating input for mobile number
						System.out.println("Enter mobile number ");
						while(true) {
							String s_mb=br.readLine();
							boolean ch1=Validator.validatedata(s_mb, Validator.mobilepattern);
							if(ch1==true) {
								try {
									mb=Long.parseLong(s_mb);
									break;
								}catch(NumberFormatException e) {
									System.out.println("Mobile number must be numeric.\nRe-Enter");
								}
							}
							else {
								System.out.println("Re-Enter Mobile Number in 10 digits");
							}
						}	// End of mobile number while
						
						// Accepting and validating input for account holder
						System.out.println("Enter account holder name ");
						while(true) {
							ah=br.readLine();
							boolean ch1=Validator.validatedata(ah, Validator.namepattern);
							if(ch1==true) {
								break;
							}
							else {
								System.out.println("Re-Enter Account holder name");
							}
						}
						
						// Accepting and validating input for balance
						System.out.println("Enter initial balance ");
						while(true) {
							String s_bal=br.readLine();
							boolean ch1=Validator.validatedata(s_bal, Validator.balancepatter);
							if(ch1==true) {
								try {
									bal=Double.parseDouble(s_bal);
									break;
								}catch(NumberFormatException e) {
									System.out.println("Balance must be double.\nRe-Enter");
								}
							}
							else {
								System.out.println("Re-Enter Balance");
							}
						}
						Account ob=new Account(id, mb, ah, bal);
						accmap.put(ob.getMobile(), ob);

						break;
			case "2":	Collection<Account> vc=accmap.values();
						List<Account> acclist=new ArrayList<Account> (vc);
			
						Collections.sort(acclist);
						for(Account o:acclist) {
							System.out.println(o);
						}
						break;
			case "3":	System.out.println("Exiting Program");
						System.exit(0);
						break;
			default :	System.out.println("Invalid choice");
		}
		
		}	//end of menu
		
		/*System.out.println(accmap);
		System.out.println(accmap.keySet());
		System.out.println("----------sort by aid-------------");
		Collection<Account> acc=accmap.values();
		List<Account> acclist=new ArrayList<Account> (acc);
		
		Collections.sort(acclist);
		for(Account o:acclist) {
			System.out.println(o);
		}
		
		System.out.println("----------sort by name-------------");
		Comparator nc=new NameComparator();
		Collections.sort(acclist,nc);
		for(Account o:acclist) {
			System.out.println(o);
		}
		
		System.out.println("----------sort by balance-------------");
		Comparator bc=new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o:acclist) {
			System.out.println(o);
		}
		System.out.println("---------------------------------");
		
		/*Set<Account> aset=new TreeSet<Account>();
		aset.add(ob1);	// compare method of NameComparator
		aset.add(ob2);
		aset.add(ob3);
		aset.add(ob4);
		
		System.out.println(aset);*/


	}

}
