public class ContinueExample {
    public static void main(String[]args){
        System.out.println("Numbers 1-10");
        for (int i =;i<=10;i++) {
            if(i==5)
            continue;//Skip remaining code in loop when i is 5
        System.out.orintln(i+"\t"); 
        System.out.println("Skip printing 5");
        }
    }
}
