package reviewwork1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        int confession = 18;
        int fullFenceLength = 5*62 + 3*12;

//        System.out.println("Минимальная длина забора для признания: " + fullFenceLength);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fenceLengthNum;

        try {
            String fenceLengthStr = reader.readLine();
            fenceLengthNum = Integer.parseInt(fenceLengthStr);;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(fenceLengthNum >= fullFenceLength){
            System.out.println("Надпись поместится на забор!");
        } else {
            System.out.println("Надпись непоместится на забор!");
        }


//        try() {
//            System.out.println("Введите длину забора:");
//            } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
    }

}
