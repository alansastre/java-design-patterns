package com.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Telegram implements ChatMediator{

    List<AbstractUser> users;

    public Telegram(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, AbstractUser user) {

        for (AbstractUser currentUser: users) {
            if (currentUser != user) // comprobaciones para no enviarse a si mismos
                currentUser.receive(message);
        }
    }

    @Override
    public void addUser(AbstractUser user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(AbstractUser user) {
        this.users.remove(user);
    }
}
