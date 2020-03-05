package practise;

public class Examplle5 {
    public static void main(String args[]) {
        String s = "abaaa";
        Examplle5 s2 = new Examplle5();

        s2.stringManipulate(s);
        // "a","b","a","a","c"};


        // int i = 0;


    }

    public void stringManipulate(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    if (s.charAt(0) == s.charAt(i)) {
                        System.out.println(swap(s, i+1, i+2));

                    } /*else if (i == s.length() - 1) {
                        System.out.println(swap(s, i, 1));
                        


                    } */else {
                        System.out.print(swap(s,i,0));
                    }

                }
            }

        }
    }

    public String swap(String s1, int i, int j) {
        StringBuffer v = new StringBuffer(s1);
        char x = s1.charAt(i);
        char y = s1.charAt(j);
        v.setCharAt(i, y);
        v.setCharAt(j, x);
        stringManipulate(v.toString());
        return v.toString();

    }


}
