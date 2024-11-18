package ex_20092024;

public class ConstructorWithArray {
    private final int width;
    private final int length;
    private final int height;
    ConstructorWithArray(int [] arr){
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];



    }
    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;

    }

    public int getHeight(){
        return this.height;
    }

    public int getVolume(){
        return this.length * this.width * this.height;
    }
    public int getSurfaceArea(){
        return 2 * (this.width * this.length + this.length * this.height + this.height * this.width);

    }



    public static void main(String [] args){
        ConstructorWithArray block = new ConstructorWithArray(new int[] { 3, 4, 2 });

        assert block.getLength() == 4 : "Expect length = 4 for Solution([3, 4, 2])";

        assert block.getWidth() == 3 : "Expect width = 3 for Solution([3, 4, 2])";

        assert block.getHeight() == 2 : "Expect height = 2 for Solution([3, 4, 2])";

        assert block.getVolume() == 24 : "Expect volume = 24 for Solution([3, 4, 2])";

        assert block.getSurfaceArea() == 52 : "Expect surface area = 52 for Solution([3, 4, 2])";

        System.out.println("All test cases in main function passed");

    }
}
