package devandroid.felipe.bankaccountprogram

import android.annotation.SuppressLint

class BankAccount(
    var accountHolder: String,
    var balance: Double
) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount < acctBalance()) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
            println("You don't have the funds to withdraw the amount.")
        }
    }

    @SuppressLint("DefaultLocale")
    fun displayTransactions() {
        println("Transaction history for $accountHolder")
        for(transactions in transactionHistory) {
            println(transactions)
        }
        println("Current balance: $${String.format("%.2f", acctBalance())}")
    }

    fun acctBalance() : Double {
        return balance
    }


}