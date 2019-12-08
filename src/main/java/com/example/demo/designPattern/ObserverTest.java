package com.example.demo.designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * http://blog.didispace.com/spring-design-partern-3/
 *观察者模式
 */
public class ObserverTest {

    public static void main(String[] args) {
        Observer pageOpener = new PageOpener();
        Observer register = new Register();
        Button btn = new Button();
        btn.addListener(pageOpener);
        btn.addListener(register);
        btn.clickOn();
        System.out.println( btn.wasClicked());
        System.out.println( pageOpener.wasInformed());
        System.out.println( register.wasInformed());
//        assertTrue("Button should be clicked but it wasn't",
//                btn.wasClicked());
//        assertTrue("Page opener should be informed about click but it wasn't",
//                pageOpener.wasInformed());
//        assertTrue("Register should be informed about click but it wasn't",
//                register.wasInformed());
    }

}

class Button {

    private boolean clicked;
    private List<Observer> listeners;

    public List<Observer> getListeners() {
        if (this.listeners == null) {
            this.listeners = new ArrayList<Observer>();
        }
        return this.listeners;
    }

    public void addListener(Observer observer) {
        getListeners().add(observer);
    }

    public boolean wasClicked() {
        return this.clicked;
    }

    public void clickOn() {
        this.clicked = true;
        informAll();
    }

    private void informAll() {
        for (Observer observer : getListeners()) {
            observer.informAboutEvent();
        }
    }

}

abstract class Observer {
    protected boolean informed;

    public void informAboutEvent() {
        this.informed = true;
    }

    public boolean wasInformed() {
        return this.informed;
    }
}

class PageOpener extends Observer {

    @Override
    public void informAboutEvent() {
        System.out.println("Preparing download of new page");
        super.informAboutEvent();
    }

}

class Register extends Observer {

    @Override
    public void informAboutEvent() {
        System.out.println("Adding the action to register");
        super.informAboutEvent();
    }
}
