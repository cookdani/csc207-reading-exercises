public class Student{
    private String firstName;
    private String lastName;
    private int id;
    private int age;

    public Student (String firstName, String lastName, int id, int age){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.id        = id;
        this.age       = age;
    }
/**
 *Gets the value of the firstName.
 *@return this.firstName, the first name of the student
 */
    public String getFirstName(){
        return this.firstName;
    }
/**
 *Gets the value of the lastName.
 *@return this.lastName, the last name of the student
 */   
    public String getLastName(){
        return this.lastName;
    }
/**
 *Gets the value of the id.
 *@return this.id, the id of the student
 */
    public int getId(){
        return this.id;
    }
/**
 *Gets the value of age.
 *@return this.age, the age of the student
 */
    public int getAge(){
        return this.age;
    }
/**
 *Sets the value of firstName.
 *@param firstName, a string containing the first name of the student
 */    
    public void SetFirstName(String firstName){
        this.firstName = firstName;
    }
/**
 *Sets the value of lastName.
 *@param lastName, a string containing the last name of the student
 */     
    public void SetLastName(String lastName){
        this.lastName = lastName;
    }
/**
 *Sets the value of id.
 *@param id, a non-negative int containing the id of the student
 */ 
    public void SetId(int id){
        if (id >= 0)
            this.id = id;
        else
            System.out.printf("Value must be non-negative\n");
    }
/**
 *Sets the value of age.
 *@param age, a non-negative int containing the age of the student
 */ 
    public void SetAge(int age){
        if (age >=0)
            this.age = age;
        else
            System.out.printf("Value must be non-negative\n");
    }
    public static void main(String[] args){
        Student Daniel = new Student("Daniel","Cook",8696,19);
        System.out.printf("Id = %d\n", Daniel.getId());
        Daniel.SetId(-9999);
        System.out.printf("New Id = %d\n", Daniel.getId());
    }
        
                                          
}

            

   
                                 
