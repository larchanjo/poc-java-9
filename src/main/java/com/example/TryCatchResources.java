package com.example;

public class TryCatchResources {

  public static class MyResource implements AutoCloseable {

    private final int javaVersion;

    public MyResource(int javaVersion) {
      this.javaVersion = javaVersion;
    }

    public void process() {
      System.out.println("Executing " + javaVersion);
    }

    @Override
    public void close() throws Exception {
      System.out.println("Closing...." +  javaVersion);
      throw new RuntimeException("Suppressing exception");
    }

  }

  public static void main(String[] args) {
    jdk7();
    jdk9();
  }

  private static void jdk7() {
    try (MyResource myResource = new MyResource(7)) {
      myResource.process();
    } catch (Exception e) {
      System.out.println("Handling exception..." + e.toString() + "\n");
    }
  }

  private static void jdk9() {
    MyResource myResource1 = new MyResource(9);
    try (myResource1) {
      myResource1.process();
    } catch (Exception e) {
      System.out.println("Handling exception..." + e.toString() + "\n");
    }

    // Multiple resources
    MyResource myResource2 = new MyResource(10);
    MyResource myResource3 = new MyResource(11);

    try (myResource1; myResource2; myResource3) {
      myResource1.process();
      myResource2.process();
      myResource3.process();
    } catch (Exception e) {
      System.out.println("Handling exception..." + e.toString() + "\n");
    }
  }

}
