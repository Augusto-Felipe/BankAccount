package devandroid.felipe.bankaccountprogram

fun main() {

    val deniseBankAccount = BankAccount("Denis Panjuta", 1338.20)

    deniseBankAccount.deposit(200.0)
    deniseBankAccount.deposit(1200.0)
    deniseBankAccount.deposit(3000.0)
    deniseBankAccount.deposit(2500.0)
    deniseBankAccount.withdraw(3500.0)

    deniseBankAccount.displayTransactions()

    val sarahBankAccount = BankAccount("Sarah Robert", 0.0)

    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)

    sarahBankAccount.displayTransactions()

}