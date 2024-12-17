package com.inheritance.question_4;

public class CommunicationChannel {
    private String account, activeStatus;

    public CommunicationChannel(String account, String activeStatus) {
        this.account = account;
        this.activeStatus = activeStatus;
    }

    public String getAccount() {
        return account;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void audio() {
        if (this.activeStatus.equals("active")) {
            System.out.println(this.account+" is active so Audio calling...");
        }else {
            System.out.println(this.account+" is offline so audio is not succeed");
        }
    }

    public void video() {
        if (this.activeStatus.equals("active")) {
            System.out.println(this.account+" is active so Video calling...");
        }else {
            System.out.println(this.account+" is not active so vide calling is not reachable");
        }
    }
}

class Instagram extends CommunicationChannel {
private String note;
    public Instagram(String account, String activeStatus) {
        super(account, activeStatus);
    }

    // Add note

    public void addNote(String note) {
        this.note = note;
        System.out.println("Note added: " + note);
    }
    public void deleteNote() {
        if (this.note != null) {
            System.out.println("Note deleted: " + this.note);
            this.note = null;
        } else {
            System.out.println("No note to delete.");
        }
    }
}

class Messenger extends CommunicationChannel {
    private String story;
    private int storyViewCount = 0;
    public Messenger(String account, String activeStatus) {
        super(account, activeStatus);
    }

    public void addStory(String story) {
        this.story = story;
        System.out.println("Story added: " + story);
    }
    public void removeStory() {
        if (this.story != null) {
            System.out.println("Story removed: " + this.story);
            this.story = null;
        } else {
            System.out.println("No story to remove.");
        }
    }

    // View story
    public void viewStory() {
        if (this.story != null) {
            storyViewCount++;
            System.out.println("Viewing story: " + this.story);
            System.out.println("Story view count: " + storyViewCount);
        } else {
            System.out.println("No story to view.");
        }
    }
}