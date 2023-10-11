# UML Sequence Diagram for ATM Machine

## Introduction

The proposed ATM system is a self-service banking machine. It lets customers do basic banking tasks without needing help from a human teller. You can usually find these ATMs in banks, shopping malls, and other public places.
## Sequence Diagram

The following sequence diagram shows a typical ATM withdrawal transaction:

<img src="ATM Machine (UML Sequence diagram).svg" alt="ATM Machine (UML Sequence diagram)" />

## Description

This diagram illustrates how a customer interacts with an ATM and the bank server during a card transaction.
It covers entering a PIN, selecting a withdrawal amount, and dispensing cash.
The loops are designed to handle cases of invalid PINs or amounts, making the process more interactive and tolerant of errors.
Steps of the sequence diagram is given below:

**1. Insert Card:** The customer inserts their card into the ATM.

**2. Enter PIN:** The ATM requests the PIN. If the PIN is valid, it proceeds; otherwise, it shows 'Invalid PIN' and asks for the correct PIN.

**3. Select Withdrawal:** The ATM prompts the customer to choose a withdrawal option.

**4. Enter Amount:** The ATM requests the withdrawal amount. If the amount is valid, it proceeds; otherwise, it shows 'Invalid Amount' and asks for the correct amount.

**5. Dispense Cash:** The bank server is notified to dispense cash if the amount is valid.

**6. Transaction Completed:** The bank server acknowledges that the transaction is completed.

**7. Collect Cash:** The ATM dispenses cash for the customer to collect.

**8. Complete Transaction:** The customer confirms that the transaction is complete.

**9. Print Receipt:** The ATM prints a receipt for the transaction, and the process ends.

## Conclusion

In short, the ATM system is a big step forward in banking. It focuses on making things easy, safe, and personalized. As technology moves forward, this system establishes a new standard for the helpfulness and user-friendliness of ATMs.
