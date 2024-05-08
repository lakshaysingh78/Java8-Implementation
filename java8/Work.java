//package JAVA8;//



public class Work {
    public static void main(String[] args) {
        System.out.println("my system start");
    // //    MyInter m2=new MyInterImpl();
    //     m2.sayHello();
    //     //second method
    //     MyInter m1=new MyInter()
    //     {
    //         public void sayHello(){
    //             System.out.println("this is first ");

    //         }

    //     };
    //    m1.sayHello();

    //using interface by lambda
    MyInter i=()->{
        System.out.println("this is first time im using lamda");

    };
    i.sayHello();

    SumInter sum=(int a,int b)->{
        return a+b;
    };
    System.out.println(sum.sum(2,6));
    SumInter sum1=( a, b)-> a+b;
    System.out.println(sum1.sum(4,5));
    LengthInter l1=str->str.length();
        
System.out.println(l1.getLength("lakshay chaudhary"));
   
    
    }

    
}
