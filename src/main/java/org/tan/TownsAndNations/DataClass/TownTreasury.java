package org.tan.TownsAndNations.DataClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TownTreasury {

    private int balance;
    private int flatTax;
    private final float percentTax;
    LinkedHashMap<String,ArrayList<TransactionHistory>> taxHistory;
    ArrayList<TransactionHistory> donationHistory;
    LinkedHashMap<String,ArrayList<TransactionHistory>> salaryHistory;
    LinkedHashMap<String, TransactionHistory> chunkHistory;
    ArrayList<TransactionHistory> miscellaneousPurchaseHistory;

    public TownTreasury(){
        this.balance = 0;
        this.flatTax = 1;
        this.percentTax = 0;
        this.taxHistory = new LinkedHashMap<>();
        this.donationHistory = new ArrayList<>();
        this.salaryHistory = new LinkedHashMap<>();
        this.chunkHistory = new LinkedHashMap<>();
        this.miscellaneousPurchaseHistory = new ArrayList<>();
    }
    public int getBalance(){
        return this.balance;
    }
    public void addToBalance(int amount){
        this.balance = this.balance + amount;
    }
    public void removeToBalance(int amount){
        this.balance = this.balance - amount;
    }
    public void add1FlatTax(){
        this.flatTax = this.flatTax + 1;
    }
    public void remove1FlatTax(){
        this.flatTax = this.flatTax - 1;
    }
    public int getFlatTax(){
        return this.flatTax;
    }
    public void addTaxHistory(LocalDate date, String playerID, int amount){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String formattedDate = date.format(formatter);

        if (!this.taxHistory.containsKey(formattedDate)) {
            this.taxHistory.put(formattedDate, new ArrayList<>());
        }
        this.taxHistory.get(formattedDate).add(new TransactionHistory(playerID, amount));
    }
    public void addDonation(LocalDate date, String playerID, int amount){
        this.donationHistory.add(new TransactionHistory(playerID, amount));
    }
    public void addSalary(LocalDate date, String playerID, int amount){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String formattedDate = date.format(formatter);

        if (!this.salaryHistory.containsKey(formattedDate)) {
            this.salaryHistory.put(formattedDate, new ArrayList<>());
        }
        this.salaryHistory.get(formattedDate).add(new TransactionHistory(playerID, amount));
    }
    public void addChunkHistory(LocalDate date, String playerID, int amount){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String formattedDate = date.format(formatter);

        if (!this.chunkHistory.containsKey(formattedDate)) {
            this.chunkHistory.put(formattedDate,new TransactionHistory("Chunks", amount));
        }
    }
    public void addMiscellaneousPurchase(LocalDate date, String miscellaneous, int amount){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String formattedDate = date.format(formatter);
        this.miscellaneousPurchaseHistory.add(new TransactionHistory(miscellaneous, amount));
    }
    public List<String> getTaxLimitedHistory(int wantedNumberOfRows){

            return null;
    }
    public List<String> getDonationLimitedHistory(int wantedNumberOfRows){

        if (this.donationHistory.size() < wantedNumberOfRows) {
            wantedNumberOfRows = this.donationHistory.size();
        }

        ArrayList<String> latestDonations = new ArrayList<>();
        for (int i = this.donationHistory.size() - 1; i >= this.donationHistory.size() - wantedNumberOfRows; i--) {

            latestDonations.add(this.donationHistory.get(i).getTransactionLine());

        }
        return latestDonations;
    }
    public List<String> getMiscellaneousLimitedHistory(int wantedNumberOfRows){

        int miscSize = this.miscellaneousPurchaseHistory.size();

        if (miscSize < wantedNumberOfRows) {
            wantedNumberOfRows = miscSize;
        }

        ArrayList<String> latestDonations = new ArrayList<>();
        for (int i = miscSize - 1; i >= miscSize - wantedNumberOfRows; i--) {

            latestDonations.add(this.miscellaneousPurchaseHistory.get(i).getTransactionLine());

        }
        return latestDonations;
    }
}
