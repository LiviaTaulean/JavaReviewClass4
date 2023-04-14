package review4;

public class ArrayReview {
    public static void main(String[] args) {
        int i=10;
        int[]arr=new int[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;

        System.out.println(arr[2]);

        String[] planets={"Earth", "Mars", "Jupiter","Saturn","Neptune"};

        /*System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);*/

        for(int a=0; a< planets.length; a++){
            System.out.print(planets[a]+" ");
        }
    }
}
