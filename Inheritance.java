import java.util.*;

class Basic{
    String name;
    int age;
    Basic(String n, int a ){
        name=n;
        age=a;
    }
}


class Kerala extends Basic
{
    String state,country;

    Kerala(String n,int a ) 
    {
        super(n,a);
        state="Kerala";
        country="India";
    }
    
    void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nState :"+state+"\nCountry : "+country);
    }
    
} 
class Other extends Basic
{
    String state,country;
    Other(String n,int a,String s,String c){
        super(n,a);
        state=s;
        country=c;
    }
        void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nState :"+state+"\nCountry : "+country);
    }
    
     
} 
 
class Inheritance 
{
    public static void main(String args[]) 
    {
        int age,choice;
        String name;
        String country,state;
        Scanner sc=new Scanner(System.in);
        System.out.println("Name?");
        name=sc.nextLine();
        System.out.println("Age?");
        age=sc.nextInt();

        System.out.println(" State : Kerala ?(1) or Other ?(2)");
        choice=sc.nextInt();
        if(choice==1) 
        {
  
            Kerala s=new Kerala(name,age);
            s.display();
        }
        if(choice==2) 
        {
        sc.nextLine();
            System.out.println("Country?");
            country=sc.nextLine();
            System.out.println("State?");
            state=sc.nextLine();

            Other s=new Other(name,age,state,country);
            s.display();
        }
    }
}

