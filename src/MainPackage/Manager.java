package MainPackage;

import People.Candidate;
import People.Experiencer;
import People.Fresher;
import People.Internship;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Manager {
    protected ArrayList<Candidate> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void create_Exp(){
        String iD ;
        String name ;
        int date = 0;
        String address ;
        String phoneNumber ;
        String email ;
        int type = 0;
        int currentYear = 2020;
        boolean check ;
        int stop = 0;
        do {
            System.out.println("You are inputting Experience Candidate! If you want to stop type QUIT and press ENTER!");
            do {
                System.out.print("Enter the id: ");
                check = false;
                iD = scanner.nextLine();
                if (iD.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !iD.matches("A\\d{4}") ) {
                    check = true;
                    System.out.println("Wrong type ID! Must follow [Axxxx]");
                }
            } while (check);
            if (stop ==1) {
                break;
            }
            do {
                System.out.print("Enter the name: ");
                check = false;
                name = scanner.nextLine();
                if (name.equals("QUIT")){
                    stop =1;
                    break;
                }
                if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                    check = true;
                    System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            do {
                String test ;
                System.out.print("Enter year of birthday: ");
                test = scanner.nextLine();
                if (test.equals("QUIT")){
                    stop =1;
                    break;
                }
                try {
                    date = Integer.parseInt(test);
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid year!");
                }
                if ( !check ) {
                    if ( date < 1900 || date > currentYear ) {
                        check = true;
                        System.out.println("Year must be >=1900 and <= current Year");
                    }
                }
            } while (check);
            if (stop == 1){
                break;
            }
            System.out.print("Enter the address: ");
            address = scanner.nextLine();
            if (address.equals("QUIT")){
                break;
            }
            do {
                System.out.print("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                check = false;
                if (phoneNumber.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                    check = true;
                    System.out.println("Invalid phone number [only digits min:10, max:15]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            do {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                check = false;
                if (email.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                    check = true;
                    System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            int expYear = 0;
            String proSkill ;
            do {
                String test ;
                System.out.print("Enter experience in year: ");
                check = false;
                test = scanner.nextLine();
                if (test.equals("QUIT")){
                    stop =1;
                    break;
                }
                try {
                    expYear = Integer.parseInt(test);
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid year!");
                }
                if ( !check ) {
                    if ( expYear > 100 || expYear < 0 ) {
                        check = true;
                        System.out.println("Year of experience must be larger than 0 and smaller than 100");
                    }
                }
            } while (check);
            if (stop == 1){
                break;
            }
            System.out.print("Enter the professional skill: ");
            proSkill = scanner.nextLine();
            if (proSkill.equals("QUIT")){
                break;
            }
            Experiencer experiencer = new Experiencer(iD, name, date, address, phoneNumber, email, type, expYear, proSkill);
            list.add(experiencer);
        } while (true);
    }

    public void create_Fresh(){
        String iD ;
        String name;
        int date = 0;
        String address ;
        String phoneNumber ;
        String email ;
        int type = 1;
        int currentYear = 2020;
        boolean check ;
        int stop = 0;
        do {
            System.out.println("You are inputting Fresher Candidate! If you want to stop type QUIT and press ENTER!");
            do {
                System.out.print("Enter the id: ");
                check = false;
                iD = scanner.nextLine();
                if (iD.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !iD.matches("A\\d{4}") ) {
                    check = true;
                    System.out.println("Wrong type ID! Must follow [Axxxx]");
                }
            } while (check);
            if (stop ==1) {
                break;
            }
            do {
                System.out.print("Enter the name: ");
                check = false;
                name = scanner.nextLine();
                if (name.equals("QUIT")){
                    stop =1;
                    break;
                }
                if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                    check = true;
                    System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            do {
                String test ;
                System.out.print("Enter year of birthday: ");
                test = scanner.nextLine();
                if (test.equals("QUIT")){
                    stop =1;
                    break;
                }
                try {
                    date = Integer.parseInt(test);
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid year!");
                }
                if ( !check ) {
                    if ( date < 1900 || date > currentYear ) {
                        check = true;
                        System.out.println("Year must be >=1900 and <= current Year");
                    }
                }
            } while (check);
            if (stop == 1){
                break;
            }
            System.out.print("Enter the address: ");
            address = scanner.nextLine();
            if (address.equals("QUIT")){
                break;
            }
            do {
                System.out.print("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                check = false;
                if (phoneNumber.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                    check = true;
                    System.out.println("Invalid phone number [only digits min:10, max:15]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            do {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                check = false;
                if (email.equals("QUIT")){
                    stop = 1;
                    break;
                }
                if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                    check = true;
                    System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            int graDate = 0;
            String graRank;
            String education ;
            do {
                System.out.print("Enter the year of graduation date: ");
                String test = scanner.nextLine();
                if (test.equals("QUIT")){
                    stop =1;
                    break;
                }
                try {
                    graDate = Integer.parseInt(test);
                    check = false;
                } catch (Exception e){
                    System.out.println("Invalid year!");
                    check = true;
                }
                if (!check){
                    if (graDate<=date || graDate>currentYear){
                        check = true;
                        System.out.println("Graduate year must larger than birthday and smaller than current year!!");
                    }
                }
            } while (check);
            if (stop == 1){
                break;
            }
            do {
                System.out.print("Enter the graduation rank: ");
                graRank = scanner.nextLine();
                if (graRank.equals("QUIT")){
                    stop =1;
                    break;
                }
                check = false;
                if (!graRank.matches("(Excellent|Good|Fair|Poor)")){
                    check = true;
                    System.out.println("Graduation rank must be Excellent, Good, Fair or Poor!");
                }
            } while (check);
            if (stop == 1){
                break;
            }
            System.out.print("Enter the university: ");
            education = scanner.nextLine();
            if (education.equals("QUIT")){
                break;
            }
            Fresher fresher = new Fresher(iD,name,date,address,phoneNumber,email,type,graDate,graRank,education);
            list.add(fresher);
        } while (true);
    }

    public void create_Intern(){
        String iD;
        String name;
        int date = 0;
        String address;
        String phoneNumber;
        String email;
        int type = 2;
        int currentYear = 2020;
        boolean check;
        int stop = 0;
        do {
            System.out.println("You are inputting Intern Candidate! If you want to stop type QUIT and press ENTER!");
            do {
                System.out.print("Enter the id: ");
                check = false;
                iD = scanner.nextLine();
                if ( iD.equals("QUIT") ) {
                    stop = 1;
                    break;
                }
                if ( !iD.matches("A\\d{4}") ) {
                    check = true;
                    System.out.println("Wrong type ID! Must follow [Axxxx]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            do {
                System.out.print("Enter the name: ");
                check = false;
                name = scanner.nextLine();
                if ( name.equals("QUIT") ) {
                    stop = 1;
                    break;
                }
                if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                    check = true;
                    System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            do {
                String test ;
                System.out.print("Enter year of birthday: ");
                test = scanner.nextLine();
                if ( test.equals("QUIT") ) {
                    stop = 1;
                    break;
                }
                try {
                    date = Integer.parseInt(test);
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid year!");
                }
                if ( !check ) {
                    if ( date < 1900 || date > currentYear ) {
                        check = true;
                        System.out.println("Year must be >=1900 and <= current Year");
                    }
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            System.out.print("Enter the address: ");
            address = scanner.nextLine();
            if ( address.equals("QUIT") ) {
                break;
            }
            do {
                System.out.print("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                check = false;
                if ( phoneNumber.equals("QUIT") ) {
                    stop = 1;
                    break;
                }
                if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                    check = true;
                    System.out.println("Invalid phone number [only digits min:10, max:15]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            do {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                check = false;
                if ( email.equals("QUIT") ) {
                    stop = 1;
                    break;
                }
                if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                    check = true;
                    System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            String major;
            String semester ;
            String uniName ;
            do {
                System.out.print("Enter the major: ");
                major = scanner.nextLine();
                if (major.equals("QUIT")){
                    stop = 1;
                    break;
                }
                check = false;
                if (!major.matches("[a-zA-z]{2,30}")){
                    check = true;
                    System.out.println("Invalid major [char only min:2, max:30]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            do {
                System.out.print("Enter the semester: ");
                semester = scanner.nextLine();
                if (semester.equals("QUIT")){
                    stop = 1;
                    break;
                }
                check = false;
                if (!semester.matches("(Spring|Fall|Summer|Winter)[-]\\d{4}")){
                    check = true;
                    System.out.println("Invalid semester format [Spring|Fall|Summer|Winter-xxxx]");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            do {
                System.out.print("Enter the name of university: ");
                uniName = scanner.nextLine();
                if (uniName.equals("QUIT")){
                    stop =1;
                    break;
                }
                check = false;
                if (!uniName.matches("[a-zA-z]{1,40}")){
                    check = true;
                    System.out.println("Invalid name format char only min:1, max:40");
                }
            } while (check);
            if ( stop == 1 ) {
                break;
            }
            Internship internship = new Internship(iD,name,date,address,phoneNumber,email,type,major,semester,uniName);
            list.add(internship);
        } while (true);
    }

    public void display(){
        System.out.println("List of candidates:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 0 ) {
                System.out.print(candidate.getName()+"  ");
            }
        }
        System.out.println("\n==========FRESHER CANDIDATE================");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 1 ) {
                System.out.print(candidate.getName()+"  ");
            }
        }
        System.out.println("\n===========INTERN CANDIDATE================");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 2 ) {
                System.out.print(candidate.getName()+"  ");
            }
        }
    }

    public void displayID(){
        System.out.println("List of candidates:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 0 ) {
                System.out.print(candidate.getID()+"  ");
            }
        }
        System.out.println("\n==========FRESHER CANDIDATE================");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 1 ) {
                System.out.print(candidate.getID()+"  ");
            }
        }
        System.out.println("\n===========INTERN CANDIDATE================");
        for ( Candidate candidate : list ) {
            if ( candidate.getType() == 2 ) {
                System.out.print(candidate.getID()+"  ");
            }
        }
    }

    public void searchByName(){
        if (list.size()<=0){
            System.out.println("List is empty!");
        } else {
            display();
            String name;
            int type = 0;
            boolean check;
            System.out.print("Input Candidate name (First name or Last name): ");
            name = scanner.nextLine();
            do {
                System.out.print("Input type of candidate (0:Experience, 1:Fresher, 2:Internship): ");
                try {
                    type = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid type [0,1,2]");
                }
                if ( !check ) {
                    if ( type >= 3 || type < 0 ) {
                        check = true;
                        System.out.println("Invalid type [0,1,2]");
                    }
                }
            } while (check);
            System.out.println();
            System.out.println("The candidate found: ");
            for ( Candidate candidate : list ) {
                if ( candidate.getType() == type && candidate.getName().contains(name) ) {
                    System.out.println(candidate);
                }
            }
        }
    }

    public void searchByID(){
        if (list.size()<=0){
            System.out.println("List is empty");
        } else {
            displayID();
            boolean check;
            String iD;
            int type = 0;
            do {
                System.out.print("Enter the id: ");
                check = false;
                iD = scanner.nextLine();
                if ( !iD.matches("A\\d{4}") ) {
                    check = true;
                    System.out.println("Wrong type ID! Must follow [Axxxx]");
                }
            } while (check);
            do {
                System.out.print("Input type of candidate (0:Experience, 1:Fresher, 2:Internship): ");
                try {
                    type = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid type [0,1,2]");
                }
                if ( !check ) {
                    if ( type >= 3 || type < 0 ) {
                        check = true;
                        System.out.println("Invalid type [0,1,2]");
                    }
                }
            } while (check);

            System.out.println();
            System.out.println("The candidate found: ");
            for ( Candidate candidate : list ) {
                if ( candidate.getType() == type && candidate.getID().equals(iD) ) {
                    System.out.println(candidate);
                }
            }
        }
    }

    public void deleteByID(){
        if (list.size()<=0){
            System.out.println("List is empty");
        } else {
            displayID();
            boolean check;
            String iD;
            int type = 0;
            do {
                System.out.print("Enter the id: ");
                check = false;
                iD = scanner.nextLine();
                if ( !iD.matches("A\\d{4}") ) {
                    check = true;
                    System.out.println("Wrong type ID! Must follow [Axxxx]");
                }
            } while (check);
            do {
                System.out.print("Input type of candidate (0:Experience, 1:Fresher, 2:Internship): ");
                try {
                    type = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid type [0,1,2]");
                }
                if ( !check ) {
                    if ( type >= 3 || type < 0 ) {
                        check = true;
                        System.out.println("Invalid type [0,1,2]");
                    }
                }
            } while (check);

            System.out.println();
            for ( Candidate candidate : list ) {
                if ( candidate.getType() == type && candidate.getID().equals(iD) ) {
                    list.remove(candidate);
                }
            }
            System.out.println("======AFTER DELETING=====");
            display();
        }
    }

    public void deleteByName(){
        if (list.size()<=0){
            System.out.println("List is empty!");
        } else {
            String name;
            int type = 0;
            boolean check;
            System.out.print("Input Candidate name (First name or Last name): ");
            name = scanner.nextLine();
            do {
                System.out.print("Input type of candidate (0:Experience, 1:Fresher, 2:Internship): ");
                try {
                    type = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid type [0,1,2]");
                }
                if ( !check ) {
                    if ( type >= 3 || type < 0 ) {
                        check = true;
                        System.out.println("Invalid type [0,1,2]");
                    }
                }
            } while (check);
            System.out.println();
            ArrayList<Candidate> candidate1 = new ArrayList<>();
            for ( Candidate candidate : list ) {
                if ( candidate.getType() == type && candidate.getName().contains(name) ) {
                    candidate1.add(candidate);
                }
            }
            for (int i = 0;i<candidate1.size();i++){
                System.out.println((i+1)+" "+candidate1.get(i).getName());
            }

            int choose = 0;
            do {
                System.out.print("Enter the index you want to delete: ");
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e){
                    check = true;
                    System.out.println("Invalid index!");
                }
                if (choose<=0 || choose>candidate1.size()){
                    check =true;
                    System.out.println("Invalid index");
                }
            } while (check);
            list.remove(candidate1.get(choose-1));
            System.out.println("======AFTER DELETING=====");
            display();
        }
    }

    public void updateList(){
        if (list.size()<=0){
            System.out.println("List is empty");
        } else {
            displayID();
            int type = 0;
            boolean check;
            do {
                System.out.print("Input type of candidate (0:Experience, 1:Fresher, 2:Internship): ");
                try {
                    type = Integer.parseInt(scanner.nextLine());
                    check = false;
                } catch (Exception e) {
                    check = true;
                    System.out.println("Invalid type [0,1,2]");
                }
                if ( !check ) {
                    if ( type >= 3 || type < 0 ) {
                        check = true;
                        System.out.println("Invalid type [0,1,2]");
                    }
                }
            } while (check);
            if (type == 0){
                System.out.println("[NOTE] We allow you to update depend on ID only!");
                String iD;
                do {
                    System.out.print("Enter the id: ");
                    check = false;
                    iD = scanner.nextLine();
                    if ( !iD.matches("A\\d{4}") ) {
                        check = true;
                        System.out.println("Wrong type ID! Must follow [Axxxx]");
                    }
                } while (check);

                System.out.println();
                System.out.println("The candidate found: ");
                for ( Candidate candidate : list ) {
                    if ( candidate.getType() == type && candidate.getID().equals(iD) ) {
                        System.out.println(candidate);
                    }
                }
                System.out.println("[WARNING] You cannot update ID and TYPE and if you don't want to update that value just ENTER");
                String name;
                int date = 0;
                String address;
                String phoneNumber;
                String email;
                int currentYear = 2020;
                do {
                    System.out.print("Enter the name: ");
                    check = false;
                    name = scanner.nextLine();
                    if (name.equals("")){
                        break;
                    }
                    if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                        check = true;
                        System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                    }
                } while (check);
                do {
                    String test;
                    System.out.print("Enter year of birthday: ");
                    test = scanner.nextLine();
                    if (test.equals("")){
                        break;
                    }
                    try {
                        date = Integer.parseInt(test);
                        check = false;
                    } catch (Exception e) {
                        check = true;
                        System.out.println("Invalid year!");
                    }
                    if ( !check ) {
                        if ( date < 1900 || date > currentYear ) {
                            check = true;
                            System.out.println("Year must be >=1900 and <= current Year");
                        }
                    }
                } while (check);
                System.out.print("Enter the address: ");
                address = scanner.nextLine();
                do {
                    System.out.print("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    check = false;
                    if (phoneNumber.equals("")){
                        break;
                    }
                    if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                        check = true;
                        System.out.println("Invalid phone number [only digits min:10, max:15]");
                    }
                } while (check);
                do {
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    check = false;
                    if (email.equals("")){
                        break;
                    }
                    if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                        check = true;
                        System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                    }
                } while (check);
                int expYear = 0;
                String proSkill;
                do {
                    String test;
                    System.out.print("Enter experience in year: ");
                    check = false;
                    test = scanner.nextLine();
                    if (test.equals("")){
                        break;
                    }
                    try {
                        expYear = Integer.parseInt(test);
                    } catch (Exception e) {
                        check = true;
                        System.out.println("Invalid year!");
                    }
                    if ( !check ) {
                        if ( expYear > 100 || expYear < 0 ) {
                            check = true;
                            System.out.println("Year of experience must be larger than 0 and smaller than 100");
                        }
                    }
                } while (check);
                System.out.print("Enter the professional skill: ");
                proSkill = scanner.nextLine();
                for (Candidate candidate:list) {
                    if (candidate.getID().equals(iD) && candidate.getType() == type){
                        Experiencer experiencer = (Experiencer) candidate;
                        if (!name.equals("")) {
                            experiencer.setName(name);
                        }
                        if (!address.equals("")) {
                            experiencer.setAddress(address);
                        }
                        if (!email.equals("")) {
                            experiencer.setEmail(email);
                        }
                        if (phoneNumber.equals("")) {
                            experiencer.setPhoneNumber(phoneNumber);
                        }
                        if (date!=0) {
                            experiencer.setDate(date);
                        }
                        if (!proSkill.equals("")) {
                            experiencer.setProSkill(proSkill);
                        }
                        if (expYear!=0) {
                            experiencer.setExpYear(expYear);
                        }
                        list.remove(candidate);
                        list.add(experiencer);
                    }
                }
            }
            if (type ==1) {
                System.out.println("[NOTE] We allow you to update depend on ID only!");
                String iD;
                do {
                    System.out.print("Enter the id: ");
                    check = false;
                    iD = scanner.nextLine();
                    if ( !iD.matches("A\\d{4}") ) {
                        check = true;
                        System.out.println("Wrong type ID! Must follow [Axxxx]");
                    }
                } while (check);
                System.out.println();
                System.out.println("The candidate found: ");
                for ( Candidate candidate : list ) {
                    if ( candidate.getType() == type && candidate.getID().equals(iD) ) {
                        System.out.println(candidate);
                    }
                }
                String name;
                int date = 0;
                String address;
                String phoneNumber;
                String email;
                int currentYear = 2020;
                System.out.println("[WARNING] You cannot update ID and TYPE and if you don't want to update that value just enter the old");
                do {
                    System.out.print("Enter the name: ");
                    check = false;
                    name = scanner.nextLine();
                    if (name.equals("")){
                        break;
                    }
                    if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                        check = true;
                        System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                    }
                } while (check);
                do {
                    String test;
                    System.out.print("Enter year of birthday: ");
                    test = scanner.nextLine();
                    if (test.equals("")) break;
                    try {
                        date = Integer.parseInt(test);
                        check = false;
                    } catch (Exception e) {
                        check = true;
                        System.out.println("Invalid year!");
                    }
                    if ( !check ) {
                        if ( date < 1900 || date > currentYear ) {
                            check = true;
                            System.out.println("Year must be >=1900 and <= current Year");
                        }
                    }
                } while (check);
                System.out.print("Enter the address: ");
                address = scanner.nextLine();
                do {
                    System.out.print("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    check = false;
                    if (phoneNumber.equals("")) break;
                    if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                        check = true;
                        System.out.println("Invalid phone number [only digits min:10, max:15]");
                    }
                } while (check);
                do {
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    check = false;
                    if (email.equals("")) break;
                    if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                        check = true;
                        System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                    }
                } while (check);
                int graDate = 0;
                String graRank;
                String education;
                do {
                    System.out.print("Enter the year of graduation date: ");
                    String test = scanner.nextLine();
                    if (test.equals("")) break;
                    try {
                        graDate = Integer.parseInt(test);
                        check = false;
                    } catch (Exception e){
                        System.out.println("Invalid year!");
                        check = true;
                    }
                    if (!check){
                        if (graDate<=date || graDate>currentYear){
                            check = true;
                            System.out.println("Graduate year must larger than birthday and smaller than current year!!");
                        }
                    }
                } while (check);
                do {
                    System.out.print("Enter the graduation rank: ");
                    graRank = scanner.nextLine();
                    check = false;
                    if (graRank.equals("")) break;
                    if (!graRank.matches("(Excellent|Good|Fair|Poor)")){
                        check = true;
                        System.out.println("Graduation rank must be Excellent, Good, Fair or Poor!");
                    }
                } while (check);
                System.out.print("Enter the university: ");
                education = scanner.nextLine();
                for (Candidate candidate:list) {
                    if (candidate.getID().equals(iD) && candidate.getType()==type){
                        Fresher fresher = (Fresher) candidate;
                        if (!name.equals("")) fresher.setName(name);
                        if (!address.equals("")) fresher.setAddress(address);
                        if (!email.equals("")) fresher.setEmail(email);
                        if (!phoneNumber.equals("")) fresher.setPhoneNumber(phoneNumber);
                        if (date!=0) fresher.setDate(date);
                        if (!education.equals("")) fresher.setEducation(education);
                        if (graDate!=0) fresher.setGraDate(graDate);
                        if (!graRank.equals("")) fresher.setGraRank(graRank);
                        list.remove(candidate);
                        list.add(fresher);
                    }
                }
            }
            if (type==2) {
                System.out.println("[NOTE] We allow you to update depend on ID only!");
                String iD;
                do {
                    System.out.print("Enter the id: ");
                    check = false;
                    iD = scanner.nextLine();
                    if ( !iD.matches("A\\d{4}") ) {
                        check = true;
                        System.out.println("Wrong type ID! Must follow [Axxxx]");
                    }
                } while (check);

                System.out.println();
                System.out.println("The candidate found: ");
                for ( Candidate candidate : list ) {
                    if ( candidate.getType() == type && candidate.getID().equals(iD) ) {
                        System.out.println(candidate);
                    }
                }
                String name;
                int date = 0;
                String address;
                String phoneNumber;
                String email;
                int currentYear = 2020;
                System.out.println("[WARNING] You cannot update ID and TYPE and if you don't want to update that value just enter the old");
                do {
                    System.out.print("Enter the name: ");
                    check = false;
                    name = scanner.nextLine();
                    if (name.equals("")) break;
                    if ( !name.matches("[1-9a-zA-Z\\s]{3,30}") ) {
                        check = true;
                        System.out.println("Invalid name [digits & alpha chars only, min: 3 and max: 30]");
                    }
                } while (check);
                do {
                    String test;
                    System.out.print("Enter year of birthday: ");
                    test = scanner.nextLine();
                    if (test.equals("")) break;
                    try {
                        date = Integer.parseInt(test);
                        check = false;
                    } catch (Exception e) {
                        check = true;
                        System.out.println("Invalid year!");
                    }
                    if ( !check ) {
                        if ( date < 1900 || date > currentYear ) {
                            check = true;
                            System.out.println("Year must be >=1900 and <= current Year");
                        }
                    }
                } while (check);
                System.out.print("Enter the address: ");
                address = scanner.nextLine();
                do {
                    System.out.print("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    check = false;
                    if (phoneNumber.equals("")) break;
                    if ( !phoneNumber.matches("[0-9]{10,15}") ) {
                        check = true;
                        System.out.println("Invalid phone number [only digits min:10, max:15]");
                    }
                } while (check);
                do {
                    System.out.print("Enter email: ");
                    email = scanner.nextLine();
                    check = false;
                    if (email.equals("")) break;
                    if ( !email.matches("[0-9a-zA-Z]{6,30}@[0-9a-z]{3,15}([.][a-z]{2,15}){1,2}") ) {
                        check = true;
                        System.out.println("Invalid email! Format [abcde@address.asd(.dc)]");
                    }
                } while (check);
                String major;
                String semester;
                String uniName;
                do {
                    System.out.print("Enter the major: ");
                    major = scanner.nextLine();
                    check = false;
                    if (major.equals("")) break;
                    if (!major.matches("[a-zA-z]{2,30}")){
                        check = true;
                        System.out.println("Invalid major [char only min:2, max:30]");
                    }
                } while (check);
                do {
                    System.out.print("Enter the semester: ");
                    semester = scanner.nextLine();
                    check = false;
                    if (semester.equals("")) break;
                    if (!semester.matches("(Spring|Fall|Summer|Winter)[-]\\d{4}")){
                        check = true;
                        System.out.println("Invalid semester format [Spring|Fall|Summer|Winter-xxxx]");
                    }
                } while (check);
                do {
                    System.out.print("Enter the name of university: ");
                    uniName = scanner.nextLine();
                    check = false;
                    if (uniName.equals("")) break;
                    if (!uniName.matches("[a-zA-z]{1,40}")){
                        check = true;
                        System.out.println("Invalid name format char only min:1, max:40");
                    }
                } while (check);
                for (Candidate candidate:list){
                    if (candidate.getID().equals(iD) && candidate.getType() == type){
                        Internship internship = (Internship) candidate;
                        if (!major.equals("")) internship.setMajor(major);
                        if (!semester.equals("")) internship.setSemester(semester);
                        if (!uniName.equals("")) internship.setUniName(uniName);
                        if (!address.equals("")) internship.setAddress(address);
                        if (date!=0) internship.setDate(date);
                        if (!email.equals("")) internship.setEmail(email);
                        if (!name.equals(""))internship.setName(name);
                        if (!phoneNumber.equals(""))internship.setPhoneNumber(phoneNumber);
                        list.remove(candidate);
                        list.add(internship);
                    }
                }
            }
        }
    }

    public void updateFromFile() throws Exception{
        File file = new File("Manager.txt");
        if (!file.exists()){
            return;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        if (( line = br.readLine() ) != null) {
            if ( line.length() > 0 ) {
                if (line.equals("Experiencer")) {
                    while (!(line=br.readLine()).equals("Fresher")){
                        StringTokenizer stk =new StringTokenizer(line,";");
                        String iD = stk.nextToken();
                        String name = stk.nextToken();
                        int date =Integer.parseInt(stk.nextToken());
                        String address = stk.nextToken();
                        String phoneNumber = stk.nextToken();
                        String email = stk.nextToken();
                        int type = Integer.parseInt(stk.nextToken());
                        int expYear = Integer.parseInt(stk.nextToken());
                        String proSkill = stk.nextToken();
                        Experiencer experiencer = new Experiencer(iD, name, date, address, phoneNumber, email, type, expYear, proSkill);
                        list.add(experiencer);
                    }
                }
                if (line.equals("Fresher")){
                    while (!(line = br.readLine()).equals("Internship")){
                        StringTokenizer stk =new StringTokenizer(line,";");
                        String iD = stk.nextToken();
                        String name = stk.nextToken();
                        int date =Integer.parseInt(stk.nextToken());
                        String address = stk.nextToken();
                        String phoneNumber = stk.nextToken();
                        String email = stk.nextToken();
                        int type = Integer.parseInt(stk.nextToken());
                        int graDate = Integer.parseInt(stk.nextToken());
                        String graRank = stk.nextToken();
                        String education = stk.nextToken();
                        Fresher fresher = new Fresher(iD,name,date,address,phoneNumber,email,type,graDate,graRank,education);
                        list.add(fresher);
                    }
                }
                if (line.equals("Internship")){
                    while ((line = br.readLine())!=null){
                        if (line.length()>0){
                            StringTokenizer stk =new StringTokenizer(line,";");
                            String iD = stk.nextToken();
                            String name = stk.nextToken();
                            int date =Integer.parseInt(stk.nextToken());
                            String address = stk.nextToken();
                            String phoneNumber = stk.nextToken();
                            String email = stk.nextToken();
                            int type = Integer.parseInt(stk.nextToken());
                            String major = stk.nextToken();
                            String semester = stk.nextToken();
                            String uniName = stk.nextToken();
                            Internship internship = new Internship(iD,name,date,address,phoneNumber,email,type,major,semester,uniName);
                            list.add(internship);
                        }
                    }
                }
            }
        }
        br.close();
        fr.close();
    }

    public void saveToFile() throws Exception {
        String filename = "Manager.txt";
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter pw = new PrintWriter(file);
        pw.println("Experiencer");
        for (Candidate candidate:list){
            if (candidate.getType() == 0){
                Experiencer experiencer = (Experiencer) candidate;
                pw.println(experiencer);
            }
        }
        pw.println("Fresher");
        for (Candidate candidate:list){
            if (candidate.getType() == 1){
                Fresher fresher = (Fresher) candidate;
                pw.println(fresher);
            }
        }
        pw.println("Internship");
        for (Candidate candidate:list){
            if (candidate.getType() == 2){
                Internship internship = (Internship) candidate;
                pw.println(internship);
            }
        }
        pw.close();
    }
}
