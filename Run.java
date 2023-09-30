// import java.util.Scanner;
// class Run{
//     String name;
//     double distance;
//     int i=0;
    
//     Run(String name,double distance){
//         this.name=name;
//         this.distance= distance;
//     }
//     void Get(){
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter your name: ");
//         name = input.nextLine();
//         System.out.println("Enter your distance: ");
//         distance = input.nextDouble();

//         i++;
//     }
//     void show(){
//         if(i<6){
//             System.out.println("This is player " + i + " name"   + name);
//             System.out.println("This is the player " + i +" distance" + distance);
//         }
//     }

// }
// class Demo{
//     public static void main(String []args){
//     Run r1 = new Run(null, 0);
//     for(int player=1;player <=5; player++){
//          r1.Get();
//          r1.show();
//     }
//     }
// }
import java.util.Scanner;
class Run{
    String name;
    double distance;
    int i=0;
    static Run highestDistanceRun; 
    
    Run(String name,double distance){
        this.name=name;
        this.distance= distance;
    }
    void Get(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your distance: ");
        distance = input.nextDouble();

        if (highestDistanceRun == null || distance > highestDistanceRun.distance) {
            highestDistanceRun = this;
        }

        i++;
    }
    void show(){
        if(i<6){
            System.out.println("This is player " + i + " name"   + name);
            System.out.println("This is the player " + i +" distance" + distance);
        }
    }
}
class Demo{
    public static void main(String []args){
    Run r1 = new Run(null, 0);
    for(int player=1;player <=5; player++){
         r1.Get();
        r1.show();
    }
    
    }
}



