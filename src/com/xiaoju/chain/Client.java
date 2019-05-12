package com.xiaoju.chain;

public class Client {

  public static void main(String[] args){
    Handler handler1=new ConcreteHandlerA(1);
    Handler handler2=new ConcreteHandlerB(2);
    handler1.setNextHandler(handler2);
    handler1.handleMessage(3,"hello world");
  }
}
