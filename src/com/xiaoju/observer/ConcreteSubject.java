package com.xiaoju.observer;

public class ConcreteSubject extends Subject {

  private String state;

  public void change(String state){
    this.state=state;
    notifyObservers();
  }


}
