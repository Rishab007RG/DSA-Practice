package DSA.GeeksForGeeks.String;

public class ValidateAn_IP_Address {
    public static void main(String[] args) {
        String str="19.132.268.45";
        boolean flag=check(str);
            System.out.println(flag);

    }
    public static boolean check(String str) {
        boolean flag=false;
        String[] parts = str.split("\\.");  // Escape the dot
        if(parts.length==4){
            for (String part : parts) {

                if(part.isEmpty()|| (part.length() > 1 && part.startsWith("0"))){
                    return false;
                }
                try{
                    int value=Integer.parseInt(part);
                    System.out.println(value);
                    if(value<0 || value>255  ){
                        flag=false;
                    }else{
                        flag=true;
                    }
                }catch (NumberFormatException e){
                    return false;
                }
            }
        }else {
            flag=false;
        }
        return flag;
    }

}
