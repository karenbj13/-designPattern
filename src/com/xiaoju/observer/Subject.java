package com.xiaoju.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  private List<Observer> list = new ArrayList<>();

  public void attact(Observer observer) {
    list.add(observer);
  }

  public void detach(Observer observer) {
    list.remove(observer);
  }

  protected void notifyObservers() {
    list.forEach(observer -> {
      observer.update(this);
    });
  }
}
