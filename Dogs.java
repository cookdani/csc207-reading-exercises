public class Dogs{
    public String breed;
    public String color;
    public int age;
    public Dogs (String breed, String color, int age){
        this.breed = breed;
        this.color = color;
        this.age   = age;
    }
    public void speak(){
        System.out.printf("I am a %d year old %s %s\n", this.age, this.color, this.breed);
    }
    public static void main(String[] args){
        Dogs dog = new Dogs("poodle", "white", 6);
        dog.speak();
    }
}

                      
