 class Customers {

    int age;
    String name;
    double walletBal;

        void depositMoney(float amt ){
            walletBal = walletBal+amt;

        }
        double withdrawMoney(double amt){
        walletBal = walletBal-amt;

        return walletBal;

        }
}

     class TestCustomers{

        public static void main(String [] args){
            Customers c1 ;
            c1 = new Customers();
             c1.age = 34;
             c1.name = "Raghu";
             c1.walletBal = 1000;
             c1.depositMoney(500);
            double updatedBal = c1.withdrawMoney(200);
            System.out.println("New Balance -"+updatedBal);




        }
    }

