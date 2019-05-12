package com.xiaoju.builder;

public class ConcreteBuilder  implements Builder{

  private Product product;

  public ConcreteBuilder() {
    this.product = new Product();
  }

  @Override
  public void buildPart1(String part1) {
    product.setPart1(part1);
  }

  @Override
  public void buildPart2(String part2) {
    product.setPart2(part2);
  }

  @Override
  public Product build() {
    return product;
  }
}
