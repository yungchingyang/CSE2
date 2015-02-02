///////////////////////////////////////////////
//Yung Ching Yang
//January 30 2015
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//
//
//  define a class
        public class Arithmetic {
//  main method required for every Java program
        public static void main (String [ ] args) {

//  our input data.
//  Number of pairs of socks
        int nSocks=3;
//  Cost per pair of socks
//  (‘$’ is part of the variable name)
        double sockCost$=2.58;

//  Number of drinking glasses
        int nGlasses=6;
//  Cost per glass
        double glassCost$=2.29;
//
//  Number of boxes of envelopes
        int nEnvelopes=1;
//  Cost per box of envelopes
        double envelopeCost$=3.25;
//
//  Tax Percentage
        double taxPercent=0.06;
//
//  print out the numbers stored in the variables that store the items, number, cost
        System.out.println("Item: Sock" + "      " + "Number: " + nSocks + "  " + "Cost: " + sockCost$);
        System.out.println("Item: Glass" + "     " + "Number: " + nGlasses + "  " + "Cost: " + glassCost$);
        System.out.println("Item: Envelope" + "  " + "Number: " + nEnvelopes + "  " + "Cost: " + envelopeCost$);
//
//  our intermediate data and calculation.
        double totalSockCost$;  //total cost of socks
        double totalGlassCost$; //total cost of glasses
        double totalEnvelopeCost$;  //total cost of envelopes
        double sockTax$; //tax of socks
        double glassTax$;    //tax of glasses
        double envelopeTax$; //tax of envelopes
        totalSockCost$ = nSocks * sockCost$;    //calculate total cost of socks
        totalGlassCost$ = nGlasses * glassCost$;    //calculate total cost of glasses
        totalEnvelopeCost$ = nEnvelopes * envelopeCost$;    //calculate total cost of envelopes
        sockTax$ = totalSockCost$ * taxPercent; //calculate tax of socks total
        int intSockTaxHundred$ = (int)(sockTax$ * 100);   //integer of tax of socks multiply 100
        double fSockTax$ = (double) (intSockTaxHundred$ / 100.0); //tax of socks in two decimals
        glassTax$ = totalGlassCost$ * taxPercent;   //calculate tax of glasses total
        int intGlassTaxHundred$ = (int) (glassTax$ * 100);  //integer of glasses multiply 100
        double fGlassTax$ = (double) (intGlassTaxHundred$ / 100.0);   //tax of glasses in two decimals
        envelopeTax$  = totalEnvelopeCost$ * taxPercent;    //calculate tax of envelopes total
        int intEnvelopeTaxHundred$ = (int) (envelopeTax$ * 100);    //integer of tax of envelopes multiply 100
        double fEnvelopeTax$ = (double) (intEnvelopeTaxHundred$ / 100.0); //tax of envelopes in two decimals
//        
//  print out the total cost and the sales tax for each item.
        System.out.println("Total cost of sock:     " + totalSockCost$ + "      " + "Tax for sock:     " + fSockTax$);
        System.out.println("Total cost of glass:    " + totalGlassCost$ + "     " + "Tax for glass:    " + fGlassTax$);
        System.out.println("Total cost of envelope: " + totalEnvelopeCost$ + "      " + "Tax for envelope: " + fEnvelopeTax$);
//
//  our intermediate data2.
        double totalCost$;  //total cost of all items before tax
        double totalSalesTax$; //total sales tax of all items
        double totalCostTaxed$; //total cost of all items after tax
        totalCost$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; //calculate the total cost ofall items before tax
        totalSalesTax$ = totalCost$ * taxPercent;   //calculate sales tax of all items
        int intTaxHundred$ = (int) (totalSalesTax$ * 100);  //integer of total sales tax multiply 100
        double fSalesTax$ = (double) (intTaxHundred$ / 100.0);    //the sales tax in two decimals
        totalCostTaxed$ = totalCost$ + totalSalesTax$;  //calculate total cost of all items after tax
        int intCostHundred$ = (int) (totalCostTaxed$ * 100);    //integer of taxed cost multiply 100
        double finalCostTaxed$ = (double) (intCostHundred$ / 100.0);  //the final cost in two decimals
//
//  print out the total cost of the purchases (before tax), the total sales tax, and the total cost of the purchases (including sales tax).
        System.out.println("Total cost of all items:           " + totalCost$);
        System.out.println("Total sales tax:                   " + fSalesTax$);
        System.out.println("Total cost of all items after tax: " + finalCostTaxed$);
        
    }
}