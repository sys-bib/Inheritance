public class mySuperClass {
    String superStr =  "super class string";
    String commonStr = "super common string";

    public mySuperClass(String constructorStr){
        System.out.println("super class constructor");
        System.out.println(constructorStr);
    }

    public void superClassMethod(){
        System.out.println("super class method");
    }

    public void commonMethod(){
        System.out.println("super common method");
    }
}
