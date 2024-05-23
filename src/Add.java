public class Add {

    int num1;
    int num2;
    int result;

    public  Add(int num1, int num2){
        this.num1 = num1;
//        This means the current instance
        this.num2 = num2;
    }


    public  void sum() {
        result = num1 + num2;
        System.out.println("The result is : " + result);
    }




}
