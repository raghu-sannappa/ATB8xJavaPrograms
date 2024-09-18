@SuppressWarnings("unused")
class Customers {

    int age;
    String name;
    double walletBal;
    Customers(int age,String name,double walletBal){
        this.age=age;
        this.walletBal=walletBal;
        this.name=name;
    }

        void depositMoney(double amt ){
            walletBal = walletBal+amt;
            System.out.println("After Deposit New Balance-"+walletBal);


        }
        double withdrawMoney(double amt){
        walletBal = walletBal-amt;

        return walletBal;

        }
}

     class TestCustomers{

        public static void main(String [] args){
            Customers c1 = new Customers(34,"Raghu",10000);

            c1.depositMoney(500);
            double updatedBal = c1.withdrawMoney(200);
            System.out.println("After Withdraw New Balance -"+updatedBal);




        }
    }

