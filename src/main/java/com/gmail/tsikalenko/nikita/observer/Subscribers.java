package com.gmail.tsikalenko.nikita.observer;


import com.gmail.tsikalenko.nikita.decorator.*;
import com.gmail.tsikalenko.nikita.strategyPacker.*;

import java.util.List;
import java.util.Scanner;

public class Subscribers implements Observer {
    private String login;
    private String mail;

    private Scanner scanner = new Scanner(System.in);

    public Subscribers(String login, String mail) {
        this.login = login;
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void handleEvent(List<String> list) {

        System.out.println("Dear, " + login + "! We have new fish: ");
        int i = 1;
        for (String fish : list) {
            System.out.println(i + ": " + fish);
            i++;
        }
        prepareFish();
        System.out.println("Thank you for using our services!)");
    }

    private void prepareFish() {
        System.out.println("Would you like buy smth?");
        String answ = scanner.nextLine();
        if (answ.toLowerCase().equals("yes") || answ.toLowerCase().equals("y")) {
            System.out.println("Chose a fish from list");
            int fish = scanner.nextInt();
        }
        System.out.println(new MaterFisherman(new ExperiencedFisherman(new NoviceFisherman())).makeJob());
        System.out.println("Chose a Package from list");
        int i = 1;
        for (Packages pckg : Packages.values()) {
            System.out.println(i + ": " + pckg);
            i++;
        }
        int pckg = scanner.nextInt();
        if (pckg == 1) {
            new Packer().setPackingTheFish(new PackInPresentBox());
        } else if (pckg == 2) {
            new Packer().setPackingTheFish(new PackInRedTransparentPackage());
        } else {
            new Packer().setPackingTheFish(new PackInRegularPackage());
        }
        System.out.println("Your good is ready! You can take it in shop!");
    }
}
