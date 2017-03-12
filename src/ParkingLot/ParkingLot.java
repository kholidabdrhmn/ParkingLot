package ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Mobil[] lot;	
		
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			String[] input = a.split(" ");
			
			if (input[0].equalsIgnoreCase("create_parking_lot")) {
				int slot = Integer.parseInt(input[1]);
				lot = new Mobil[slot];
				System.out.println(lot.length);
				System.out.println("Created a parking lot with "+slot+" slots");
			}else if (input[0].equalsIgnoreCase("park")) {
				
			}else if (input[0].equalsIgnoreCase("leave")) {
				
			}else if (input[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour")) {
				
			}else if (input[0].equalsIgnoreCase("slot_number_for_cars_with")) {
				
			}else if (input[0].equalsIgnoreCase("slot_number_for_registration_number")) {
				
			}else if (input[0].equalsIgnoreCase("status")) {
				
			}
			
		}
		sc.close();
	}
	class Mobil{
		String warna;
		String nomor;
		int slotNo;
		
		public Mobil(){
			warna = "";
			nomor = "";
			slotNo = 0;
		}
	}
}
