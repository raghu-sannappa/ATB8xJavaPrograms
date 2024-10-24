package ex_21092024;

public class ChessGrandMaster {

        public static String checkTitle(String [] arr){
            int winCount=0;
            for(String res:arr){
                if(res.equalsIgnoreCase("win")){
                    winCount++;
                }
            }
            if(winCount>=5){
                return "Grand Master";
            } else if (winCount==0) {
                return "Master";
            }else {
                return "International Master";
            }
        }

    public static void main(String [] args){

        String Title1 = checkTitle(new String [] {"Loss","Loss","Loss"});
        String Title2 = checkTitle(new String [] {"Win","Win","Win"});
        String Title3 = checkTitle(new String [] {"Win","Win","Win","Win","Win"});
        System.out.println(Title1);
        System.out.println(Title2);
        System.out.println(Title3);

    }
}
