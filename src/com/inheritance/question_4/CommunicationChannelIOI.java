package com.inheritance.question_4;

import java.util.Scanner;

public class CommunicationChannelIOI {
    Scanner sc=new Scanner(System.in);
    public CommunicationChannel inputChannel(){
        String account,active;
        System.out.println("Ënter the acount:");
        account=sc.nextLine();
        System.out.println("Enter the status:");
        active=sc.nextLine();
        return new CommunicationChannel(account,active);
    }
    public void inputNote(Instagram instagram){
        String note;
        System.out.println("Enter the note");
        note=sc.nextLine();
        instagram.addNote(note);
    }
    public void inputStory(Messenger messenger){
        String story;
        System.out.println("Write the story:");
        story=sc.nextLine();
        messenger.addStory(story);
    }
}
