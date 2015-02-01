// Jonathan Chisholm
// 2/3/2015
// CSE 002
// Homework 2 - Arithmetic Calculations

// In this homework, my program will:
// -Calculate and print the total cost of each kind of item
// -Calculate and print the sales tax for each total cost
// -Calculate and print the total cost of purchases before tax
// -Calculate and print the total cost of purchases including tax

public class Arithmetic {
    // main method required for every java program
    public static void main(String[] args) {
        
        // Set the input variables
        // Number of pairs of socks
        int nSocks = 3;
        // Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$ = 2.58;
        // Number of drinking glasses
        int nGlasses = 6;
        // Cost per glass
        double glassCost$ = 2.29;
        // Number of boxes of envelopes
        int nEnvelopes = 1;
        // Cost per box of envelopes
        double envelopeCost$ = 3.25;
        // Tax rate
        double taxPercent = 0.06;
        
        // Declare variables to calculate
        double totalSockCost$; // Total cost of socks
        double sockSalesTax$; // Sales tax of socks
        double totalGlassCost$; // Total cost of glasses
        double glassSalesTax$; // Sales tax of glasses
        double totalEnvelopeCost$; // Total cost of envelopes
        double envelopeSalesTax$; // Sales tax of envelopes
        double totalBeforeTax$; // Total cost of items before tax
        double totalTax$; // Total sales tax of items
        double totalAfterTax$; // Total cost of items after tax
        
        // Compute costs for socks
        System.out.println("Socks:");
        System.out.println(nSocks + " pairs of socks were bought");
        System.out.println("Each pair of socks costs $" + sockCost$);
        totalSockCost$ = (nSocks * sockCost$) * 100; // The following steps reduce to 2 decimals
        int adjustedTotalSockCost$ = (int) totalSockCost$; // Truncates the number to 3 didgits
        double finalTotalSockCost$ = (double) adjustedTotalSockCost$; // Allows for decimals
        System.out.println("The total cost of the socks is $" + (finalTotalSockCost$/100));
        sockSalesTax$ = finalTotalSockCost$ * taxPercent;
        int adjustedSockSalesTax$ = (int) sockSalesTax$;
        double finalSockSalesTax$ = (double) adjustedSockSalesTax$;
        System.out.println("The sales tax for the socks is $" + (finalSockSalesTax$/100));
        
        // Compute costs for glasses
        System.out.println("Glases:");
        System.out.println(nGlasses + " glasses were bought");
        System.out.println("Each glass costs $" + glassCost$);
        totalGlassCost$ = (nGlasses * glassCost$) * 100;
        int adjustedTotalGlassCost$ = (int) totalGlassCost$;
        double finalTotalGlassCost$ = (double) adjustedTotalGlassCost$;
        System.out.println("The total cost of the glasses is $" + (finalTotalGlassCost$/100));
        glassSalesTax$ = finalTotalGlassCost$ * taxPercent;
        int adjustedGlassSalesTax$ = (int) glassSalesTax$;
        double finalGlassSalesTax$ = (double) adjustedGlassSalesTax$;
        System.out.println("The sales tax for the glasses is $" + (finalGlassSalesTax$/100));
        
        // Compute costs for envelopes
        System.out.println("Envelopes:");
        System.out.println(nEnvelopes + " boxes of envelopes were bought");
        System.out.println("Each box costs $" + envelopeCost$);
        totalEnvelopeCost$ = (nEnvelopes * envelopeCost$) * 100;
        int adjustedTotalEnvelopeCost$ = (int) totalEnvelopeCost$;
        double finalTotalEnvelopeCost$ = (double) adjustedTotalEnvelopeCost$;
        System.out.println("The total cost of the envelopes is $" + (finalTotalEnvelopeCost$/100));
        envelopeSalesTax$ = finalTotalEnvelopeCost$ * taxPercent;
        int adjustedEnvelopeSalesTax$ = (int) envelopeSalesTax$;
        double finalEnvelopeSalesTax$ = (double) adjustedEnvelopeSalesTax$;
        System.out.println("The sales tax for the envelopes is $" + (finalEnvelopeSalesTax$/100));
        
        // Compute the total cost before tax
        System.out.println("Totals:");
        totalBeforeTax$ = finalTotalSockCost$ + finalTotalGlassCost$ + finalTotalEnvelopeCost$;
        System.out.println("The total cost of the items before tax is $" + (totalBeforeTax$/100));
        
        // Compute the total amount of sales tax
        totalTax$ = finalSockSalesTax$ + finalGlassSalesTax$ + finalEnvelopeSalesTax$;
        System.out.println("The total amount of sales tax is $" + (totalTax$/100));
        
        // Compute the total cost after tax
        totalAfterTax$ = totalBeforeTax$ + totalTax$;
        System.out.println("The total cost of the items after tax is $" + (totalAfterTax$/100));
    }
    
}