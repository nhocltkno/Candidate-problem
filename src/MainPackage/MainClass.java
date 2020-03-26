package MainPackage;

public class MainClass {
    public static void main( String[] args ) throws Exception {
        Menu menu = new Menu();
        Manager manager = new Manager();
        manager.updateFromFile();
        int choice;
        menu.add("Add candidate");
        menu.add("Searching");
        menu.add("Deleting");
        menu.add("Updating");
        menu.add("Quit");
        do {
            System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
            choice = menu.getUserChoice();
            switch (choice){
                case 1:{
                    Menu menu1 = new Menu();
                    menu1.add("Experience");
                    menu1.add("Fresher");
                    menu1.add("Internship");
                    menu1.add("Return");
                    int choice1 ;
                    do {
                        System.out.println("\nINPUT CANDIDATE INFORMATION");
                        choice1 = menu1.getUserChoice();
                        switch (choice1) {
                            case 1:{
                                manager.create_Exp();
                                break;
                            }

                            case 2:{
                                manager.create_Fresh();
                                break;
                            }

                            case 3:{
                                manager.create_Intern();
                                break;
                            }

                            default:{
                                if (choice1!=4) {
                                    System.out.println("\nYou have made a wrong choice");
                                }
                            }
                        }
                    } while (choice1!=4);
                    manager.saveToFile();
                    break;
                }

                case 2:{
                    Menu menu1 = new Menu();
                    menu1.add("Search by name");
                    menu1.add("Search by ID");
                    menu1.add("Return");
                    int choice1;
                    do {
                        System.out.println("\nSEARCHING");
                        choice1 = menu1.getUserChoice();
                        switch (choice1) {
                            case 1:{
                                manager.searchByName();
                                break;
                            }
                            case 2:{
                                manager.searchByID();
                                break;
                            }
                            default:{
                                if (choice1!=3) {
                                    System.out.println("\nYou have made a wrong choice");
                                }
                            }
                        }
                    } while (choice1!=3);
                    manager.saveToFile();
                    break;
                }

                case 3:{
                    Menu menu1 = new Menu();
                    menu1.add("Delete by name");
                    menu1.add("Delete by ID");
                    menu1.add("Return");
                    int choice1;
                    do {
                        System.out.println("\n===DELETING===");
                        choice1 = menu1.getUserChoice();
                        switch (choice1) {
                            case 1:{
                                manager.deleteByName();
                                break;
                            }

                            case 2: {
                                manager.deleteByID();
                                break;
                            }
                            default:{
                                if (choice1!=3) {
                                    System.out.println("\nYou have made a wrong choice");
                                }
                            }
                        }
                    } while (choice1!=3);
                    manager.saveToFile();
                    break;
                }

                case 4:{
                    System.out.println("===UPDATING LIST===");
                    manager.updateList();
                    manager.saveToFile();
                    break;
                }

                default:{
                    if (choice !=5){
                        System.out.println("You make a wrong choice!");
                    }
                    else {
                        System.out.println("Goodbye! See you again!");
                    }
                    break;
                }
            }
        } while (choice!=5);
    }
}
