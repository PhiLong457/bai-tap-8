package Practice.Assignment8;

public class Upper_to_Lower_String {
    
public static void convertOpposite(StringBuffer str){
     int len = str.length();
     
     for(int i = 0; i < len; i++){
         Character c  = str.charAt(i);
         
         if (Character.isLowerCase(c)){
             str.setCharAt(i, Character.toUpperCase(c));
             }else{
             str.setCharAt(i, Character.toLowerCase(c));
         }
     }
     System.out.println(str);

}
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer ("Hello World");
        convertOpposite(str);
    }
}
