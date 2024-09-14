package ex_14092024;
    class Bank{
        int getROI(){
            return 2;
        }

    }
    class Axis extends Bank{
        int getROI(){
            return 7;
        }
    }
    class Hdfc extends Bank{
        int getROI(){
            return 8;
        }
    }



public class ExampleInheritence {
    public static void main(String [] args){
        Bank obj;
        obj = new Axis();
        int res = obj.getROI();
        System.out.println(res);
        obj = new Hdfc();
        int res1 = obj.getROI();
        System.out.println(res1);

    }

}
