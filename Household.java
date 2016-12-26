/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package household;

/**
 *
 * @author NNamdi This program is designed to calculate household income and
 * household expenses and displays as a pie chart
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Household extends JFrame {

    private Font font;
    private int zero_el;
    private int first_el;
    private int second_el;
    private int third_el;
    private int fourth_el;
    private int fifth_el;
    private int sixth_el;
    private int seventh_el;
    private int income; 
   private int MONTHLY_INCOME;
    int house_percent2;
    int house_percent;
    int HOUSING2;
    int HOUSING;
    int travel_percent2;
    int travel_percent;
    int TRAVEL_X2;
    int TRAVEL_X;
    int FOOD_BUDGET2;
    int FOOD_BUDGET;
    int food_percent2;
    int food_percent;
    int CHILD_REARING2;
    int CHILD_REARING;
    int childrear_percent2;
    int childrear_percent;
    int RETIRE2;
    int RETIRE;
    int r_percent2;
    int r_percent;
    int HEALTHCARE2;
    int HEALTHCARE;
    int health_percent2;
    int health_percent;
    int water_Util2;
    int water_Util;
    int gas_Util2;
    int gas_Util;
    int Electric2;
    int Electric;
    int cable2;
    int cable;

    public Household() {

        super("HouseHold Expenses");
        setSize(800, 600);
        setLocation(70, 70);
        show();



           
        ArrayList<Integer> allExpenses = new ArrayList<>();

        // Please put in your monthly income
        try{
        System.out.println("Please enter your monthly income as a whole number, NO DECIMALS: ");
        Scanner in = new Scanner(System.in);
         MONTHLY_INCOME = in.nextInt();
         System.out.println("You entered a monthly income of " + MONTHLY_INCOME);
 
        }
        catch (ArithmeticException ae) {
            System.out.println("Please enter whole number with no decimals");
        }
        catch (InputMismatchException ime) {
            System.out.println("Please enter whole number with no decimals");
        }
        


       
        System.out.println("Is that correct? If yes, please enter Y. If no enter N.");
        Scanner T = new Scanner(System.in);
        String VALIDATE_INCOME = T.next();

          // while(T.hasNext()) {


        if (VALIDATE_INCOME.equals("N") || VALIDATE_INCOME.equals("n")) {

            System.out.println("Please re-enter income");
            Scanner reIN = new Scanner(System.in);
           int MONTHLY_INCOME_RE = reIN.nextInt();
            MONTHLY_INCOME = MONTHLY_INCOME_RE;
            System.out.println("You re-entered your income to be " + MONTHLY_INCOME);
           // System.out.println("Is that correct? Y or n");
            //Scanner T2 = new Scanner(System.in);
          // String VALIDATE_INCOME2 = T2.next();
       // VALIDATE_INCOME = VALIDATE_INCOME2;
            try{
        
        System.out.println("Please enter monthly rent or mortgage Payment: ");
        Scanner h2 = new Scanner(System.in);
         HOUSING2 = h2.nextInt();
        System.out.println("Mortgage/rent: " + HOUSING2);
         house_percent2 = (int)((float) HOUSING2 / MONTHLY_INCOME * 100);
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole number with no decimals");
            }
            try{
        System.out.println("Please enter your monthly travel expenses: ");
        Scanner i2 = new Scanner(System.in);
         TRAVEL_X2 = i2.nextInt();
         travel_percent2 = (int)((float) TRAVEL_X2 / MONTHLY_INCOME * 100);
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole numbers with no decimals");
            }
            try{
        System.out.println("Please enter your monthly food budget: ");
        Scanner j2 = new Scanner(System.in);
         FOOD_BUDGET2 = j2.nextInt();
         food_percent2 = (int)((float) FOOD_BUDGET2 / MONTHLY_INCOME *100);
            }
            catch(InputMismatchException im){
                System.out.println("Please enter whole numbers with no decimals");
            }
            try{
         System.out.println("Please enter your monthly child expenses: ");
            Scanner k2 = new Scanner(System.in);
             CHILD_REARING2 = k2.nextInt();
             childrear_percent2 = (int) ((float) CHILD_REARING2 / MONTHLY_INCOME * 100);
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole numbers with no decimals");
            }
            try{
             System.out.println("What are your monthly Retirement Contributions: ");
            Scanner L2 = new Scanner(System.in);
             RETIRE2 = L2.nextInt();
             r_percent2 = (int) ((float) RETIRE2 / MONTHLY_INCOME* 100 );
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole numbers with no decimals");
            }
            try{
           System.out.println("Your monthly healthcare expenses: ");
            Scanner m2 = new Scanner(System.in);
             HEALTHCARE2 = m2.nextInt();
             health_percent2 =(int) ((float) HEALTHCARE2 / MONTHLY_INCOME* 100 );
            }
            catch(InputMismatchException im){
                System.out.println("Please enter whole numbers with no decimals");
            }
            try{
            System.out.println("What is the monthly cost of your water utility? :");
            Scanner n2 = new Scanner(System.in);
             water_Util2 = n2.nextInt(); // water

            System.out.println("What is the monthly cost of your gas utility? :");
            Scanner o2 = new Scanner(System.in);
             gas_Util2 = o2.nextInt();

            System.out.println("What is the monthly cost of electricity? :");
            Scanner p2 = new Scanner(System.in);
             Electric2 = p2.nextInt();

            System.out.println("What is the monthly cost of your Cable? :");
            Scanner q2 = new Scanner(System.in);
             cable2 = q2.nextInt();
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole numbers with no decimals");
            }
            int Total_Utilities2 = water_Util2 + gas_Util2 + Electric2 + cable2;
            
            System.out.println("Your monthly income is " + MONTHLY_INCOME);
            System.out.println("Your monthly utilities cost " + Total_Utilities2);
            int utils_percent2 =(int) ((float) Total_Utilities2 / MONTHLY_INCOME * 100 ); 
            
            allExpenses.add(house_percent2); //element 0
            allExpenses.add(travel_percent2); //element 1
            allExpenses.add(food_percent2); // element 2
            allExpenses.add(childrear_percent2); // element 3
            allExpenses.add(r_percent2); //element 4
            allExpenses.add(health_percent2); // element 5
            allExpenses.add(utils_percent2); //element 6

              int sum2;
            sum2 = (int) ((float) allExpenses.get(0) + allExpenses.get(1) + allExpenses.get(2) + allExpenses.get(3)
                           + allExpenses.get(4) + allExpenses.get(5) + allExpenses.get(6));
            System.out.println("Sum is equal to " + sum2);

            int TOTAL_EXPENSES2 = HOUSING2 + TRAVEL_X2 + FOOD_BUDGET2 + CHILD_REARING2 + RETIRE2
                    + HEALTHCARE2 + Total_Utilities2;

            System.out.println("Your total expenses are " + TOTAL_EXPENSES2);
            int INCOME_PERCENTAGE2; 
            INCOME_PERCENTAGE2 = (int) ((float) TOTAL_EXPENSES2 / MONTHLY_INCOME * 100);

            System.out.println("Your income percentage is " + INCOME_PERCENTAGE2 + "%.");
            
            if (INCOME_PERCENTAGE2 <= 50) {
               JOptionPane.showMessageDialog(null, "You're doing ok!!");
            } else if (INCOME_PERCENTAGE2 > 51 && INCOME_PERCENTAGE2 <= 75) {
                JOptionPane.showMessageDialog(null,"Be careful!!! Watch your spending.");
            } else if (INCOME_PERCENTAGE2 > 76 && INCOME_PERCENTAGE2 <= 90) {
                JOptionPane.showMessageDialog(null,"Find ways to reduce spending");
            } else if (INCOME_PERCENTAGE2 > 90) {
                JOptionPane.showMessageDialog(null,"Seek Professional help!!!!");

            }

// float income2 =   INCOME_PERCENTAGE2;

            zero_el =  (int) ((float) allExpenses.get(0) * 360 / sum2 ); // * 360 / sum
            first_el = (int) ((float) allExpenses.get(1)  );
            second_el = (int) ((float) allExpenses.get(2)  ); 
            third_el = (int) ((float) allExpenses.get(3) );
            fourth_el = (int) ((float) allExpenses.get(4) );
            fifth_el = (int) ((float) allExpenses.get(5));
            sixth_el = (int) ((float) allExpenses.get(6));
            seventh_el =  ((int)  ((float) 360 - zero_el + first_el + second_el + third_el + fourth_el +  fifth_el +
                    sixth_el - INCOME_PERCENTAGE2));

            
     System.out.println("income is equal to " + income);
            repaint();
        }
        
             //We will now begin putting in expenses.
      else  if (VALIDATE_INCOME.equals("Y") || VALIDATE_INCOME.equals("y")) {
          try{
            System.out.println("Please enter your monthly Rent or Mortgage payment: ");
            Scanner h = new Scanner(System.in);
             HOUSING = h.nextInt();
           // HOUSING2 = HOUSING;
      }
      catch(InputMismatchException im){
          System.out.println("Please enter whole numbers with no decimals");
      }
            System.out.println("rent: " + HOUSING);
             house_percent = (int) ((float) HOUSING / MONTHLY_INCOME * 100);
            System.out.println("income: " + MONTHLY_INCOME);
            System.out.println("housing_percent: " + house_percent);
try{
            System.out.println("Please enter monthly travel expenses: ");
            Scanner i = new Scanner(System.in);
             TRAVEL_X = i.nextInt();
           // TRAVEL_X2 = TRAVEL_X;
             travel_percent =(int) ((float) TRAVEL_X / MONTHLY_INCOME * 100) ;
} catch(InputMismatchException im){
    System.out.println("Please enter whole numbers with no decimals");
}
try{
            System.out.println("Please enter food budget: ");
            Scanner j = new Scanner(System.in);
             FOOD_BUDGET = j.nextInt();
           // FOOD_BUDGET2 = FOOD_BUDGET;
             food_percent =(int) ((float) FOOD_BUDGET / MONTHLY_INCOME * 100);
}catch(InputMismatchException im){
    System.out.println("Please enter whole number with no decimals");
}
            try{
            System.out.println("Please enter your monthly child expenses: ");
            Scanner k = new Scanner(System.in);
             CHILD_REARING = k.nextInt();
            //CHILD_REARING2 = CHILD_REARING;
             childrear_percent = (int) ((float) CHILD_REARING / MONTHLY_INCOME * 100);
            }
            catch(InputMismatchException im) {
                System.out.println("Please enter whole number with no decimals");
            }
            try{
            System.out.println("What are your monthly Retirement Contributions: ");
            Scanner L = new Scanner(System.in);
             RETIRE = L.nextInt();
           // RETIRE2 = RETIRE;
             r_percent = (int) ((float) RETIRE / MONTHLY_INCOME* 100 );
            }
            catch(InputMismatchException im){
                System.out.println("Please enter whole with no decimals");
            }
            try{
            System.out.println("Your monthly healthcare expenses: ");
            Scanner m = new Scanner(System.in);
             HEALTHCARE = m.nextInt();
           // HEALTHCARE2 = HEALTHCARE;
             health_percent =(int) ((float) HEALTHCARE / MONTHLY_INCOME* 100 );
            }
            catch(InputMismatchException im){
                System.out.println("Please enter whole number with no decimal");
            }
            
               try{
            System.out.println("What is the monthly cost of your water utility? :");
            Scanner n = new Scanner(System.in);
             water_Util = n.nextInt(); // water

            System.out.println("What is the monthly cost of your gas utility? :");
            Scanner o = new Scanner(System.in);
             gas_Util = o.nextInt();

            System.out.println("What is the monthly cost of electricity? :");
            Scanner p = new Scanner(System.in);
             Electric = p.nextInt();

            System.out.println("What is the monthly cost of your Cable? :");
            Scanner q = new Scanner(System.in);
             cable = q.nextInt();
               }
               catch(InputMismatchException im){
                   System.out.println("Please enter whole number with no decimals");
               }

            int Total_Utilities = water_Util + gas_Util + Electric + cable;
            //Total_Utilities2 = Total_Utilities;

            System.out.println("Your monthly income is " + MONTHLY_INCOME);
            System.out.println("Your monthly utilities cost " + Total_Utilities);
            int utils_percent =(int) ((float) Total_Utilities / MONTHLY_INCOME * 100 );
          //   utils_percent2 = utils_percent;




            allExpenses.add(house_percent); //element 0
            allExpenses.add(travel_percent); //element 1
            allExpenses.add(food_percent); // element 2
            allExpenses.add(childrear_percent); // element 3
            allExpenses.add(r_percent); //element 4
            allExpenses.add(health_percent); // element 5
            allExpenses.add(utils_percent); //element 6

            int sum;
            sum = (int) ((float) allExpenses.get(0) + allExpenses.get(1) + allExpenses.get(2) + allExpenses.get(3)
                           + allExpenses.get(4) + allExpenses.get(5) + allExpenses.get(6));
            System.out.println("Sum is equal to " + sum);
          //  sum2 = sum;

            int TOTAL_EXPENSES = HOUSING + TRAVEL_X + FOOD_BUDGET + CHILD_REARING + RETIRE
                    + HEALTHCARE + Total_Utilities;
           // TOTAL_EXPENSES2 = TOTAL_EXPENSES;
            
            System.out.println("Your total expenses are " + TOTAL_EXPENSES);

            //Gives you your spending as a percentage

            int INCOME_PERCENTAGE; 
            INCOME_PERCENTAGE = (int) ((float) TOTAL_EXPENSES / MONTHLY_INCOME * 100);
            //INCOME_PERCENTAGE2 = INCOME_PERCENTAGE;

            System.out.println("Your income percentage is " + INCOME_PERCENTAGE + "%.");

            if (INCOME_PERCENTAGE <= 50) {
               JOptionPane.showMessageDialog(null, "You're doing ok!!");
            } else if (INCOME_PERCENTAGE > 51 && INCOME_PERCENTAGE <= 75) {
                JOptionPane.showMessageDialog(null,"Be careful!!! Watch your spending.");
            } else if (INCOME_PERCENTAGE > 76 && INCOME_PERCENTAGE <= 90) {
                JOptionPane.showMessageDialog(null,"Find ways to reduce spending");
            } else if (INCOME_PERCENTAGE > 90) {
                JOptionPane.showMessageDialog(null,"Seek Professional help!!!!");

            }
            //float income =   INCOME_PERCENTAGE;

            zero_el =  (int) ((float) allExpenses.get(0) * 360 / sum ); // * 360 / sum
            first_el = (int) ((float) allExpenses.get(1) );
            second_el = (int) ((float) allExpenses.get(2)  ); 
            third_el = (int) ((float) allExpenses.get(3) );
            fourth_el = (int) ((float) allExpenses.get(4) );
            fifth_el = (int) ((float) allExpenses.get(5) );
            sixth_el = (int) ((float) allExpenses.get(6) );
            seventh_el =  ((int) ( (float) 360 - zero_el + first_el + second_el + third_el + fourth_el +  fifth_el +
                    sixth_el - INCOME_PERCENTAGE));

            
     System.out.println("income is equal to " + income);
            repaint();
        }

    }
    
    
    public void paint(Graphics g) {



        font = new Font("Sanserif", Font.BOLD, 20);

        g.setColor(Color.MAGENTA);
        g.fillArc(130, 100, 320, 320, 0, zero_el);
        g.drawString("Housing", 460, 80);

        g.setColor(Color.red);
        g.fillArc(130, 100, 320, 320, zero_el, first_el);
        g.drawString("Travel", 460, 100);

        g.setColor(Color.blue);
        g.fillArc(130, 100, 320, 320, zero_el + first_el, second_el);
        g.drawString("Food", 460, 120);

        g.setColor(Color.green);
        g.fillArc(130, 100, 320, 320, zero_el + first_el + second_el, third_el);
        g.drawString("Child", 460, 140);

        g.setColor(Color.orange);
        g.fillArc(130, 100, 320, 320, zero_el + first_el + second_el + third_el, fourth_el);
        g.drawString("Retirement", 460, 160);

        g.setColor(Color.darkGray);
        g.fillArc(130, 100, 320, 320, zero_el + first_el + second_el + third_el + fourth_el, fifth_el);
        g.drawString("Health", 460, 180);

        g.setColor(Color.pink);
        g.fillArc(130, 100, 320, 320, zero_el + first_el + second_el + third_el + fourth_el + fifth_el 
                , sixth_el);
        g.drawString("Utilities", 460, 200);
        
        g.setColor(Color.lightGray);
        g.fillArc(130, 100, 320, 320, zero_el + first_el + second_el + third_el + fourth_el + fifth_el + 
                sixth_el, seventh_el);
        g.drawString("Income", 460, 220);

        g.setColor(Color.BLACK);
        g.drawArc(130, 100, 320, 320, 0, 360);
        
       
        
      
            g.drawString("Financial Literacy is Key!!!!", 100, 500);
        
  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here private static final intFRAME_WIDTH = 400;


        Household app = new Household();
        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });


    }
}
