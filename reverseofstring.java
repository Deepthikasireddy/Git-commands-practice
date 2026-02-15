
class ReverseOfString{
    public static void main(String args[]){
        String s="deepthi";
        String rev="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            rev=rev+c;
        }

        System.out.print("Reverse of a String is : "+rev);
    }
}