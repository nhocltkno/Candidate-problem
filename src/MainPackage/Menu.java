package MainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> {
    public Menu(){
        super();
    }

    public int getUserChoice(){
        int choice = 0;
        boolean check;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<this.size();i++){
            System.out.println((i+1)+". "+this.get(i));
        }
        do {
            System.out.print("Your choice: ");
            try {
                choice =Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (Exception e){
                check = true;
                System.out.println("Wrong type input!");
            }
        } while (check);
        return choice;
    }
}
