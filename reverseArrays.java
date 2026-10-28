public class reverseArrays{

public static void main (String[] args){

    int[][] array = { 
                    {1,2,3}, 
                    {4,5,6}, 
                    {7,8,9}
                  };
   
    for(int index = 0; index < array.length; index++){

        int side1 = 0;

        int side2 = array[index].length - 1;

        while(side1 < side2){

            int z = array[index][side1];

            array[index][side1] = array[index][side2];

            array[index][side2] = z;

            side1++;

            side2--;
}
}

            System.out.print("[");

    for(int index = 0; index < array.length; index++){

            System.out.print("[");

        for(int count = 0; count < array[index].length; count++){
     

            System.out.print(array[index][count]  +  ",");
}
            System.out.print("]");
}
            System.out.print("]");
}
}




public class reverseArrays{

    public static int[][] reverseArrays(int[][] array) {
        for(int index = 0; index < array.length; index++){
            int side1 = 0;
            int side2 = array[index].length - 1;
            
            while(side1 < side2){
                int z = array[index][side1];
                array[index][side1] = array[index][side2];
                array[index][side2] = z;
                
                side1++;
                side2--;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] result = reverseArrays(array);

        System.out.print("[");
        for(int index = 0; index < result.length; index++){
            System.out.print("[");
            for(int count = 0; count < result[index].length; count++){
                System.out.print(result[index][count]);
            if(count < array[index].length - 1){
                 System.out.print(", ");
                }
            }
            System.out.print("]");
            if(index < array.length - 1){
                System.out.print(", ");
          }
        }
        System.out.print("]");
    }
}
