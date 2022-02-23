package com.onesimpl.paylater;

import com.onesimpl.paylater.controller.OutputGenerator;

import java.util.Scanner;

public class PayLaterApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String command = sc.nextLine();
			if (command == null || command.isEmpty())
				return;
			OutputGenerator.generate(command);
		}
	}
}
