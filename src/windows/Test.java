package windows;
public class Test {
	
	
	static void whileloop()
	{
		int a=1;
		while(a<10)
		{
			System.out.println(a);
			a++;
		}
	}
	
	static void forloop()
	{
		for(int i=1; i<10;i++)
		{
			System.out.println(i);
		}
	}
	static void doloop()
	{
		int a=1;
		do
		{
			System.out.println(a);
			a++;
		}while(a<10);
	}

	public static void main(String[] args) 
	{
	whileloop();
	forloop();
	doloop();
	
		/*
		 * if(5<10) { System.out.println("if"); } else if(5==8) {
		 * System.out.println("else if"); } else { System.out.println("else");
		}
        */
       
       int a=30;
       
       
       switch (a) {   
	case 20:
		System.out.println("20");
		break;
	case 10:
		System.out.println("10");
		break;
	case 30:
		System.out.println("30");
		break;
	case 1000:
		System.out.println("1000");
		break;

	default:
		System.out.println("default");
		break;
	}
       

	}

}
 
