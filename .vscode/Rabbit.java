        //carlos lopez
        // 1/27/26
                
                public class Rabbit {
                    //data variables 
                    // make variables private 
                    private String name;
                    private String color;
                    private String size ;

                // constructors 
                public Rabbit() {            // default constructor
                    name = "Peter";
                    color = "Gray";
                    size = "small";
                }

                public Rabbit(String name, String color, String breed) { // parameterized constructor
                    this.name = name;
                    this.color = color;
                    this.size = breed;
                }

                public String getName() { 
                    return name; 
                }
                public void setName(String name)
                 { this.name = name; }

                public String getColor() {
                     return color; 
                    }
               // public void setAge( String color) { 
                // simple guard (optional)
               // if (color >= 0) this.color = color; 
        

                public String getSize() { 
                    return size ; 
                }
                public void setBreed(String breed) {
                     this.size = breed; 
                    }

                    @Override
            public String toString() {
                return "Rabbit{name='" + name + "', color= " +  color + ", ='" + size + "'}";
            }

              public void setColor(String string) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'setColor'");
                    }

                    public void setSize(String string) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'setSize'");
                    }
                        
                    }



