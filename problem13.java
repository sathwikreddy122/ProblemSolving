public class problem13 {
    public static void main(String[] args) {
        //Replace zeros to 5;
        int n = 1004;
        char[] ch = String.valueOf(n).toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '0'){
                ch[i] = '5';
            }
        }
        System.out.println(ch);
    }
}
