package Day_03;

public class OperatorsAndExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30,b=20;
		//Assignment Operators
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Sum of a and b is:"+(a-b));
		System.out.println("Sum of a and b is:"+(a*b));
		System.out.println("Sum of a and b is:"+(a/b));
		System.out.println("Sum of a and b is:"+(a%b));
		
		//Relational Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	     b=30;
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res=a>b;
		System.out.println(res);
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);
		
		boolean b2=20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1|| b2);
		System.out.println(!b1);
		System.out.println(!b2);
		
		System.out.println((10<20) && (20>10));
		
		
		int d=100;
		int rees=--d;
		System.out.println(rees);  //pre decrement
		System.out.println(d);
		
		
		int e=20;
		int ese=e++;
		System.out.println(ese);   //post increment
		System.out.println(e);
		
		int f=20;
		int des=++f;
		System.out.println(des);  //pre increment
		System.out.println(f);
		
		int g=40;
		int yes=g--;    //post decrement
		System.out.println(yes);
		System.out.println(g);
		
		//Assignment Operator
		
		int z=10;
		z+=5;
		System.out.println(z);
		
		int m=140;
		m-=80;
		System.out.println(m);
		
		int h=230;
		h*=30;
		System.out.println(h);
		
		int t=30;
		t/=2;
		System.out.println(t);
		
		int cc=20;
		cc%=2;
		System.out.println(cc);
		
		//Teranary or Conditional Operators
		
		int xam=(1==1)?100:200;
		System.out.println(xam);
		
		int adc=100, bts=200;
		int sam=(a>b)?adc:bts;
		System.out.println(sam);
		
	   boolean cloud=false;
	   String weather =cloud?"need umberlla":"need not umberlla";
	   System.out.println(weather);
	   
	   String coffeeOrder = "Piccolo Latte";
       String FinalOrder = (coffeeOrder == "Espresso") ? " would you like whipped cream on the top" : (coffeeOrder == "Piccolo Latte") ? "25ml or 30ml" : (coffeeOrder == "Macchiato") ? "Short or long" : "Hello, we were unable to process your order";
       System.out.println(FinalOrder);
       
       //unary operators ++,--,+=,-=,*=,/=,%=,=,!
       //binary operators +,-,*,/,%,>,>=,<,<=,!=,==,&&,||
       //ternaryOperators ?:
		
		
		
		
		
				
		
		
		
		
				

	}

}
