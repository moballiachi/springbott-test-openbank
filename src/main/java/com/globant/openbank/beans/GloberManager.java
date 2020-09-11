package com.globant.openbank.beans;

import java.util.ArrayList;
import java.util.List;

public class GloberManager {


    private List<IMessage> messages;

    //Singleton pattern design
    private static GloberManager manager = null;
    
    private GloberManager(){
        messages = new ArrayList<IMessage>();
    }
    
    public static GloberManager getInstance() {
        if(manager == null) {
            manager = new GloberManager();
            return manager;
        }
        else {
            return manager;
        }
    }
    
    public static void add(String message) {
        GloberManager.add(message);
    }

    public String getMessage(int index) {
        return messages.get(index).get();
    }

    public List<IMessage> getMessages() {
        //Necesary to keeping inmutable value
        return  new ArrayList<IMessage>(messages);
    }
}