package practise1.forStream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
    static Scanner giveInput = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> allNames = new ArrayList<>();
        System.out.print("Enter No: ");
        int noOfItems = giveInput.nextInt();

        for (int i = 1; i <= noOfItems; i++){
            System.out.print("Enter "+i+" name: ");
            allNames.add(giveInput.next());
        }
        System.out.println("You entered : "+allNames);
        mainProgram(allNames);


    }
    public static void mainProgram(ArrayList<String> arrayList){
        System.out.print("1. Search name\n" +
                "2. Get count of all names\n" +
                "3. Sort Alphabet manner\n" +
                "4. Change Letter Case\n" +
                "Which case you want to test: ");
        int enter = giveInput.nextInt();
        switch (enter){
            case 1 : searching(arrayList);break;
            case 2 : counting(arrayList);break;
            case 3 : sorting(arrayList);break;
            case 4 : changingLetterCase(arrayList);break;
        }
        System.out.print("Do you want to continue Y/N : ");
        String a = giveInput.next().toUpperCase();
        continuing(a, arrayList);
    }

    public static void continuing(String ch, ArrayList<String> arrayList){

        switch (ch){
            case "N" : System.exit(0);break;
            case "Y" : mainProgram(arrayList);break;
        }

    }

    public static void sorting(ArrayList<String> arrayList){
        ArrayList<String> sortedList = new ArrayList<>();
        sortedList.addAll(arrayList.stream().sorted().collect(Collectors.toList()));
        System.out.println(sortedList);
    }

    public static void searching(ArrayList<String> arrayList){
        ArrayList<String> specificNames = new ArrayList<>();
        long itemCount1, itemCount2;
        System.out.print("Enter word you are looking for: ");
        String ch = giveInput.next();
        arrayList.forEach(item-> {
                    if (item.contains(ch)) specificNames.add(item);
                });
        itemCount1 = arrayList.stream().count();
        itemCount2 = specificNames.stream().count();
        System.out.println("Only "+ itemCount2+" items found out of "+itemCount1);
        System.out.println(specificNames);
    }

    public static void counting(ArrayList<String> arrayList){
        ArrayList<Integer> nameCounts = new ArrayList<>();
        arrayList.forEach(item->nameCounts.add(item.length()));
        System.out.println(nameCounts);
    }

    public static void changingLetterCase(ArrayList<String> arrayList){
        System.out.println("Enter Any letter");
        String ch = giveInput.next();
        arrayList.stream()
                .filter(item-> item.contains(ch))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
