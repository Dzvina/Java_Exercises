package Arrays;

public class GetPercentEven {

    public static int getPercentEven(int[] list){

        int count = 0;
        int percent = 0;
        for (int i=0; i<list.length; i++){

            if (list[i] % 2 == 0){
                count++;
            }
            percent = (count * 100)/ list.length;

        }
        return percent;
    }


    public static void main(String[] args){
        int[] list = {6, 2, 9, 11, 3};
        int getPercentEven_Result = getPercentEven(list);
        System.out.println(getPercentEven_Result);
    }


}
