import javax.swing.*;

public class LabActivity{
    public static void main(String[] args) {


     /*   System.out.println("Machine problem 1: ");

        int a = 0;
        int b = 0;

        System.out.println("Enter the value of a= ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b= ");
        b = scanner.nextInt();

        System.out.println("Before Swapping: ");
        System.out.println(" ");
        System.out.println("a = " +  a + " " + "value of b = " + b  );
        System.out.println(" ");

        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping: ");
        System.out.println(" ");
        System.out.println("a = " +  a+ " " + "value of b = " + b  );


        System.out.println();
        System.out.println(" ");



        System.out.println("Machine problem 2: ");

        System.out.print("Enter Diameter: ");
        double diameter = scanner.nextDouble();

        double radius = diameter / 2;
        double circumference = 2 * 3.14 * radius;

        System.out.printf("Radius = " + radius + "\n" + "Circumference = %.2f" ,circumference);
        System.out.println(" ");
        System.out.println(" ");



        System.out.println("Machine problem 3: ");

        System.out.print("Enter Principal: ");
        double p = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double r = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double t = scanner.nextDouble();

        Double simpleInterest = (p*r*t)/100;
        System.out.println("The simple Interest is = "+ simpleInterest);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Machine problem 4: ");

        System.out.print("First Number = ");
        int x = scanner.nextInt();

        System.out.print("Second Number = ");
        int y = scanner.nextInt();

        int result = Math.max(x, y);
        System.out.println("The maximum of two input number is: "+ result);

        System.out.println(" ");
        System.out.println(" ");


        System.out.println("Machine problem 5: ");

        System.out.println("Enter time in minutes: ");
        double minutes = scanner.nextDouble();

        double seconds = minutes * 60;
        System.out.println("Time in seconds is: " + seconds);

        System.out.println(" ");
        System.out.println(" ");

        scanner.close();



        System.out.println("Determining the largest number");
                int num= 0;
                System.out.print("Please enter number 1: ");
                num = scanner.nextInt();

                int num1= 0;
                System.out.print("Please enter number 2: ");
                num1 = scanner.nextInt();

                int num2=0;
                System.out.print("Please enter number 3: ");
                num2 = scanner.nextInt();

                if(num>num1 && num1>num2){
                    System.out.println("Number 1 is largest");
                }
                else if(num1>num && num>num2){
                    System.out.print("Number 2 is largest");
                }
                else{
                    System.out.print("Number 3 is largest");
                }
            }
        }




        System.out.println("Determining ODD, EVEN, OR ZERO");
        int num= 0;
        System.out.print("Please enter your number: ");
        num = scanner.nextInt();

        if(num == 0){
            System.out.println("Your number is ZERO");
        }
        else if(num%2 == 0){
            System.out.println("Your number is EVEN");
        }
        else{
            System.out.println("Your number is ODD");
        }
        }
    }

      */


        String name = "";
        String wifey = "";
        int anniv = 0;

        name = JOptionPane.showInputDialog("What's your name? ");
        wifey = JOptionPane.showInputDialog("Who is your wifey? ");
        anniv = Integer.parseInt(JOptionPane.showInputDialog("You've been married for how many years?"));


        JOptionPane.showMessageDialog(null, "Hello, " + name + "!" + "\n" + "Your wife is: " + wifey + "\n" +
                "And you guys have been married for " + anniv + " years!");
    }
    }

