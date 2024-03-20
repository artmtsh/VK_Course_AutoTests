import SimpleClass.SimpleClass;
import org.junit.Assert;
import org.junit.Test;

public class Main {
  @Test
  public void main() {
    System.out.println("Hello world!");
    SimpleClass example = new SimpleClass();
    Assert.assertTrue(example.getStatus());
  }
}