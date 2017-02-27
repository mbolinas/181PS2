package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	
	
	
	
	
	
	public boolean isEven(){
		if(iValue % 2 == 0)
			return true;
		else
			return false;
		
	}
	
	public boolean isOdd(){
		if(iValue % 2 == 1)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		for(int i = 2; i < iValue; i++){
			if(iValue % i == 0)
				return false;
			
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	public static boolean isEven(int i){
		if(i % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int i){
		if(i % 2 == 1)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int i){
		for(int x = 2; x < i; x++){
			if(i % x == 0)
				return false;
			
		}
		return true;
	}
	
	
	
	
	
	public static boolean isEven(MyInteger mi){
		if(mi.getiValue() % 2 == 0)
			return true;
		else
			return false;
	}
	
	
	public static boolean isOdd(MyInteger mi){
		if(mi.getiValue() % 2 == 1)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger mi){
		for(int i = 2; i < mi.getiValue(); i++){
			if(mi.getiValue() % i == 0)
				return false;
			
		}
		return true;
	}
	
	
	
	
	
	public boolean equals(int i){
		return (i == iValue);
	}
	
	public boolean equals(MyInteger mi){
		return (iValue == mi.getiValue());
	}
	
	
}
