import java.util.Scanner;

public class homework2x5 {
    public static void main(String[] args) {
        char[] charArray= {'-','-','-','-','-','-','-','-','-'};
        boolean winner=false;
        do{
            System.out.println("Your turn, X");
            winner=placeSymbolOnBoard(charArray,'X');
            System.out.println("Your turn, 0");
            winner=placeSymbolOnBoard(charArray,'0');
        }
        while(!winner);
        //printBoard(charArray);
        //System.out.println(isAvailable(charArray,num));
        //getPositionFromUser(charArray);
        //System.out.println(checkWinner(charArray));
        //System.out.println(placeSymbolOnBoard(charArray,'X'));



    }
    public static void printBoard(char[] charArray){
        System.out.print(charArray[0]+" "+charArray[1]+" "+charArray[2]+"\n" +
                charArray[3]+" "+charArray[4]+" "+charArray[5]+"\n" +
                charArray[6]+" "+charArray[7]+" "+charArray[8]);
    }
    public static boolean isAvailable(char[] charArray, int position){
        boolean answer=false;
            if(charArray[position-1]=='X'||charArray[position-1]=='0'){
                answer=false;
            }
            else{
                answer=true;
            }
        return answer;
    }
    public static int getPositionFromUser(char[] charArray){
        Scanner scanner=new Scanner(System.in);
        int position=0;
        boolean check=false;
        do{
            System.out.println("Enter your position");
            position=scanner.nextInt();
            if(position>=1&&position<=9){
                check=isAvailable(charArray,position);
                if(!check){
                    System.out.println("occuped place ,please enter again");
                }
            }
            else{
                System.out.println("illegal selection,please enter again");
            }
        }
        while(position<1||position>9||!check);
        return position;
    }
    public static char checkWinner(char[] charArray){
        char ch='-';
        if(charArray[0]==charArray[1]&&charArray[1]==charArray[2]){
            ch=charArray[0];}
        if(charArray[3]==charArray[4]&&charArray[4]==charArray[5]){
            ch=charArray[3];}
        if(charArray[6]==charArray[7]&&charArray[7]==charArray[8]){
            ch=charArray[6];}
        if(charArray[0]==charArray[3]&&charArray[3]==charArray[6]){
            ch=charArray[0];}
        if(charArray[1]==charArray[4]&&charArray[4]==charArray[7]){
            ch=charArray[1];}
        if(charArray[2]==charArray[5]&&charArray[5]==charArray[8]){
            ch=charArray[2];}
        if(charArray[0]==charArray[4]&&charArray[4]==charArray[8]){
            ch=charArray[0];}
        if(charArray[2]==charArray[4]&&charArray[4]==charArray[6]){
            ch=charArray[2];}
        return ch;
    }
    public static boolean placeSymbolOnBoard(char[] charArray,char player){
        char winner;
        int position;
        boolean answer=false;
        position=getPositionFromUser(charArray);
        charArray[position-1]=player;
        printBoard(charArray);
        System.out.println();
        winner=checkWinner(charArray);
        if(winner!='-'){
            System.out.println("We have a winner: "+winner);
            answer=true;
        }
        else{
            System.out.println("We dont have a winner");
            answer=false;
        }
        return answer;
    }
}
