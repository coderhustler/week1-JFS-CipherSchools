package winterpep_github;
// Lecture 6 - What Is Abstraction In JAVA


/*
Abstraction teaches us how to present appropriate functionality to appropriate users.
Example - OLA CABS diff for Ola Director, Ola Driver and Customer
 */

    interface olaCustomer{
        void bookCab();
        void findARide();
        void signUp();
        void signIn();
        void raiseTicket();
        void addMoneyToWallet();
        void cancelCab();
        void scheduleCab();
        void rentCab();
    }

    interface olaDriver{
        void acceptBooking();
        void getCustomerLocation();
        void getMyCommission();
        void setAvailableStatus();
        void callCustomer();
        void customerFeedback();
        void sellUrVehicle();
    }

    interface olaOwner{
        void getReportByCancellations();
        void getDriverRecords();
        void getReportByRegion();
        void getReportByDriverId();
        void getTotalRevenue();
        void changeDriverStatus();
        void addDriver();
        void removeDriver();
    }

    public class lecture6 implements olaCustomer,olaDriver,olaOwner{
    public static void main(String[] args) {

        lecture6 obj=new lecture6();
//        obj. -> // -> uncomment this line, all the functions are shown or recommended
//    }
        // to implement abstraction we should use interfaces
        olaCustomer cust=new lecture6();
        olaDriver driver=new lecture6();
//        driver. // -> uncomment this line, only those functions which are relevant or should be shown to driver are recommended
    }

        @Override
        public void bookCab() {

        }

        @Override
        public void findARide() {

        }

        @Override
        public void signUp() {

        }

        @Override
        public void signIn() {

        }

        @Override
        public void raiseTicket() {

        }

        @Override
        public void addMoneyToWallet() {

        }

        @Override
        public void cancelCab() {

        }

        @Override
        public void scheduleCab() {

        }

        @Override
        public void rentCab() {

        }

        @Override
        public void acceptBooking() {

        }

        @Override
        public void getCustomerLocation() {

        }

        @Override
        public void getMyCommission() {

        }

        @Override
        public void setAvailableStatus() {

        }

        @Override
        public void callCustomer() {

        }

        @Override
        public void customerFeedback() {

        }

        @Override
        public void sellUrVehicle() {

        }

        @Override
        public void getReportByCancellations() {

        }

        @Override
        public void getDriverRecords() {

        }

        @Override
        public void getReportByRegion() {

        }

        @Override
        public void getReportByDriverId() {

        }

        @Override
        public void getTotalRevenue() {

        }

        @Override
        public void changeDriverStatus() {

        }

        @Override
        public void addDriver() {

        }

        @Override
        public void removeDriver() {

        }
    }
