package com.xiaoju.chain;

public abstract class Handler {

  private Handler nextHandler;

  protected int level;

  public void setNextHandler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handleMessage(int level, String message) {
    if (this.level <= level) {
      this.report(message);
    }
    if (this.nextHandler != null) {
      nextHandler.report(message);
    } else {

    }

  }

  public abstract void report(String message);
}
