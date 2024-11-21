package world;

import java.util.Scanner;

import Client.Clients;
import Market.MarketSystem;
public class TheWorldMain {

	public static int main(String[] args) {
		int key;
		boolean b =true;
		Clients people = new Clients();
		MarketSystem DhiaShop = new MarketSystem();
		System.out.println("Welecome To The World\n-----------------------------------");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"Chose your role :\n[1].Creat People\n[2]Market Manger\n[3].Enter Simulation\nEnter Number :");
			key=scanner.nextInt();
			switch (key) {
			case 1:
				people.creatPersons();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				b=false;
				scanner.close();
			default:
				break;
			}
		} while (b);
		return 0;

	}

}
