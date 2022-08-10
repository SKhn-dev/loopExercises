public class ThreeDigitCodes {
    public static void main(String[] args) {
        int count=0; //initialize the count variable to keep track of the number of three unique three-digit codes
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=4; k++){
                    if(k!=i && k!=j && i!=j){ //check if no digit matches with the other
                        count++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of three-digit unique codes: "+count);
    }
}
