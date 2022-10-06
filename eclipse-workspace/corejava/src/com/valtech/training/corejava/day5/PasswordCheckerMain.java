package com.valtech.training.corejava.day5;

public class PasswordCheckerMain {
	int valueUpper=0;
	int valueLower=0;
	int valueNumber=0;
	int valueSpecial=0;
	int numberOccurance=0;
	int spchOccurance=0;
	int totalValue=0;
	
	int count = 0;


    public boolean checklower(String str) {
	 int flag = 0;
	 if (str.length() < 8)
	 return false;
	 for (char ch=0;ch<str.length();ch++) 
	 {
		 if (Character.isLowerCase(ch)) 
		 {
			 if (flag == 0) 
			 {
				 count += 5;
				 flag = 1;
				 return true;
				 } 
			 else 
			 {
				 break;
				 }
			 }
		 }
	 return true;
}


public boolean checkupper(String str) {
	 int flag = 0;
	 if (str.length() < 8)
		 return false;
	 for (char ch=0; ch<str.length();ch++) {
		 if (!Character.isLowerCase(ch)) {
		 if (flag == 0) {
			 count += 5;
		     flag = 1;
		     return true;
		 } 
		 else {
			 break;
			 }
		 }
    }
	 return true;
}


public boolean checkdigit(String str) {
	int flag = 0;
	for (char ch = 0; ch < str.length(); ch++) {
		if (Character.isDigit(ch)) {
			if (flag == 0) {
				count += 5;
				flag = 1;
				return true;
            }
			else {
           	 count += 1;            	 
           	 }
			} 
		else {
			return true;               
			}
		}
	return false;
}


public int checkspecialchar(String str) {
	int flag = 0;
	String specialChars = "!@#$%^&*";
	for (int i = 0; i < str.length(); i++) {
		String strChar = Character.toString(str.charAt(i));
		if(specialChars.contains(strChar)) {
			if(flag == 0) {
				count += 5;
				flag = 1;
			}
			else {
				count += 2;
			}
		}
	}
	return count;
	}


	
	public long checkPassWord(String a) {
		char[]p=a.toCharArray();
		if(p.length<8) {
			totalValue=p.length;
		}
		else {
		for(int i=0;i<=p.length-1;i++) {
			if(Character.isLowerCase(p[i])) {
				valueLower=5;
			}
			if(Character.isUpperCase(p[i])) {
				valueUpper=5;
			}
			if(p[i]>='0' && p[i]<='9') {
				numberOccurance++;
				if(numberOccurance>1) {
					valueNumber+=1;
				}
				else {
					valueNumber=5;
				}
			}
			if(p[i]=='#'||p[i]=='$'|| p[i]=='@'||p[i]=='%'||p[i]=='!'||p[i]=='%'||p[i]=='&'||p[i]=='^'||p[i]=='*'||p[i]=='('||p[i]==')'||p[i]=='['||p[i]==']') {
				
				spchOccurance++;
				if(spchOccurance>1) {
					valueSpecial+=2;
				}
				else {
					valueSpecial=5;
				}
			
			}
		}
		
		totalValue=valueLower+valueNumber+valueSpecial+valueUpper;
		
		return totalValue;
	}
		return 0;
	}
	public String checkPasswordStrength(String a) {
		checkPassWord(a);
		if(totalValue>25) {
			return("Strong");
		}
		if(totalValue<=25 && totalValue>20) {
			return ("Moderate");
		}
		if(totalValue<=20 && totalValue>=8) {
			return ("Weak");
		}
		return "Weak Password";
	}
	
}

