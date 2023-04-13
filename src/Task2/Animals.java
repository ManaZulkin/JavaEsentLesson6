package Task2;

public enum Animals {
    LION(5), HORSE(4), MOUSE(1), ZEBRA(3), MONKEY(8);

    int age;
   Animals(int age){
       this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return super.toString() +" is " + this.age + " years old " ;
    }
}
