import java.lang.reflect.Array;

public class StringCalculator {
    public int add(String string_number) throws Exception {
        var string_delimiter = ",";
        if (string_number.contains("//")){
            int index = string_number.indexOf("\n")+1;

            string_delimiter=string_number.substring(2,index-1);
            string_number = string_number.substring(index+1);
        }
        string_number = string_number.replace("\n",string_delimiter);
        if(string_number==""){
            return 0;
        }
        else if(string_number.length() == 1){
            return Integer.parseInt(string_number);
        }
        else{
            String[] string_arr = string_number.split(string_delimiter,0);
             int size = string_arr.length;
             int[] num_arr = new int [size];
             for(int i=0; i<size; i++){
                 if(string_arr[i]==""){
                     throw new Exception("invalid input");
                 }
                 num_arr[i] = Integer.parseInt(string_arr[i]);
                 if(num_arr[i]<0){
                     throw new Exception("negatives not allowed-"+string_arr[i]);
                 }
             }
             int sum = 0;
             for(int e:num_arr){
                 sum = sum+e;
             }

             return sum;
        }
    }
}
