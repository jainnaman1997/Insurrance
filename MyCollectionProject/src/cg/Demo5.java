package cg;

import java.util.*;
import com.cg.bean.*;

import com.cg.bean.Account;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Account> aset=new TreeSet<Account>();
		
		Account ob1=new Account(101, 986724701, "Ram", 25000.00);
		Account ob2=new Account(102, 986724702, "Sham", 55000.00);
		Account ob3=new Account(105, 986724703, "Abdul", 15000.00);
		Account ob4=new Account(103, 986724704, "Ganesh", 45000.00);
		
		aset.add(ob1);	// compare method of NameComparator
		aset.add(ob2);
		aset.add(ob3);
		aset.add(ob4);
		
		System.out.println(aset);

	}

}
