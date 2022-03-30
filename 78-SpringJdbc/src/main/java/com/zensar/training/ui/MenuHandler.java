package com.zensar.training.ui;

import java.util.Scanner;

public class MenuHandler {
	int choice;
	
	public void displayMenu() {
		System.out.println();
		String[] menuItems= {
			"Add New Employee",
			"Edit Employee Info",
			"Search Employee Info",
			"List All Employee Info",
			"Delete Employee Info",
			"Exit"
		};
		for(int i=0; i<menuItems.length;i++) {
			System.out.println("\t\t\t "+(i+1)+"."+menuItems[i]);
		}
		System.out.println();
		promptChoiceInput();
	}

	public void promptChoiceInput() {
		System.out.print("\t\t\t Enter Your choice : ");
		Scanner scanner=new Scanner(System.in);
		this.choice=scanner.nextInt();
		dispatch();
	}
	
	public void dispatch() {
		UIModule uiModule=new UIModule();
		switch(this.choice) {
		case 1:uiModule.addInfo();break;
		case 2:uiModule.updateInfo();break;
		case 3:uiModule.searchInfo();break;
		case 4:uiModule.listInfo();break;
		case 5:uiModule.deleteInfo();break;
		case 6:System.out.println("\t\t\t Thank you");
				System.exit(0);
		}
	}
}
