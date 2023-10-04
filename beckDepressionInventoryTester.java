package ClassExcerises.PersonalProjects;

import java.util.Scanner;

public class beckDepressionInventoryTester {
    public static void main (String [] args ){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Beck's Depression Tester. This application will let the doctors know" +
                "if you are at risk of depression and need some extra help.");

        System.out.println("Would you like an explanation of how the test work or would you like to " +
                "skip straight to the test? Please type either 'skip' or 'explain'.");
        String operation = scanner.nextLine();

        boolean repeat = true;

        while (repeat){

            if (operation.equals("explain")) {
            System.out.println("""
                    The Beck Depression Inventory (BDI) is a self administered 21 item self report scale, presented in multiple
                    choice format, designed to detect presence of depression in adolescents and adults, and to measure
                    characteristic attitudes and symptoms of depression independent of any particular theoretical bias.
                    Each of the inventory items corresponds to a specific category of depressive symptom and/or attitude.
                     Each category purports to describe a specific behavioral manifestation of depression and consists of a
                    graded series of four self evaluative statements. The statements are rank ordered and weighted to reflect the
                    range of severity of the symptom from neutral to maximum severity. Numerical Values of zero, one, two,\s
                    or three are assigned to each statement to indicate degree of severity.
                    Adding up the scores for all of the twenty one questions, the single total score is produced indicating\s
                    intensity of the depression.
                    """);

        }else System.out.println("OK, we will start the test now.");

        System.out.println("Please enter values from 0 to 3 for each question");

        System.out.println("""
                Question 1:\s
                0 I do not feel sad.
                1 I feel sad.
                2 I am sad all the time and I can't snap out of it.
                3 I am so sad or unhappy that I can't stand it""");
        int score = scanner.nextInt();

        System.out.println("""
                Question 2:\s
                0 I am not particularly discouraged about the future.
                1 I feel discouraged about the future.
                2 I feel I have nothing to look forward to.
                3 I feel that the future is hopeless and that things cannot improve.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 3:\s
                0 I do not feel like a failure.
                1 I feel I have failed more than the average person.\s
                2 As I look back on my life, all I can see is a lot of failure.
                3 I feel I am a complete failure as a person.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 4:\s
                0 I get as much satisfaction out of things as I used to.
                1 I don't enjoy things the way I used to.
                2 I don't get any real satisfaction out of anything anymore.
                3 I am dissatisfied or bored with""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 5:\s
                0 I don't feel particularly guilty.
                1 I feel guilty a good part of the time.
                2 I feel quite guilty most of the time.
                3 I feel guilty all of the time.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 6:\s
                0 I don't feel I am being punished.
                1 I feel I may be punished.
                2 I expect to be punished.
                3 I feel I am being punished.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 7:\s
                0 I don't feel disappointed in myself.
                1 I am disappointed in myself.
                2 I am disgusted with myself.
                3 I hate myself.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 8:\s
                0 I don't feel I am any worse than anybody else.
                1 I am critical of myself for my weaknesses or mistakes.
                2 I blame myself all the time for my faults.
                3 I blame myself for everything bad that happens.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 9:\s
                0 I don't have any thoughts of killing myself.
                1 I have thoughts of killing myself, but I would not carry them out.
                2 I would like to kill myself.
                3 I would kill myself if I had the chance""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 10:\s
                0 I don't cry any more than usual.
                1 I cry more now than I used to.
                2 I cry all the time now.
                3 I used to be able to cry, but now I can't cry even though I want to.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 11:\s
                0 I am no more irritated by things than I ever am.
                1 I am slightly more irritated now than usual.
                2 I am quite annoyed or irritated a good deal of the time.
                3 I feel irritated all the time now.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 12:\s
                0 I have not lost interest in other people.
                1 I am less interested in other people than I used to be.
                2 I have lost most of my interest in other people.
                3 I have lost all of my interest in other people.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 13:\s
                0 I make decisions about as well as I ever could.
                1 I put off making decisions more than I used to.
                2 I have greater difficulty in making decisions than before.
                3 I can't make decisions at all anymore.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 14:\s
                0 I don't feel that I look any worse than I used to.
                1 I am worried that I am looking old or unattractive.
                2 I feel that there are permanent changes in my appearance that make me look unattractive.
                3 I believe that I look ugly.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 15:\s
                0 I can work about as well as before.
                1 It takes an extra effort to get started at doing something.
                2 I have to push myself very hard to do anything.
                3 I can't do any work at all.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 16:\s
                0 I can sleep as well as usual.
                1 I don't sleep as well as I used to.
                2 I wake up 1-2 hours earlier than usual and find it hard to get back to sleep.
                3 I wake up several hours earlier than I used to and cannot get back to sleep.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 17:\s
                0 I don't get more tired than usual.
                1 I get tired more easily than I used to.
                2 I get tired from doing almost anything.
                3 I am too tired to do anything.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 18:\s
                0 My appetite is no worse than usual.
                1 My appetite is not as good as it used to be.
                2 My appetite is much worse now.
                3 I have no appetite at all anymore.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 19:\s
                (Score 0 if you have been purposely trying to lose weight.)
                0 I haven't lost much weight, if any, lately.
                1 I have lost more than five pounds.
                2 I have lost more than ten pounds.
                3 I have lost more than fifteen pounds.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 20:\s
                0 I am no more worried about my health than usual
                1 I am worried about physical problems such as aches and pains, or upset stomach, or constipation.
                2 I am very worried about physical problems, and it's hard to think of much else.
                3 I am so worried about my physical problems that I cannot think about anything else.""");
        score = score + scanner.nextInt();

        System.out.println("""
                Question 21:\s
                0 I have not noticed any recent change in my interest in sex.
                1 I am less interested in sex than I used to be.
                2 I am much less interested in sex now.
                3 I have lost interested in sex completely.""");
        score = score + scanner.nextInt();

            if (score<5){ System.out.println( "You may be in denial of " +
                    "depression due to an abnormally low score.");
            } else if (score>5 && score<11) {System.out.println("You have no depression.");

            } else if (score>=11 && score<17) {System.out.println("You may have a disturbance " +
                    "in your mood and self care is recommended.");
            } else if (score>= 17 && score<21) {System.out.println("You have borderline clinical depression" +
                    ", please seek support from your network or doctor.");

            } else if (score>=21 && score<31) { System.out.println("You have moderate depression, seek professional" +
                    "help from your doctor.");
            } else if (score>=31 && score<=40) { System.out.println("You have severe depression please seek out the " +
                    "help of your doctor or Psychologist.");

            } else if (score>40) {System.out.println("You have extreme depression and need to go to the hospital.");

            }else System.out.println("There has been an error.");


        System.out.println("Do you want to repeat the program? (yes/no):");
        String repeatChoice = scanner.next();

        if (!repeatChoice.equalsIgnoreCase("yes")) {
            repeat = false;
            System.out.println("End");}
        }
    }
}








