package com.tlglearning;

public class Resource implements AutoCloseable{
  //was red initially b/c inheriting an abstract method;
  //either have to make this method abstract too or
  //override the abstract method


  public Resource() {
    System.out.println("resource ctor");
    throw new RuntimeException();
  }

  @Override
  public void close() throws Exception {
    System.out.println("Resource.close()");
    throw new Exception();
  }


  public void process(){
    System.out.println("Resource.process()");
//    throw new RuntimeException();
  }
}
