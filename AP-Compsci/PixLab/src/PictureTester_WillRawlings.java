/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester_WillRawlings
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture_WillRawlings beach = new Picture_WillRawlings("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture_WillRawlings caterpillar = new Picture_WillRawlings("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture_WillRawlings temple = new Picture_WillRawlings("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture_WillRawlings canvas = new Picture_WillRawlings("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture_WillRawlings swan = new Picture_WillRawlings("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture_WillRawlings beach = new Picture_WillRawlings("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture_WillRawlings beach = new Picture_WillRawlings("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayScale()
  {
    Picture_WillRawlings beach = new Picture_WillRawlings("beach.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture_WillRawlings water = new Picture_WillRawlings("water.jpg");
	    water.explore();
	    water.fixUnderwater();
	    water.negate();
	    water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture_WillRawlings caterpillar = new Picture_WillRawlings("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture_WillRawlings caterpillar = new Picture_WillRawlings("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture_WillRawlings caterpillar = new Picture_WillRawlings("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontalBotToTop();
	    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture_WillRawlings hall = new Picture_WillRawlings("femaleLionAndHall.jpg");
	   hall.explore();
	   hall.mirrorDiagonal();
	   hall.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture_WillRawlings man = new Picture_WillRawlings("snowman.jpg");
	   man.explore();
	   man.mirrorArms();
	   man.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture_WillRawlings gull = new Picture_WillRawlings("seagull.jpg");
	   gull.explore();
	   gull.mirrorGull();
	   gull.explore();
  }
 
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   // testZeroBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   // testFixUnderwater();
   // testMirrorVertical();
   testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  // testKeepOnlyBlue();
	  //testNegate();
	  //testGrayScale();
	// testMirrorVerticalRightToLeft();
	 // testMirrorHorizontal();
	 //testMirrorHorizontalBotToTop();
	 // testMirrorDiagonal();
	  
	  
  }
}