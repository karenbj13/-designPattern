package com.xiaoju.template;

public abstract class AbstractTemplate {

  public void templateMethod() {
    System.out.println("Before");
    abstractMethod();
    System.out.println("After");
  }

  public abstract void abstractMethod();

}
