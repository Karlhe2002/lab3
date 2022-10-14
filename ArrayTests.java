import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 , 2 , 4 , 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 2, 3 }, input1);
	}

  @Test
  public void testAverage1(){
    double[] input1 = { 3.0 , 2 , 4.0 , 5.0};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1),0);
  }

  @Test
  public void testAverage2(){
    double[] input1 = {1.1, 1.1, 2,3, 4};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input1),0);
  }


}
