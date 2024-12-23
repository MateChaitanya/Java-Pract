import java.util.*;
public class Hashmap{
    public static void main(String[] args) {
        String input = "Programmingp";
        input = input.toLowerCase();
        
        //Hashmap Created 
        HashMap<Character,Integer>charCountMap = new HashMap<>();

        for(char c : input.toCharArray()){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+ 1);

            }else{
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Repeated char and their counts:");
        for(HashMap.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+": " + entry.getValue());
            }
        }

    }
}