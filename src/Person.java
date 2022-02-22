 class Person {
    private static String name;
        public Person(String name){
            Person.name =name;
            System.out.println(Person.name+" is constructed!");
        }

     public static void main(String[] args) {
         Person alex = new Person("alex");
         System.out.println("this persons name is: "+alex.getName());
         alex.sayHello();
         alex.setName("Albert");
         alex.sayHello();
     }
        public String getName(){
            return Person.name;
//DONE: return the person's name
        }

        public void setName(String name){
            Person.name= name;
//DONE: change the name field to the passed value
        }
        public void sayHello(){
//DONE: print a message to the console using the person's name
            System.out.println("hello! my name is " + Person.name);
        }
    }

