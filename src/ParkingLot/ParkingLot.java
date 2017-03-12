package ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Mobil[] lot = null;
		int counter = 0;
		
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			String[] input = a.split(" ");
			
			if (input[0].equalsIgnoreCase("create_parking_lot")) {
				int slot = Integer.parseInt(input[1]);
				lot = new Mobil[slot];
				System.out.println(lot.length);
				System.out.println("Created a parking lot with "+slot+" slots");
			}else if (input[0].equalsIgnoreCase("park")) {
				if (counter < lot.length) {
					String nomor = input[1];
					String warna = input[2];
					int slotNo = counter + 1;
					Mobil mobil = new Mobil(nomor,warna,slotNo);
					System.out.println(mobil.nomor);
					lot[counter] = mobil;
					System.out.println("Allocated slot number: "+ mobil.slotNo);
					counter++;
				}else {
					System.out.println("sudah penuh");
				}
			}else if (input[0].equalsIgnoreCase("leave")) {
				
			}else if (input[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour")) {
				
			}else if (input[0].equalsIgnoreCase("slot_number_for_cars_with")) {
				
			}else if (input[0].equalsIgnoreCase("slot_number_for_registration_number")) {
				
			}else if (input[0].equalsIgnoreCase("status")) {
				
			}
			
		}
		sc.close();
	}
	static class Mobil{
		String warna;
		String nomor;
		int slotNo;
		
		public Mobil(){
			warna = "";
			nomor = "";
			slotNo = 0;
		}
		public Mobil(String nomor, String warna, int slotNo){
			this.warna = warna;
			this.nomor = nomor;
			this.slotNo = slotNo;
		}

	}
}
