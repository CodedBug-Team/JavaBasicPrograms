package practise;

public class StringManipulation {private void arrangeString(String string){
//hello
    String newString = string;
    for (int i = 0; i<string.length()-1; i++){
        if (string.charAt(i) == string.charAt(i+1)){
            if (i == string.length()-1) {

               // Log.d(TAG, "arrangeString: iffffff");
                newString = swap(string, i, string.length()-1);
            }else if(newString.charAt(0) == newString.charAt(i)){
                //Log.d(TAG, "arrangeString: else if");
                newString = swap(string, i+2, 0);
            }else{
               // Log.d(TAG, "arrangeString: else");
                newString = swap(string, i, 0);
            }
        }
    }
    System.out.println("String: "+newString);



   // Log.d(TAG, "arrangeString: "+newString);
}
    private String swap(String str, int i , int j){
        StringBuilder stringBuilder = new StringBuilder(str);
        char x = str.charAt(i);
        char y = str.charAt(j);
        stringBuilder.setCharAt(i, y);
        stringBuilder.setCharAt(j, x);
       // Log.d(TAG, "swap: "+stringBuilder);
        arrangeString(stringBuilder.toString());
        return stringBuilder.toString();
    }
    public static void main(String args[]){
        StringManipulation stringManipulation = new StringManipulation();
        stringManipulation.arrangeString("Hello navin");
    }

}
