public class Nestedifelse {
    public static void main(String[] args) {
        int age = 20;
        String gender="Male";
        boolean isRegistered = true;
        System.out.println();
        if(age>18){
            System.out.println("You are eligble ");
            if(gender=="Male"){
                System.out.println("You are invited");
                if(isRegistered==true){
                    System.out.println("You have account");
                }

            }else{
                System.out.println("You are not invited");
            }
        }
    }
    
}
