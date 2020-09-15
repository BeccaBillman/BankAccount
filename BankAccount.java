import java.util.Scanner;
public class BankAccount{
    public static void main (String [ ] args) {
        //Declare other variables as needed
        int accountNum;
        String transaction;
        double deposit, withdrawal;
        char menuChoice = ' ';
        double curbalance = 5000.00;
        
        //Declare a Scanner object
        Scanner input = new Scanner (System.in);
        
        //Display the welcome message 
            //Call the welecomeMessage() function
                welcomeMessage();
 
        //Prompt the user to enter the account number 
            //Call the accountInfo() function
                 accountNum = accountInfo(); //call statement for accountInfo
 
        //Process menu using a Do-While loop and Switch statement
        
                do{
                        //Call the menuSelection function to display the menu and ask the user for their choice 
                        //Call the displayMenu() function
                         menuChoice = menuSelection();         
 
                        //Switch statement is used to determine which function is called based on the user’s choice
                        switch(menuChoice){
 
                        //Case (If the menu choice is “D”)
                            case 'D':
                             //Call the depositTransaction(current balance) function and assign it to a variable
                            curbalance = deposit(curbalance);
                                break;
                         //Case (If the menu choice is “W”)
                            case 'W':
                             //Call the withdrawalTransactioncurrent balance) function and assign it to a variable
                            curbalance = withdrawFunds(curbalance);//call statement for WithdrawFunds
                                break;
                        //Case (If the menu choice is “B”)
                             case 'B':
                                //Call the checkBalance(account number, current balance) function
                                    balance(accountNum, curbalance); 
                                break;
                        //Case (If the menu choice is “X”)
                                case 'X':
                               break;
                               default: 
                               //Default for user error handling
                                 System.out.println("ERROR: Please enter a D, B, W, or X");
                        }//end of switch     
            } while (menuChoice != 'X'); //end of do-while loop
            //Display final message
           System.out.println("Thank you for being a loyal Seminole Bank customer!");
        }//end of main
 /**********************************END OF MAIN() FUNCTIONS********************************/
 /***********************************FUNCTION DEFINITIONS ********************************/
 /********************WELCOME MESSAGE() FUNCTION ******************/
         //Display welcome message 
         public static void welcomeMessage(){             
             System.out.println("Welcome to Seminole Bank!");
         }//end of welcomeMessage
 /********************END OF WELCOME MESSAGE() FUNCTION ******************/
 /********************ACCOUNT INFO() FUNCTION ******************/
         //Prompt and Read users’ account number.
         public static int accountInfo (){
            Scanner input = new Scanner (System.in);
             System.out.println("Please enter your 5-digit Account Number: ");
                     int acctNum = input.nextInt(); //reading acct number from keyboard
             System.out.println("Thank You!");
             return acctNum; // returning the account number to the Boss/main
         }//end of accountInfo
 /********************END ACCOUNT INFO() FUNCTION ******************/
 /********************DISPLAY MENU() FUNCTION ******************/
         //Display menu choices to the user and Read the users’ banking choice.  
         public static char menuSelection() {
             Scanner input = new Scanner (System.in);
             System.out.println("Enter D for deposit, W for withdrawal, B for balance, X to exit the menu");
          String transaction = input.nextLine();
            char  menuChoice = transaction.charAt(0);
            menuChoice = Character.toUpperCase(menuChoice);  
             return menuChoice;
         }//end of menuSelection
 /********************END OF DISPLAY MENU() FUNCTION ******************/
 /********************DEPOSIT FUNDS() FUNCTION ******************/
         //Prompt the user for the amount to deposit and Read deposit amount.
         public static double deposit(double curbalance){
            System.out.println("Enter the amount of the deposit: ");
             Scanner input = new Scanner (System.in);
             double deposit = input.nextDouble();
             curbalance = curbalance + deposit;
             return curbalance;
         }//end of deposit
 /********************END DEPOSIT FUNDS() FUNCTION ******************/
 /********************WITHDRAWL FUNDS() FUNCTION ******************/
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  
         public static double withdrawFunds (double curbalance){
             System.out.println("Enter the amount of the withdrawal:");
             Scanner input = new Scanner (System.in);
             double withdraw = input.nextDouble();
             curbalance = curbalance - withdraw;
             return curbalance;
         }//end of withdrawFunds
 /********************END OF WITHDRAWL FUNDS() FUNCTION ******************/
 /********************CHECK BALANCE() FUNCTION ******************/
         //Display the current balance 
         public static void balance(int accountNum, double curbalance){
             System.out.print("Account number: " + accountNum);
              System.out.printf(" has a current balance of: $%.2f ", curbalance); //HINT IN LESSON DISCRIPTION 
         }//end of balance
 /********************END OF CHECK BALANCE() FUNCTION ******************/
/**********************END OF FUNCTION DEFINITIONS ****************************/
}//end of the class