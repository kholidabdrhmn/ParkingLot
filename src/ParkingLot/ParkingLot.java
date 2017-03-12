package ParkingLot;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mobil[] lot = null;
		int counter = 0;

		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			String[] input = a.split(" ");

			if (input[0].equalsIgnoreCase("create_parking_lot")) {
				int slot = Integer.parseInt(input[1]);
				lot = new Mobil[slot];
				//System.out.println(lot.length);
				System.out.println("Created a parking lot with " + slot + " slots");
			} else if (input[0].equalsIgnoreCase("park")) {
				for (int i = 0; i < lot.length; i++) {
					
					if (lot[i] == null) {
						String nomor = input[1];
						String warna = input[2];
						int slotNo = i + 1;
						Mobil mobil = new Mobil(nomor, warna, slotNo);
						//System.out.println(mobil.nomor);
						lot[i] = mobil;
						System.out.println("Allocated slot number: " + mobil.slotNo);
						break;
					}
				}
//				for (int j = 0; j < lot.length; j++) {
//					if (lot[j] == null) {
//						counter = counter + 1;
//						System.out.println(counter);
//					}
//				}
//				if (counter == lot.length) {
//					//System.out.println(counter);
//					System.out.println("full");
//					counter = 0;
//				}
			} else if (input[0].equalsIgnoreCase("leave")) {
				int slotFree = Integer.parseInt(input[1]);
				int idx = slotFree - 1;
				lot[idx] = null;
				System.out.println("Slot number "+slotFree+" is free");
			} else if (input[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour")) {
				String warna = input[1];
				ArrayList<String> wrn = new ArrayList<>();
				int bb = 0;
				for (int i = 0; i<lot.length; i++) {
					if(lot[i].warna.equalsIgnoreCase(warna)) {
						wrn.add(lot[i].nomor);
						bb++;
					}
				}
				for (int j = 0; j < wrn.size();j++) {
					if (j < wrn.size()-1) {
						System.out.print(wrn.get(j)+", ");
					}else {
						System.out.println(wrn.get(j));
					}
				}
				if (bb == 0) {
					System.out.println("Not found");
				}
			} else if (input[0].equalsIgnoreCase("slot_numbers_for_cars_with_colour")) {
				String warna = input[1];
				ArrayList<Integer> wrn = new ArrayList<>();
				int ab = 0;
				for (int i = 0; i<lot.length; i++) {
					if(lot[i].warna.equalsIgnoreCase(warna)) {
						wrn.add(lot[i].slotNo);
						ab++;
					}
				}
				for (int j = 0; j < wrn.size();j++) {
					if (j < wrn.size()-1) {
						System.out.print(wrn.get(j)+", ");
					}else {
						System.out.println(wrn.get(j));
					}
				}
				if (ab == 0) {
					System.out.println("Not found");
				}
			} else if (input[0].equalsIgnoreCase("slot_number_for_registration_number")) {

			} else if (input[0].equalsIgnoreCase("status")) {
				System.out.format("%10s%35s%15s", "No. ", "Registration Slot No.", "Colour");
				System.out.println();
				for (int i = 0; i < lot.length; i++) {
					if (lot[i]!= null) {
						Mobil mbl = lot[i];
						System.out.format("%10s%35s%15s", mbl.slotNo, mbl.nomor, mbl.warna);
						System.out.println();
					}
				}
			}

		}
		sc.close();
	}

	static class Mobil {
		String warna;
		String nomor;
		int slotNo;

		public Mobil() {
			warna = "";
			nomor = "";
			slotNo = 0;
		}

		public Mobil(String nomor, String warna, int slotNo) {
			this.warna = warna;
			this.nomor = nomor;
			this.slotNo = slotNo;
		}

	}
}
