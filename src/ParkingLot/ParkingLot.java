package ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Mobil> lot;	
		
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			String[] input = a.split(" ");
			
			if (input[0].equalsIgnoreCase("create_parking_lot")) {
				int slot = Integer.parseInt(input[1]);
				lot = new ArrayList<>(slot);
			}else if (input[0].equalsIgnoreCase("park")) {
				
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
