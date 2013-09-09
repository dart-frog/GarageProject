public class VehicleTest { 
    @Test
     public void yearConstructor() { 
        int expectedYear = 2013; 
        Vehicle crashDummy = new Vehicle(expectedYear); 
      assertEquals( "year constructor", 2013, crashDummy.getYear() ); 
     } 
       
     @Test
     public void modelConstructor() { 
      String expectedModel = "pilot"; 
      Vehicle crashDummy = new Vehicle (expectedModel); 
      assertEquals( "speed constructor", "pilot", crashDummy.getMake() ); 
     } 
       
     @Test
     public void radiusConstructor() { 
         int expectedRadius = 360; 
         Vehicle crashDummy = new Vehicle (expectedRadius); 
         assertEquals( "radius constructor", 360, crashDummy.getYear() ); 
     } 
       
     @Test
     public void makeConstructor(){ 
         String expectedMake = "Honda"; 
         Vehicle crashDummy = new Vehicle (expectedMake); 
         assertEquals( "make constructor", "Honda", crashDummy.getMake() ); 
     } 
     @Test
     public void rangeConstructor(){ 
         int expectedRange = 50; 
         Vehicle crashDummy = new Vehicle (expectedRange); 
         assertEquals( "range constructor", 50 , crashDummy.getRange() ); 
     } 
       
     @Test 
     public void allOfThem(){ 
         int expectedRange = 50; 
         String expectedMake = "Honda"; 
         int expectedRadius = 360; 
         String expectedModel = "pilot"; 
         int expectedYear = 2013; 
         Vehicle crashDummy = new Vehicle (expectedRange, expectedMake, expectedRadius, expectedModel, expectedYear); 
         assertEquals( "renge constructor", 50 , crashDummy.getRange() ); 
         assertEquals( "make constructor", "Honda", crashDummy.getMake() ); 
         assertEquals( "radius constructor", 360, crashDummy.getRadius() ); 
         assertEquals( "model constructor", "pilot", crashDummy.getModel() ); 
         assertEquals( "year constructor", 2013, crashDummy.getYear() ); 
     } 
  
  
  
} 