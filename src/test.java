import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int number=34512;
        int target=12345;
        ispermutataion(number,target);

    }

    public static int turn(int number) { //
        int counter = 0; //
        String temp = ""; //
        int answer = 0; //
        int tempNumber=number; //אם מתעלמים מאיפוס number
        while (tempNumber != 0) { //אם מתעלמים מאיפוס number
            counter++; //אם מתעלמים מאיפוס number
            tempNumber = tempNumber / 10; //אם מתעלמים מאיפוס number
        }
        int[] array = new int[counter]; //
        for (int i = 0; i < array.length; i++) { //
            array[array.length - 1 - i] = number % 10; //
            number=number/10; //
        }
        int[] tempArray=new int[array.length]; // שחכתי להגדיר גודל מערך בנפרד
        tempArray[0]=array[array.length - 1]; //
        for (int i = 1; i < array.length; i++) { // עשיתי עד Length-1 במקום עד length
            tempArray[i] = array[i-1]; // עשיתי פלוס במקום מינוס
        }
        for(int i=0;i<tempArray.length;i++){ // עשיתי arrayTostring במקום קליטה דרך לולאה
            temp+=tempArray[i];
        }
        answer = Integer.parseInt(temp);
        return answer;
    }
    public static boolean ispermutataion(int source,int target){
        boolean answer=false;
        int counter=0;
        int tempTarget=target;
        while(tempTarget!=0){
            counter++;
            tempTarget=tempTarget/10;
        }
        for(int i=0;i<counter;i++){
            source=turn(source);
            if(source==target){
                answer=true;
                break;
            }
        }
        return answer;
    }
}
