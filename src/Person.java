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

         /*Person person1 = new Person("John");
         Person person2 = new Person("John");
         System.out.println(person1.getName().equals(person2.getName())); // john is john true
         System.out.println(person1 == person2);                            // person1 john is not person2 john though
*/
         /*Person person1 = new Person("John");
         Person person2 = person1;
         System.out.println(person1 == person2);*/

         /*Person person1 = new Person("John");
         Person person2 = person1;
         System.out.println(person1.getName());
         System.out.println(person2.getName());
         person2.setName("Jane");                   // Surprised to see that setting person 2 changes both names.
         System.out.println(person1.getName());
         System.out.println(person2.getName());
         */

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

