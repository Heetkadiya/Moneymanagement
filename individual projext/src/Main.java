/*Diversification is the process of allocating your money across different asset classes to minimize risk and maximize returns. Here are some ways to diversify your money:

        Invest in mutual funds: Mutual funds are a good way to diversify your money across different asset classes such as equities, bonds, and commodities.

        Invest in fixed deposits: Fixed deposits provide guaranteed returns and are a low-risk investment option.

        Invest in real estate: Real estate is a good long-term investment option that provides steady returns.

        Invest in gold: Gold is a safe-haven asset that provides protection against inflation and market volatility.

        Create an emergency fund: It is always a good idea to have an emergency fund that can cover your expenses for at least 6-12 months.

        Remember to always consult a financial advisor before making any investment decisions.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Hello this is a moneymanagement tool help you to save as well as helps to manage your money. ");

        int n = 0;
        while (n != 5) {
            System.out.println("1. for display diversified portfoilio for your specified income. \n 2. for tax deduction information\n 3.for advisible stocks\n 4.for advisible  mediclaim and insurance information\n 5.to exit ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("please provide your monthly salary:- ");
                double salary = sc.nextInt();
                System.out.println("please provide your Age :- ");
                int age = sc.nextInt();
                if (age > 130) {
                    System.out.println("PLease provide a appropraite age");
                    System.exit(0);
                } else if ((age > 0) && (age < 101)) {
                    double anuualsalary = 12 * salary;
                    Moneymanagementsystem sal1 = new Moneymanagementsystem();
                    sal1.checksalary(anuualsalary);
                    //sal1.checkag(age);
                    //System.exit(0);
                    if ((anuualsalary >= 10000) && (anuualsalary <= 100000)) {

                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("As per your income you didnt fall into anyy tax slab so there is no need for tax paying.congrates");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Moneymanagementsystem sal2 = new Moneymanagementsystem(anuualsalary, age, 3.2, 4.2, 2.5, 3.1, 4.1, 2);
                        // sal1.allocationfor100001_249999(anuualsalary, age,1.1,4.2,2.2,3.2,1.1,5,4,2.3,3.5,4.3);
                        sal2.moneyremaining();
                    }
                    if ((100001 <= anuualsalary) && (anuualsalary <= 249999)) {
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("As per your income you didnt fall into anyy tax slab so there is no need for tax paying.congrates");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Moneymanagementsystem sal3 = new Moneymanagementsystem();
                        sal3.allocationfor100001_249999(anuualsalary, 3, 3.2, 4.2, 2.5, 3.1, 4.1, 2.3, 5, 3.0, 4, 2.3);
                        sal3.moneyremaining();
                    }
                    if ((250000 <= anuualsalary) && (anuualsalary <= 499999)) {
                        if ((age > 0) && (age <= 60)) {
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"you fall under tax slad of income ranging from Rs. 2.5 lakh to ");
                            System.out.println("Rs. 5 lakh.and you have to pay 5% of your income as a tax the amount ");
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            Moneymanagementsystem sal4 = new Moneymanagementsystem();
                            double taxpay = (anuualsalary * 5) / 100;
                            anuualsalary = anuualsalary - taxpay;
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"THE TOTAL TAX YOU HAVE TO PAY IS" + taxpay);
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                            sal4.allocationfor250000to500000(anuualsalary, age, 3.2, 4.2, 2.5, 3.1, 4.1, 2.3, 5, 3.0, 4, 2.3, 4);
                            sal4.moneyremaining();
                            sal4.taxredemption(taxpay);
                        }
                        if ((age > 60) && (age <= 80)) {
                            if (anuualsalary <= 300000) {
                                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("As per your income you didnt fall into anyy tax slab so there is no need for tax paying.congrates");
                                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                Moneymanagementsystem sal4 = new Moneymanagementsystem();
                                sal4.allocationfor250000to500000(anuualsalary, age, 3, 3, 2, 3, 4, 2, 5, 3.0, 4, 2, 4);
                                sal4.moneyremaining();
                            }
                        }
                        if ((300000 <= anuualsalary) && (anuualsalary <= 500000) && ((age > 60) && (age <= 80))) {
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"you fall under tax slad of income ranging from Rs. 3 lakh to ");
                            System.out.println("Rs. 5 lakh.and you have to pay 5% of your income as a tax the amount ");
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            double taxpay = (anuualsalary * 5) / 100;
                            anuualsalary = anuualsalary - taxpay;
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"THE TOTAL TAX YOU HAVE TO PAY IS" + taxpay);
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            Moneymanagementsystem sal4 = new Moneymanagementsystem();
                            sal4.allocationfor250000to500000(anuualsalary, age, 3, 4, 2, 3, 4, 2, 5, 3.0, 4, 2, 4);
                            sal4.moneyremaining();
                            sal4.taxredemption(taxpay);
                        }
                        if (age >= 80) {
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("As per your income you didnt fall into anyy tax slab so there is no need for tax paying.congrates");
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            Moneymanagementsystem sal4 = new Moneymanagementsystem();
                            sal4.allocationfor250000to500000(anuualsalary, age, 3, 3, 2, 3, 4, 2, 5, 3.0, 4, 2, 4);
                            sal4.moneyremaining();
                        }
                    }
                    if ((500000 <= anuualsalary) && (anuualsalary <= 700000)) {
                        if ((age <= 60) || ((age > 60) && (age <= 120))) {
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"you fall under tax slab of income ranging from Rs. 5 lakh to ");
                            System.out.println("Rs. 10 lakh.and you have to pay 20% of your income as a tax the amount ");
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            double taxpay = (anuualsalary * 20) / 100;
                            anuualsalary = anuualsalary - taxpay;
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("\"THE TOTAL TAX YOU HAVE TO PAY IS" + taxpay);
                            System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            Moneymanagementsystem sal4 = new Moneymanagementsystem();
                            sal4.allocationfor5lakhto7lakh(anuualsalary, age, 2.9, 3.2, 4, 3.5, 6, 2.6, 2.4, 3.0, 4.2, 5, 3.6, 5);
                            sal4.moneyremaining();
                            sal4.taxredemption(taxpay);
                        }
                    }
                    if ((700000 <= anuualsalary) && (anuualsalary <= 1000000)) {
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"you fall under tax slad of income ranging from Rs. 5 lakh to ");
                        System.out.println("Rs. 10 lakh.and you have to pay 20% of your income as a tax the amount ");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        double taxpay = (anuualsalary * 20) / 100;
                        anuualsalary = anuualsalary - taxpay;
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"THE TOTAL TAX YOU HAVE TO PAY IS" + taxpay);
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Moneymanagementsystem sal4 = new Moneymanagementsystem();
                        sal4.allocationfor7lakhto10lakh(anuualsalary, age, 3, 2, 4, 5, 7, 3, 2, 5, 2.4, 3.4, 5, 4.4, 3.2, 2.5, 4.4);
                        sal4.moneyremaining();
                        sal4.taxredemption(taxpay);
                    }
                    if ((1000000 <= anuualsalary)) {
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"you fall under tax slad of income ranging ");
                        System.out.println("Rs. 10 lakh.and you have to pay 30% of your income as a tax the amount ");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        double taxpay = (anuualsalary * 30) / 100;
                        anuualsalary = anuualsalary - taxpay;
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"THE TOTAL TAX YOU HAVE TO PAY IS" + taxpay);
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Moneymanagementsystem sal4 = new Moneymanagementsystem();
                        sal4.allocationfor10lakhtogreater(anuualsalary, age, 3.8, 2.3, 3.9, 5.1, 4.2, 3.6, 2.4, 5, 2.4, 3.1, 3.4, 4, 3.2, 2, 4, 2.8, 2.5, 3.3);
                        sal4.moneyremaining();
                        sal4.taxredemption(taxpay);
                    }
                }
            }
            if (n == 2) {

                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Tax deduction refers to a reduction in taxable income allowed by the government.\n In India, tax deduction is available for various expenses incurred by individuals and businesses.\n Let's take a look at some common tax deductions in India:");
                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("To claim tax deductions, individuals and businesses need to maintain proper \nrecords of the expenses and investments made during the financial year.\n It is important to note that tax deduction is not the same as tax exemption.\n While tax deduction reduces taxable income,\n tax exemption means that income is not taxable at all.");
                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("here is example for 5 lakh income ");
                Moneymanagementsystem ob = new Moneymanagementsystem();
                ob.taxredemption(500000);
            }
            if (n == 3) {
                System.out.println("enter the segment means\n 1.for penny\n 2.for middcap\n 3.for bluechip\n 4.indexes india as well as foregin\n 5 suggested mix  of middcap and blue chipsstocks");
                System.out.println("enter the number from above");
                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("THE suggested penny stocks are below\n ONE note\n It is important to note that penny stocks are highly speculative and can be very risky for investors,\n as they are often thinly traded and can be subject to manipulation.\n Additionally, it is important to conduct thorough research and analysis\n before investing in any stock, regardless of its price or market capitalization.\n ");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Punjab & Sind Bank (PSBANK) - trading around 20 rupees\n" +
                                "Reliance Communications Limited (RCOM) - trading around 2 rupees\n" +
                                "National Fertilizers Limited (NFL) - trading around 73 rupees\n" +
                                "Suzlon Energy Limited (SUZLON) - trading around 5 rupees\n" +
                                "Union Bank of India (UNIONBANK) - trading around 35 rupees\n" +
                                "Jindal Stainless Limited (JSL) - trading around 170 rupees\n" +
                                "GMR Infrastructure Limited (GMRINFRA) - trading around 27 rupees\n" +
                                "Please note that this is not a comprehensive or up-to-date list, and it is important to conduct thorough research and analysis \n before making any investment decisions.\n Additionally, it may be helpful to consult with a licensed financial advisor or broker\n for personalized investment advice.");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                    case 2:
                        System.out.println("THE suggested midcap stocks are below\n Adani Enterprises Limited (ADANIENT)\n" +
                                "Aditya Birla Fashion and Retail Limited (ABFRL)\n" +
                                "Apollo Hospitals Enterprise Limited (APOLLOHOSP)\n" +
                                "Balkrishna Industries Limited (BALKRISIND)\n" +
                                "Bata India Limited (BATAINDIA)\n" +
                                "Colgate-Palmolive (India) Limited (COLPAL)\n" +
                                "Dabur India Limited (DABUR)\n" +
                                "Gujarat Gas Limited (GUJGASLTD)\n" +
                                "Jubilant Foodworks Limited (JUBLFOOD)\n" +
                                "Muthoot Finance Limited (MUTHOOTFIN)");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;

                    case 3:
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("THE suggested bluechip stocks are below\n Reliance Industries Limited (RELIANCE)\n" +
                                "Tata Consultancy Services Limited (TCS)\n"+
                                "HDFC Bank Limited (HDFCBANK)\n" +
                                "Infosys Limited (INFY)\n"+
                                "Housing Development Finance Corporation Limited (HDFC)\n"+
                                "Hindustan Unilever Limited (HINDUNILVR)\n" +
                                "ITC Limited (ITC)\n"+
                                "Bajaj Finance Limited (BAJFINANCE)\n"+
                                "Larsen & Toubro Limited (LT)\n"+
                                "Kotak Mahindra Bank Limited (KOTAKBANK)\n");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                    case 4:
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"the indexex are Dow Jones Industrial Average (DJIA) - United States\n" +
                                "Nasdaq Composite - United States\n" +
                                "S&P 500 - United States\n" +
                                "FTSE 100 - United Kingdom\n" +
                                "DAX - Germany\n" +
                                "CAC 40 - France\n" +
                                "Nikkei 225 - Japan\n" +
                                "Hang Seng Index - Hong Kong\n" +
                                "Shanghai Composite Index - China\n" +
                                "BSE Sensex - India\n" +
                                "Nifty 50 - India\n" +
                                "Straits Times Index - Singapore\n" +
                                "S&P/ASX 200 - Australia\n" +
                                "TSX Composite Index - Canada\n" +
                                "IPC - Mexico\n" +
                                "Bovespa - Brazil\n" +
                                "These indexes provide a general indication of the overall performance of the stock markets in their respective countries or regions.\n However, it is important to note that the performance of individual stocks may differ from the performance of the broader market.\n Additionally, past performance is not necessarily indicative of future results,\n and it is important to conduct thorough research and analysis\n before making any investment decisions.");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                    case 5:
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\"Here is a general mix of midcap and blue chip companies in India that you could consider:\n" +
                                "\n" +
                                "Reliance Industries Limited (RELIANCE) - blue chip\n" +
                                "Tata Consultancy Services Limited (TCS) - blue chip\n" +
                                "HDFC Bank Limited (HDFCBANK) - blue chip\n" +
                                "Adani Enterprises Limited (ADANIENT) - midcap\n" +
                                "Bata India Limited (BATAINDIA) - midcap\n" +
                                "Dabur India Limited (DABUR) - midcap\n" +
                                "Jubilant Foodworks Limited (JUBLFOOD) - midcap\n" +
                                "Muthoot Finance Limited (MUTHOOTFIN) - midcap\n" +
                                "This is just a general mix and not a recommendation.\n It is important to conduct your own research and analysis, and consult with a licensed financial advisor or broker for personalized investment advice.\n Additionally, it is important to remember that past performance is not necessarily indicative of future results,\n and investments in the stock market are subject to market risks.");
                        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                    default:
                        System.out.println("\"Number not found\"4" +
                                "");
                        break;
                }
            }
            if(n==4){
                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\"in general, here are some tips that might be helpful when considering medications and insurance:\n" +
                        "\n" +
                        "When it comes to medications, it is important to always follow the prescription of a licensed healthcare professional.\n If you have any concerns or questions about your medications, it is important to discuss them with your doctor or pharmacist.\n" +
                        "\n" +
                        "You may want to consider generic medications as an alternative to brand-name medications, as they are often cheaper and just as effective.\n" +
                        "\n" +
                        "When choosing an insurance policy, consider the coverage and benefits provided. Some policies may have higher premiums but better coverage, while others may have lower premiums but fewer benefits.\n It is important to find a policy that meets your specific needs and budget.\n" +
                        "\n" +
                        "Look for policies that cover preventive care and routine check-ups, as well as emergency care and hospitalization.\n" +
                        "\n" +
                        "Consider your deductible and copayment amounts, as well as any exclusions or limitations in the policy.\n Be sure to read the policy carefully and ask any questions you may have before signing up.\n" +
                        "\n" +
                        "Remember, everyone's healthcare needs and insurance preferences are different, so it is important to do your research and consult with licensed professionals to find the best options for you.");
                System.out.println("\"the advisible mediclaim and insurance are Insurance companies:\n" +
                        "\n" +
                        "LIC (Life Insurance Corporation of India)\n" +
                        "ICICI Prudential Life Insurance\n" +
                        "HDFC Life Insurance\n" +
                        "SBI Life Insurance\n" +
                        "Max Life Insurance\n" +
                        "Mediclaim companies:\n" +
                        "\n" +
                        "Apollo Munich Health Insurance\n" +
                        "Star Health and Allied Insurance\n" +
                        "Bajaj Allianz Health Insurance\n" +
                        "Religare Health Insurance\n" +
                        "HDFC ERGO Health Insurance");
                System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }
            if (n == 5) {
                System.exit(0);
            }
            else{
                System.out.println("the given number is invalid .Enter again");
            }
        }
    }
}

