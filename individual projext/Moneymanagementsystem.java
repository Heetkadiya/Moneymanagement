

//The tax slabs in India are as follows for the financial year 2022-23:
//
/*The tax slabs for individuals in India depend on their annual income and their age. Below are the tax slabs for the Financial Year 2021-2022 (Assessment Year 2022-2023):

        For individuals up to the age of 60 years:
        Up to Rs. 2.5 lakhs: No tax
        From Rs. 2.5 lakhs to Rs. 5 lakhs: 5% tax
        From Rs. 5 lakhs to Rs. 10 lakhs: 20% tax
        Above Rs. 10 lakhs: 30% tax
        For senior citizens (between 60 and 80 years):
        Up to Rs. 3 lakhs: No tax
        From Rs. 3 lakhs to Rs. 5 lakhs: 5% tax
        From Rs. 5 lakhs to Rs. 10 lakhs: 20% tax
        Above Rs. 10 lakhs: 30% tax
        For super senior citizens (above 80 years):
        Up to Rs. 5 lakhs: No tax
        From Rs. 5 lakhs to Rs. 10 lakhs: 20% tax
        Above Rs. 10 lakhs: 30% tax
        In addition to the above tax rates, there is a 4% Health and Education Cess on the income tax amount payable.
/*In India, you can claim tax redemption by following these steps:

Determine the tax redemption eligibility: You can claim tax redemption on certain investments and expenses, such as investments in tax-saving schemes like Public Provident Fund (PPF), Equity-Linked Saving Scheme (ELSS), National Savings Certificate (NSC), tax-saving fixed deposits, payment of life insurance premiums, payment of tuition fees for your children's education, repayment of the principal amount on your home loan, etc.

Collect proof of tax-saving investments: To claim tax redemption, you need to submit proof of your investments. You can get these proofs from the investment or insurance companies where you have made these investments.

File your income tax return: To claim tax redemption, you need to file your income tax return. You can file your return online or offline, depending on your convenience.

Claim tax redemption in your income tax return: When filing your income tax return, you need to claim the tax redemption for which you are eligible. You can do this by filling out the appropriate sections in your income tax return form.

Verify your income tax return: After filing your income tax return, you need to verify it. You can do this either online or offline.

Receive your tax redemption: If you have claimed tax redemption correctly and provided all the necessary proofs, you will receive your tax redemption in the form of a refund, which will be credited to your bank account.

Note that tax redemption rules and regulations can change from time to time, so it's always a good idea to keep yourself updated with the latest tax laws and regulations.*/
import java.util.*;
public class Moneymanagementsystem
{
    double sal;
    int age;
    double moneyinhand,taxpay,life_careexpensis,personalandfamily_savings,investing,personalandfamilyexpenses,imediatefunds,investinginrealestate,Cryptocurrencies,Exchange_tradedfundsETF,Peer_to_peerlending,Artandcollection,Hedge_funds,private_equity,venture_capital_funds;

    void checksalary(double sal)
    {
        if(sal<10000)
        {
            System.out.println("you didnt have enough money to invest! sorry.");
        }
    }
    //  *****AS in  practical life 50,30,20 ratio is implemented most of the time but divercifiying a portfoilio is someones personal choice so i made thi portfoilio desin
    Moneymanagementsystem(){}                        //MAKING DEFAULT CONSTRUCTOR FOR THE OBJECT MAKING CASE
    double a, b, c, d, e, f, g, h, i, j, k,l,m,n,o,p,q,r ;


    Moneymanagementsystem(double sal,int age,double a,double b,double c,double d, double e,double f)
    {
       /* this.sal=sal;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.age=age;*/
        double life_careexpensis = sal / a;
        sal = sal - life_careexpensis;
        double personalandfamily_savings = sal / b;
        sal = sal - personalandfamily_savings;
        double investing = sal / c;
        sal = sal - investing;
        double personalandfamilyexpenses = sal / d;
        sal = sal - personalandfamilyexpenses;
        double imediatefunds = sal / e;
        sal = sal - imediatefunds;
        double investinginrealestate= sal/f;
        sal=sal-investinginrealestate;
        moneyinhand=sal;
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("your life care expense is "+"$"+life_careexpensis);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For your investing purpose you should try sip in bluechip company or any other good mutual fund plan as ");
        System.out.println("per portfoilio given by the moneymanagement system  instead of going for ");
        System.out.println("stocks your total money for investing is:- " + "$" + investing);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For your personal and family saving the money available is=  " + "$" + personalandfamily_savings);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For your personal and family expenses  the money available is=  " + "$" + personalandfamilyexpenses);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For it is your emergency funds use it wisely or save it wisely.The money available is=  " + "$" + imediatefunds);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The remaining money you could use for any above things but " +
                "most preferable you should save or invest it for " +
                "better future of yours and your family = " + "$" + moneyinhand);

    }




    void allocationfor100001_249999(double sal,int age, double a,double b,double c,double d, double e,double f,double g,double h,double i,double j)
    {
        double investingonbondaswellasonmutualfunds=sal/g;
        sal=sal-investingonbondaswellasonmutualfunds;
        double investinginrealestate= sal/h;
        sal=sal-investinginrealestate;
        double investmentingoldandcommodities=sal/i;
        sal=sal-investmentingoldandcommodities;
        double personalexpensesaswellascomfortliving=sal/j;
        sal=sal-personalexpensesaswellascomfortliving;
        Moneymanagementsystem refsal=new Moneymanagementsystem(sal,age,a,b,c,d,e,f);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For your investing purpose in gold as well as in commoditiesyou should try to buy gold when ever the price is down" );
        System.out.println("THe perfect SCENARIO FOR BUYING GOLD IS WHEN EQUVITY MARKET IS BULLISH AS IN THAT TIME THE PRICES OF COMMODITIES ARE DOWN");
        System.out.println("FOR INVESTING  IN GOLD AND COMMODITIES YOU ARE SUGGESTED TO ALLOCATION OF MONEY SHOULD  BE"+"$"+investmentingoldandcommodities);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"FOR INVESTING IN REALESTATE PROPERTY YOU SHOULD GIVE RUPESS"+investinginrealestate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("THE MONEY THAT YOU WANT FOR YOUR COMFORT AS WELL AS FOR YOUR STANDARD OF LIVINGSHOULD BE"+"$"+personalexpensesaswellascomfortliving);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For your investment IN BONDS AND MUTUAL FUNDS money available is=  " + "$" + investingonbondaswellasonmutualfunds);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ADVICESABLE MUTUAL FUNDS ARE"+"There are several mutual funds in India that have a track record of delivering good returns. Here are some examples of mutual funds that have performed well in recent years:\n" +
                "Mirae Asset Large Cap Fund: This fund has consistently delivered strong returns and has outperformed its benchmark over the long term.\n" +
                "Axis Bluechip Fund: This fund has a focus on blue-chip stocks and has delivered impressive returns over the past few years.\n SBI Small Cap Fund: This fund invests in small-cap companies and has delivered strong returns over the long term.\n HDFC Mid-Cap Opportunities Fund: This fund invests in mid-cap companies and has delivered strong returns over the long term.\n ICICI Prudential Equity & Debt Fund: This fund invests in a mix of equities and debt, and has delivered strong returns over the long term.");
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    void allocationfor250000to500000(double sal,int age,double a,double b,double c,double d, double e,double f,double g,double h,double i,double j,double k)
    {

        Moneymanagementsystem refsal1=new Moneymanagementsystem();
        refsal1.allocationfor100001_249999(sal,age,a,b,c,d,e,f,g,h,i,j);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
    void allocationfor5lakhto7lakh(double sal,int age,double a,double b,double c,double d, double e,double f,double g,double h,double i,double j,double k,double l)
    {

        double Exchange_tradedfundsETF=sal/l;
        sal=sal-Exchange_tradedfundsETF;
        Moneymanagementsystem refsal1=new Moneymanagementsystem();
        refsal1.allocationfor100001_249999(sal,age,a,b,c,d,e,f,g,h,i,j);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR EXCHANGE TRADEDSUNFS ETF IS :- $"+ Exchange_tradedfundsETF);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
    void allocationfor7lakhto10lakh(double sal,int age,double a,double b,double c,double d, double e,double f,double g,double h,double i,double j,double k,double l,double m,double n,double o)
    {

        double Cryptocurrencies=sal/m;
        sal=sal-Cryptocurrencies;
        double Peer_to_peerlending=sal/n;
        sal=sal-Peer_to_peerlending;
        double Artandcollectibles=sal/o;
        sal=sal-Artandcollectibles;
        Moneymanagementsystem refsal1=new Moneymanagementsystem();
        refsal1.allocationfor5lakhto7lakh(sal,age,a,b,c,d,e,f,g,h,i,j,k,l);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR Cryptocurrencies IS :- $"+Cryptocurrencies);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR Peer_to_peerlending  IS :- $\""+Peer_to_peerlending);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR  Artandcollectibles IS :- $"+Artandcollectibles);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    void allocationfor10lakhtogreater(double sal,int age,double a,double b,double c,double d, double e,double f,double g,double h,double i,double j,double k,double l,double m,double n,double o,double  p,double q,double r)
    {

        double private_equity=sal/p;
        sal=sal-private_equity;
        double venture_capital_funds=sal/q;
        sal=sal-venture_capital_funds;
        Moneymanagementsystem refsal1=new Moneymanagementsystem();
        refsal1.allocationfor7lakhto10lakh(sal,age,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR private_equity IS :- $"+private_equity);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\"THE MONEY FOR  venture_capital_funds IS :- $"+venture_capital_funds);
        System.out.println("\"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    void taxredemption(double taxpay)
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("There is a way to save your taxable money by doing some things suggested by management system");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("AS YOU ARE INVESTING IN STOCKS TRY TO HOLD IT FOR 1 YEAR TO SAVE THE SHORT TERM CAPITAL GAIN TAX");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 1 :- Claim deductions under Section 80C: You can claim deductions up to Rs. 1.5 lakh under Section 80C of the Income Tax Act by investing in ");
        System.out.println ("instruments such as Public Provident Fund (PPF), National Savings Certificate (NSC)");
        System.out.println("Equity-Linked Savings Scheme (ELSS), etc.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 2 :- Claim deductions under Section 80D \n You can claim deductions  up to Rs. 25,000 \n under Section 80D by paying health insurance premiums for yourself, spouse, and dependent children.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 3 :- Claim deductions on home loan interest: \n If you have taken a home loan, you can claim deductions up to Rs. 2 lakh on theinterest \n paid on the loan under Section 24(b) of the Income Tax Act.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 4 :- Claim deductions under Section 80TTA:\n You can claim deductions up to Rs. 10,000 on interest\n earned from a savings account under Section 80TTA of the Income Tax Act.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" 5 :- Submit rent receipts: If you are living in a rented house, you can claim House Rent Allowance (HRA) exemptions by submitting rent receipts.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if((sal>500000)&&(sal<700000))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 6 :- Claim deductions on NPS:\n You can claim an additional deduction of up to Rs. 50,000 under Section 80CCD(1B)\n by investing in the National Pension System (NPS).");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        if((sal>700000)&&(sal<1000000))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 6 :- Claim deductions on NPS:\n You can claim an additional deduction of up to Rs. 50,000 under Section 80CCD(1B)\n by investing 10% in the National Pension System (NPS).");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 7 :- Claim deductions under Section 80G:\n You can claim deductions for donations made to specified charitable institutions \n under Section 80G of the Income Tax Act.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        if((sal>1000000)){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1 :- Invest in tax-saving instruments under Section 80C:\n You can invest up to Rs. 1.5 lakh in tax-saving instruments such as\n Public Provident Fund (PPF), National Savings Certificate (NSC), Equity-Linked Savings Scheme (ELSS), etc.,\n to claim deductions under Section 80C.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 2 :- Claim deductions on home loan interest: \n If you have taken a home loan, you can claim deductions up to Rs. 2 lakh on the interest paid on the loan under Section 24(b)\n of the Income Tax Act.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 3 :- Claim deductions on education loan interest:\n You can claim deductions on the interest paid on an education loan for self, spouse, or children\n under Section 80E of the Income Tax Act.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 4 :- Invest in National Pension Scheme (NPS):\n You can invest up to Rs. 2 lakh in the NPS\n to claim deductions under Section 80CCD(1B).");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 5 :- Claim deductions under Section 80D:\n You can claim deductions up to Rs. 25,000 on health insurance premiums\n for self, spouse, and dependent children under Section 80D.\n If you are a senior citizen, the limit is Rs. 50,000.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 6 :- Claim deductions on donations made:\n You can claim deductions on donations made to specified charitable institutions\n under Section 80G of the Income Tax Act.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 7 :- Claim deductions on medical expenses:\n You can claim deductions up to Rs. 1 lakh on medical expenses incurred for self, spouse, dependent children, or parents\n who are senior citizens under Section 80DDB.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 8 :- Claim deductions on interest earned:\n You can claim deductions up to Rs. 10,000\n on interest earned from savings accounts under Section 80TTA.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 9 :- Invest in tax-free bonds: You can invest in tax-free bonds issued by government companies to save tax on interest income.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 10 :- Split income with spouse: If your spouse has a lower income, you can transfer some of your income to your spouse to save tax.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("BY THIS ALL METHOD YOU CAN SAVE YOUR TAX MONEY THAT IS"+"$"+taxpay);
    }
}





