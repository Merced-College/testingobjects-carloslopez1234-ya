// carlos lopez

        public class RabTest {
            public static void main(String[] args) {
                // Intentionally empty for now: no fields, no constructors, no methods.

                // A1: Create a Dog with no constructors defined.
                // Test 1
                Rabbit  Rabbit1 = new Rabbit();

                // A2: Print the object directly.
                System.out.println("Printing Rabbit1 directly:");
                System.out.println(Rabbit1);
                
                // test of data variables as public 
                    Rabbit R1 = new Rabbit();
            System.out.println("\nDefaults for d1 fields (before any assignment):");
            System.out.println("name = " + R1.getName());   // expected: null
            System.out.println("color = " + R1.getColor());     // expected: 0
            System.out.println("size  = " + R1.getSize()); // expected: null

           //A7 : Test the constructors in the default  - DV still public
            Rabbit R2 = new Rabbit(); //  uses default constructor values
            System.out.println("\nR2 after default constructor:");
            System.out.println("name = " +  R2.getName() + ", color = " + R2.getColor() + ",  size  = " + R2.getSize ());

            Rabbit R3= new Rabbit("Peter", "Gray", "small"); // uses parameterized constructor
            System.out.println("\nR3 after parameterized constructor:");
            System.out.println("name = " + R3.getName() + ", color = " + R3.getColor() + ", size = " + R3.getSize ());

            System.out.println("\nPrinting objects after overriding toString():");
            System.out.println("R2 = " + R2);
            System.out.println("R3 = " + R3);
            
                //  step 10
                    System.out.println("\nMutating public fields directly:");
            R3.setColor("Gray");//d3.age = 5;      // direct write
            R3.setName("Peter");//d3.name = "Max"; // direct write
            System.out.println("After mutation, R3 = " + R3); // uses toString()

            System.out.println("\nMutating via setters after making fields private:");
            R3.setColor("Gray");
            R3.setName("Peter");
            R3.setSize("small");
            System.out.println("R3 size via getter = " + R3.getColor());
            System.out.println("R3 now = " + R3);
                                        
                

            } // end class
        } // end class

