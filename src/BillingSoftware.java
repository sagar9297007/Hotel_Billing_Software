import java.util.*;
class BillingSoftware 
{
	static Scanner sc= new Scanner (System.in);
	static ArrayList<String> order = new ArrayList<String>();
	static ArrayList<Integer> price = new ArrayList<Integer>();
	static ArrayList<Integer> quantity = new ArrayList<Integer>();
	static String mailId;
	static String name;
	static int feedBack;

	static void order()
	{
		System.out.println("\n");
		menue();
		System.out.println("\n");
		char conti;
		String cont;
		int option;
		do
		{
		System.out.println("\n"+"Please enter your order");
		option=sc.nextInt();
		choise(option);
		System.out.println("\n"+"Please enter order quantity");
		quantity.add(sc.nextInt());
		System.out.println("\n"+"do you want to continue with order :Yes/No");
		cont=sc.next();
		cont=cont.toUpperCase();
		conti=cont.charAt(0);
		}while(conti =='Y'&&conti !='N');

		bill();

		System.out.println("\n"+"please do visit again!!!");
		System.out.println("\n"+"please give your rating 1-10"+"\n");
		feedBack=sc.nextInt();
		System.out.println("\n"+"Thank you have a nice day!!!");
	}
	static void bill()
	{
		System.out.println(name+"  "+mailId);
		System.out.println("*****************************************************************************************************************");
		System.out.println("                                               Bill details                                                                      ");
		System.out.println("*****************************************************************************************************************");
		System.out.println("SL.N                          ITEAM                     COST                 quantity              subtotal");
		int count =0;
		for(int i=0;i<order.size();i++)
		{
		System.out.println(count+"                          "+order.get(i)+"                 "+price.get(i)+" Rs                 "+quantity.get(i)+"                    "+price.get(i)*quantity.get(i)+" Rs");
		}
		System.out.println("\n"+"*****************************************************************************************************************");
		int total=0;
		for (int i=0;i<order.size();i++)
		{
			total+=quantity.get(i)*price.get(i);
		}
		System.out.println("                                                                                          Grand Total  :- "+total);
		System.out.println("*****************************************************************************************************************");
	}
	static void choise (int op)
	{
			switch(op)
			{
				case 1:	price.add(10);
						order.add("coffee / tea");
						break;
				case 2: price.add(20);
						order.add("    Idly    ");
						break;
				case 3:price.add(35);
						order.add("  Idly Vada ");
						break;
				case 4: price.add(35);
						order.add("  Plain Dosa");
						break;
				case 5:	price.add(40);	
						order.add("  Onion Dosa");
						break;
				case 6: price.add(40);
						order.add("  Masal Dosa");
						break;
				case 7: price.add(40);
						order.add("    Poori   ");
						break;
				case 8: price.add(40);
						order.add("    Parota  ");
						break;
				default:System.out.println("\n"+"please enter valid key");
						break;
			}
	
	}
	static void menue()
	{
		System.out.println("*********************************************************************");
		System.out.println("                            Menue table                              ");
		System.out.println("*********************************************************************");
		System.out.println("SL.N                            ITEAM                          COST  ");
		System.out.println("\n");
		System.out.println(" 01                          Coffee / Tea                      10Rs  ");
		System.out.println("\n");
		System.out.println(" 02                              Idly                          20Rs  ");
		System.out.println("\n");
		System.out.println(" 03                            Idly Vada                       35Rs  ");
		System.out.println("\n");
		System.out.println(" 04                            Plain Dosa                      35Rs  ");
		System.out.println("\n");
		System.out.println(" 05                            Onion Dosa                      40Rs  ");
		System.out.println("\n");
		System.out.println(" 06                            Masal Dosa                      40Rs  ");
		System.out.println("\n");
		System.out.println(" 07                              Poori                         40Rs  ");
		System.out.println("\n");
		System.out.println(" 08                              Parota                        40Rs  ");
		System.out.println("\n");
		System.out.println("*********************************************************************");
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter your name");
		name=sc.next();
		System.out.println("Please enter your mail adress");
		Scanner sc= new Scanner (System.in);
		mailId=sc.next();
		
		order();

	}
}
