package com.tlglearning;

import com.sun.security.jgss.GSSUtil;

public class Main {

  public static void main(String[] args) {
    try (Resource res = new Resource()) {
      System.out.println("start trying");
      res.process();
      System.out.println("stop trying");
    }catch (RuntimeException e){
      System.out.println("caught runtimeexception");
    } catch (Exception e) {
      System.out.println("Caught Exception");
      throw new RuntimeException(e);
    } finally {
      System.out.println("Finally");
    }

  }
}
