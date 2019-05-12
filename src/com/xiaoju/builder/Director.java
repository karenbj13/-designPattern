package com.xiaoju.builder;

public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public Product createProduct(){
    String part1="";
    String part2="";
    builder.buildPart1(part1);
    builder.buildPart2(part2);
    return builder.build();
  }
}
