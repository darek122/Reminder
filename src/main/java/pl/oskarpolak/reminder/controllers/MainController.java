package pl.oskarpolak.reminder.controllers;

import pl.oskarpolak.reminder.models.UserInstance;
import pl.oskarpolak.reminder.views.MainView;

public class MainController {
    UserInstance userInstance = UserInstance.getInstance();
    MainView mainView;

    public MainController() {
        mainView = new MainView();
    }

    public void start() {
        mainView.showMainMenu(userInstance.getUsername());

    }


   
}
