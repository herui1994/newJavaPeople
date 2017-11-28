
public class ConverOfNumber {
    public static void main(String[] arg){
        int n = 5;
        System.out.println(oct2Bin(n));
        //this is a auto convert method
        System.out.println(Integer.toBinaryString(n));

        System.out.println(transform("221",3,2));
        System.out.println(transform("11001",2,3));
    }

    public static String oct2Bin(int n){
        String s = "";
        while(n >> 1 != 0){
            s = (n % 2) + s;
            n = n >> 1;
        }
        s = (n % 2) + s;
        return s;
    }

    public static String transform(String s, int radixSrc, int radixTgt){
        if(s.length() == 0 || s == "" || s == null){
            return "data invalid";
        }
        int slength = s.length();
        int transToOct = 0;
        for(int i = 0; i < s.length(); i++){
            int num = Integer.parseInt(s.substring(i,i+1));
            transToOct += (num * Math.pow(radixSrc,(slength-1-i)));
        }
        String tarStr = "";
        while(transToOct / radixTgt != 0){
            tarStr = (transToOct % radixTgt) + tarStr;
            transToOct = transToOct / radixTgt;
        }
        tarStr = (transToOct % radixTgt) + tarStr;
        return tarStr;
    }
}
