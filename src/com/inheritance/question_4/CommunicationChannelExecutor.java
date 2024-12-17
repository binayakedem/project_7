package com.inheritance.question_4;

public class CommunicationChannelExecutor {
    public static void main(String[] args) {
        System.out.println("=== Instagram Example ===");
        CommunicationChannelIOI communicationChannelIOI=new CommunicationChannelIOI();

//        creating the objec
        CommunicationChannel communicationChannel=communicationChannelIOI.inputChannel();
        Instagram instagram=new Instagram(communicationChannel.getAccount(),communicationChannel.getActiveStatus());
          communicationChannel.audio();
          communicationChannel.video();
          communicationChannelIOI.inputNote(instagram);
          instagram.deleteNote();


//          for messagnet
        System.out.println("=== Messanger=== ");
        CommunicationChannel communicationChannel1=communicationChannelIOI.inputChannel();
        Messenger messenger=new Messenger(communicationChannel1.getAccount(),communicationChannel1.getActiveStatus());
        messenger.video();
        messenger.audio();
        communicationChannelIOI.inputStory(messenger);
        messenger.removeStory();
    }
}
