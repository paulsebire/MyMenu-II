package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
     switch(nbMenu) {
         case 1: System.out.println("Vous avez choisi comme menu : poulet");
         break;
         case 2: System.out.println("Vous avez choisi comme menu : boeuf");
         break;
         case 3: System.out.println("Vous avez choisi comme menu : végétarien");
         break;
         default: System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");

     }
    }
    /**
    * run asking process for a menu
     */
    public void runMenu() {
        this.displayAvailableMenu();
        int nbMenu;
        do {
            nbMenu = sc.nextInt();
            this.displaySelectedMenu(nbMenu);
            switch (nbMenu) {
                case 1:
                    askSide(true);
                    askDrink();
                    break;
                case 2:
                    askSide(true);
                    break;
                case 3:
                    askSide(false);
                    askDrink();
                    break;

            }
        }while (nbMenu<1 || nbMenu >3);
    }

    /**
     * run asking process  for several menus
     */
    public void runMenus(){
        System.out.println("Combien souhaitez vous commander de menu ?");
        int menuQuantity = sc.nextInt();
        int counter = 0;
        for (int i =0; i < menuQuantity;i++) {
            this.runMenu();
        }
}
    /**
     * display a selected side depending on alll sides enable or not.
     * all sides = vegetables, fries and rice
     * not all sides  =  rice or not
     * @param nbSide the selected side
     * @param allsidesEnable enable display for all sides or not
     */
    public void displaySelectedSide(int nbSide, boolean allsidesEnable) {
        if (allsidesEnable == true){
            switch (nbSide){
                case  1:
                    System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : frites");
                    break;
                case 3:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        }else {
            switch (nbSide){
                case  1:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }

        }
    }

    /**
     * display a selected drink
     * @param nbDrink
     */
    public void displaySelectedDrink(int nbDrink) {
switch (nbDrink){
    case 1:
        System.out.println("Vous avez choisi comme boisson : eau plate");
        break;
    case 2:
        System.out.println("Vous avez choisi comme boisson : eau gazeuse");
        break;
    case 3:
        System.out.println("Vous avez choisi comme boisson : soda");
        break;
    default:
        System.out.println("Vous n'avez pas choisi de boisson parmi les choix proposés");
        break;
}

    }
    /**
     * Display all available sides depending on all sides enable or not.
     * All sides = vegetables, frites and rice
     * No all sides = rice or not
     * @param allSideEnable enable display for all side or not
     */
    public void displayAvailableSide(boolean allSideEnable) {
        System.out.println("Choix accompagnement");
        if (allSideEnable) {
            System.out.println("1 - légumes frais");
            System.out.println("2 - frites");
            System.out.println("3 - riz");
        } else {
            System.out.println("1 - riz");
            System.out.println("2 - pas de riz");
        }
        System.out.println("Que souhaitez-vous comme accompagnement ?");
    }

    /**
     * Display all available drinks in the restaurant
     */
    public void displayAvailableDrink() {
        System.out.println("Choix boisson");
        System.out.println("1 - eau plate");
        System.out.println("2 - eau gazeuse");
        System.out.println("3 - soda");
        System.out.println("Que souhaitez-vous comme boisson ?");
    }


    /**
     * Display a question about menu in the standard input, get response and display it
     */
    public void askMenu() {
        String[] menus = {"poulet", "boeuf", "végétarien"};
        askSomething("menu", menus);
    }
    /**
     * Display a question about side in the standard input, get response and display it
     */
    public void askSide(boolean allSidesEnable) {
        if (allSidesEnable) {
            String[] responsesAllSide = {"légumes frais", "frites", "riz"};
            askSomething("accompagnement", responsesAllSide);
        } else {
            String[] responsesOnlyRice = {"riz", "pas de riz"};
            askSomething("accompagnement", responsesOnlyRice);
        }
    }
    /**
     * Display a question about drink in the standard input, get response and display it
     */
    public void askDrink() {
        String[] responsesDrink = {"eau plate", "eau gazeuse", "soda"};
        askSomething("boisson", responsesDrink);
    }
}