import java.lang.reflect.Array;

public class StringCalculator {
    public int add(String string_number) throws Exception {
        string_number = string_number.replace("\n",",");
        if(string_number==""){
            return 0;
        }
        else if(string_number.length() == 1){
            return Integer.parseInt(string_number);
        }
        else{
            String[] string_arr = string_number.split(",",0);
             int size = string_arr.length;
             int[] num_arr = new int [size];
             for(int i=0; i<size; i++){
                 if(string_arr[i]==""){
                     throw new Exception("invalid input");
                 }
                 num_arr[i] = Integer.parseInt(string_arr[i]);
             }
             int sum = 0;
             for(int e:num_arr){
                 sum = sum+e;
             }

             return sum;
        }
    }
}
