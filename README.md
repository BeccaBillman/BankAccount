# BankAccount
A.	Test Scenarios.  [10 Points]
(Describe TWO test scenarios used to verify the correctness of the program by filling in the blank Test Scenario tables below.)     HINT:  Look at the “Test Scenarios and Sample Runs” above for guidance!!!  
Test Scenario Template:
Scenario Test Focus:	What this scenario is testing – refer to example testing scenario and sample run above
Scenario Information:	Inputs
Expected Results:	Expected outcomes

 

Test Scenario #1:
Scenario Test Focus:	Testing the deposit function to ensure that the current balance is updated followed by a withdrawal transaction. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 17832
Menu Item: B (UC)       [Balance: $5000.00  ]
Menu Item: d (LC)       [Deposit: $630.67 ]
Menu Item: W (UC)   [Withdrew: $82.54 ]
Menu Item: b (LC)     [Balance: $5548.13 ]
Menu Item: x (LC)    [Exit]
Expected Results:	Current Balance should be: $5548.13

Test Scenario #2:
Scenario Test Focus:	Testing the withdrawal function to ensure that the current balance is updated followed by a deposit transaction. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 14572
Menu Item: b (LC)         [Balance: $5000.00  ]
Menu Item: W (UC)     [Withdrew: $678.00 ]
Menu Item: D (UC)     [Deposit: $50.00 ]
Menu Item: b (LC)      [Balance: $4372.00 ]
Menu Item: x (LC)     [Exit]
Expected Results:	Current Balance should be: $4372.00



B.	Complete and Upload the Program to the Assignment link. [90 Points]
(Write the Java Program to implement a solution to the BankAccount problem.)
Program Name:  BankAccount.java
Test Scenario #3:  (+2 Extra Credit Points)
Scenario Test Focus:	Testing the deposit function to ensure that the current balance is updated followed by balance check. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 67323
Menu Item: B (UC)     [Balance: $5000.00 ]
Menu Item: d (LC)     [Deposit: $6045.02 ]
Menu Item: b (LC)    [Balance: $ 11045.02 ]
Menu Item: X (UC)  [Exit]
Expected Results:	Current Balance should be: $11045.02

Test Scenario #4:  (+2 Extra Credit Points)
Scenario Test Focus:	Testing the withdrawal  function to ensure that the current balance is updated followed by balance check. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 44560
Menu Item: b (UC)      [Balance: $5000.00  ]
Menu Item: W (UC)   [Withdrew: $3007.00 ]
Menu Item: b (LC)    [Balance: $1993.00 ]
Menu Item: x (LC)   [Exit]
Expected Results:	Current Balance should be: $1993.00


Test Scenario #5:  (+2 Extra Credit Points)
Scenario Test Focus:	Testing the deposit function before balance function followed by withdrawal function. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 56423
Menu Item: d (LC)      [Deposit: $5900.76  ]
Menu Item: b (LC)     [Balance: $ 10900.76 ]
Menu Item: W (UC)  [Withdrew: $765.80 ]
Menu Item: B (UC)    [Balance: $10134.96 ]
Menu Item: X (LC)   [Exit]
Expected Results:	Current Balance should be: $10134.96

Test Scenario #6:  (+2 Extra Credit Points)
Scenario Test Focus:	Testing the withdrawal function before balance.. Verify that the application will accept lower and upper case menu item choices.
Scenario Information:	Account Number: 90650
Menu Item: W (UC) [Withdrew: $40.00]
Menu Item: b (LC)  [Balance: $4960.00 ]
Menu Item: x (LC) [Exit]
Expected Results:	Current Balance should be: $4960.00



