import java.util.Scanner;
public class Social_media{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User Welcome to the Session!");
        System.out.println("Let's begin our session with Questionnaire...");
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Which social media app do you use most? ");
        String app = sc.nextLine();
        System.out.println("How many hours per day do you spend on that "+app+"?");
        double hours = sc.nextDouble();
        sc.nextLine();
        System.out.println("How much time do you spend on screens in a day? ");
        double overall = sc.nextDouble();
        sc.nextLine();
        System.out.println("What's the purpose of using? \n Options: Work Timepass \n type the answer completely !! ");
        String purpose = sc.nextLine();
        System.out.println("Is it related to your work? ");
        boolean work = sc.nextBoolean();
        System.out.println("Are you feeling distracted which means starting with one purpose and ending with another purpose ?");
        boolean distracting = sc.nextBoolean();
        String Category = "";
        if (age >=5 && age <= 12) Category = "child";
        else if (age >=13 && age <= 19) Category = "teenagers";
        else if (age >= 20 && age <= 25) Category = "young";
        else if (age >= 26 && age <= 50) Category = "adult";
        else if (age > 50 && age <= 200) Category = "Senior_citizen";
        else Category = "God or Ghost";

        switch(Category) {
            case "child":
                if(hours <= 1 && purpose.equalsIgnoreCase("Work") && overall <= 2 && work == true && distracting == false){
                    System.out.println("Congratulations! My dear little champion You have been a Limited Time Social Media Master");
                    System.out.println("We hope that you can continue to do the same in the future");
                }
                else{
                    System.out.println("Hi there, friend! \n" + //
                                                "You have been using the phone or tablet for a long time today.\n" + //
                                                "Looking at screens too much can make your eyes hurt, your head tired, and make it hard to sleep. 😴\n" + //
                                                "\n" + //
                                                "It is time to take a little break! \n" + //
                                                "You can play, draw, go outside, or do something fun without a screen.\n" + //
                                                "\n" + //
                                                "You're super smart and strong! \n" + //
                                                "Let us try to use screens for just a short time tomorrow, okay? \n" + //
                                                "\n" + //
                                                "");
                }
                break;
            case "teenagers" :
                if(hours <= 2 && purpose.equalsIgnoreCase("Work") && overall <= 4 && work == true && distracting == false){
                    System.out.println("Congratulations! My dear Focus Master You have used social meadia smartly-not too much, not too little. You have proved you are not just scrolling you are in your control");
                    System.out.println("But hey don't let scroll take over. Keep your purpose clear and your time in check");
                }
                else{
                    System.out.println(" Hey! Looks like your screen time is getting a little too high.\n" + //
                                                "Too much scrolling can tire your brain, mess with your sleep, and make it harder to focus.\n" + //
                                                "\n" + //
                                                "Remember: You are in charge of your time — not your feed. \n" + //
                                                "\n" + //
                                                "Let us take a break and reset. You have got way more power than the scroll. ");
                    System.out.println("🎯 Small changes = Big results.\n" + //
                                                "You do not have to quit everything — just take control.\n" + //
                                                "Your time is gold, and your focus is your real superpower.\n" + //
                                                "\n" + //
                                                "Stay sharp. Stay balanced. You have got this. ");
                    System.out.println("Anti-Scrolling / Focus Apps:\n" + //
                                                "Forest  - Grow a tree while staying off your phone — perfect for focus & motivation\n" + //
                                                "StayFree  - Tracks screen usage, sends alerts, blocks apps\n" + //
                                                "Focus To-Do  - Combines Pomodoro timer + task list\n" + //
                                                "Digital Wellbeing (Android)  - Built-in tracker and app limits\n" + //
                                                "Screen Time (iOS)  - Set daily limits per app and schedule downtime\n" + //
                                                "One Sec - Delays opening of addictive apps to make you pause and think");
                    System.out.println("Daily Habits\n" + //
                                                " Set app time limits using phone settings (start with 1-hour limits)\n" + //
                                                "\n" + //
                                                " Turn off non-essential notifications — especially social media\n" + //
                                                "\n" + //
                                                " Keep your phone away during meals & study\n" + //
                                                "\n" + //
                                                " Replace 30 min of scrolling with a hobby (music, drawing, journaling)\n" + //
                                                "\n" + //
                                                "Try \"No Screen\" hours — e.g. 9pm to 8am\n" + //
                                                "\n" + //
                                                " Listen to audiobooks or podcasts instead of passive scrolling");
                    System.out.println("Sleep Protection\n" + //
                                                "Use blue light filters or Night Mode after 7 to 8 PM\n" + //
                                                "\n" + //
                                                "Charge your phone outside your bedroom to avoid late-night use");
                }
                break;
            case "young" :
                if(hours <= 3 && purpose.equalsIgnoreCase("Work") && overall <= 6 && work == true && distracting == false){
                    System.out.print(" Smart Scroller!\n" + //
                                                "You focused where it mattered and used your time wisely. \n" + //
                                                "Balance is your superpower — keep leveling up in real life too! ");
                }
                else if(hours >= 3 && overall <=10 && work == true){
                    System.out.println(" Hey there, Digital Pro!\n" + //
                                                "You have been using social media for long hours — and we know it is work-related.\n" + //
                                                "But here is the truth: Even productive screen time can take a toll on your health.\n" + //
                                                "\n" + //
                                                "Too much scrolling — even for work — can lead to:\n" + //
                                                "\n" + //
                                                "Mental fatigue \n" + //
                                                "\n" + //
                                                "Eye strain \n" + //
                                                "\n" + //
                                                "Poor posture & back pain \n" + //
                                                "\n" + //
                                                "Sleep issues \n" + //
                                                "\n" + //
                                                "Increased anxiety & attention loss \n" + //
                                                "\n" + //
                                                "Let us fix this — not by quitting, but by balancing. ");
                    System.out.println("Healthy Day Schedule for Work-Based Screen Users Like you..");
                    System.out.println("7:00 to 8:00 AM      Wake up, screen-free start (walk, water, stretch)\n" + //
                                                "8:00 to 9:00 AM     Begin work — focus on deep tasks first\n" + //
                                                "9:00 to 9:10 AM     Short break: Look away from screen\n" + //
                                                "9:10 to 11:00 AM   Work block 2 : social media only if essential\n" + //
                                                "11:00 to 11:10 AM   Tea/stretch break (no phone)\n" + //
                                                "11:10 to 1:00 PM    Task time\n" + // 
                                                "1:00 to 2:00 PM	 Lunch but try to go screen-free\n" + //
                                                "2:00 to 5:00 PM	Afternoon session : use focus tools" + //
                                                "5:00 to 6:00 PM	 Physical activity or hobby" + //
                                                "6:00 to 8:00 PM	Light digital work/check-ins" + //
                                                "8:00 to 9:00 PM	 Digital detox time (read, relax, walk)" + //
                                                "9:00 to 10:00 PM	 Wind down to avoid screens 1 hour before sleep");
                    System.out.println(" Precautions While Using Social Media for Work\n" + //
                                                " Use Purposefully: Open social media only when it serves a direct work task.\n" + //
                                                "\n" + //
                                                " Time-Box Your Tasks: Use the Pomodoro technique (e.g., 25 min focus, 5 min break).\n" + //
                                                "\n" + //
                                                " Blue Light Filter: Always use Night Mode or blue light filters after sunset.\n" + //
                                                "\n" + //
                                                " Turn Off Non-Work Notifications: Avoid alerts from entertainment or distractions.\n" + //
                                                "\n" + //
                                                " Unfollow/Mute Irrelevant Content: Keep your feed clean and professional.\n" + //
                                                "\n" + //
                                                " 20-20-20 Rule: Every 20 mins, look at something 20 feet away for 20 seconds to rest your eyes.\n" + //
                                                "\n" + //
                                                "");
                    System.out.println("Suggestions to Maintain Focus & Health\n" + //
                                                "Apps to Help:\n" + //
                                                "\n" + //
                                                "Headspace or Calm for mindful breaks\n" + //
                                                "\n" + //
                                                "StayFocusd or Freedom  block distracting sites\n" + //
                                                "\n" + //
                                                "RescueTime  track screen usage\n" + //
                                                "\n" + //
                                                "Forest  grow a tree while focusing\n" + //
                                                "\n" + //
                                                "Ergonomic Tools:\n" + //
                                                "\n" + //
                                                "Use a laptop stand and external keyboard\n" + //
                                                "\n" + //
                                                "Get a blue light screen protector\n" + //
                                                "\n" + //
                                                "Sit on a chair that supports your back");
                    System.out.println("Mental Health Tips:\n" + //
                                                "\n" + //
                                                "Do not doomscroll when you are tired — take real breaks\n" + //
                                                "\n" + //
                                                "Try journaling your daily screen habits for 1 week\n" + //
                                                "\n" + //
                                                "Add a small ritual: meditation, gratitude, or evening walk\n" + //
                                                "\n" + //
                                                "Final Motivation Message:\n" + //
                                                "You're doing incredible work in a digital world.\n" + //
                                                "Just do not let the screen own your energy — you deserve to feel clear, calm, and in control.\n" + //
                                                "Work smart. Rest right. You have got this. ");
                }
                else{
                    System.out.println(" Hey, take a pause.\n" + //
                                                "Social media is starting to take more from you than it gives.\n" + //
                                                "You are scrolling more, and focusing less — and deep down, you know it.\n" + //
                                                "\n" + //
                                                "But here is the truth: You are stronger than the scroll.\n" + //
                                                "\n" + //
                                                "You have dreams, goals, and a future that deserves your full energy. \n" + //
                                                "\n" + //
                                                "Start small — 10 minutes less today, more focus tomorrow.\n" + //
                                                "Choose your time. Choose your mind. You are in control. ");
                }
                break;
            case "adult" :
                if(hours <= 3 && purpose.equalsIgnoreCase("Work") && overall <= 6 && work == true && distracting == false){
                    System.out.println(" Smart Navigator!\n" + //
                                                "You are steering your digital time with focus and intention.\n" + //
                                                "Balance looks good on you. ");
                }
                else if(hours >= 3 && overall <=10 && work == true){
                    System.out.println("Hey there, Digital Pro!\n" + //
                                                "You have been using social media for long hours — and we know it is work-related.\n" + //
                                                "But here is the truth: Even productive screen time can take a toll on your health.\n" + //
                                                "\n" + //
                                                "Too much scrolling — even for work — can lead to:\n" + //
                                                "\n" + //
                                                "Mental fatigue \n" + //
                                                "\n" + //
                                                "Eye strain \n" + //
                                                "\n" + //
                                                "Poor posture & back pain \n" + //
                                                "\n" + //
                                                "Sleep issues \n" + //
                                                "\n" + //
                                                "Increased anxiety & attention loss \n" + //
                                                "\n" + //
                                                "Let us fix this — not by quitting, but by balancing. ");
                    System.out.println("Healthy Day Schedule for Work-Based Screen Users Like you..");
                    System.out.println("7:00 to 8:00 AM      Wake up, screen-free start (walk, water, stretch)\n" + //
                                                "8:00 to 9:00 AM     Begin work — focus on deep tasks first\n" + //
                                                "9:00 to 9:10 AM     Short break: Look away from screen\n" + //
                                                "9:10 to 11:00 AM   Work block 2 : social media only if essential\n" + //
                                                "11:00 to 11:10 AM   Tea/stretch break (no phone)\n" + //
                                                "11:10 to 1:00 PM    Task time\n" + // 
                                                "1:00 to 2:00 PM	 Lunch but try to go screen-free\n" + //
                                                "2:00 to 5:00 PM	Afternoon session : use focus tools" + //
                                                "5:00 to 6:00 PM	 Physical activity or hobby" + //
                                                "6:00 to 8:00 PM	Light digital work/check-ins" + //
                                                "8:00 to 9:00 PM	 Digital detox time (read, relax, walk)" + //
                                                "9:00 to 10:00 PM	 Wind down to avoid screens 1 hour before sleep");
                    System.out.println(" Precautions While Using Social Media for Work\n" + //
                                                " Use Purposefully: Open social media only when it serves a direct work task.\n" + //
                                                "\n" + //
                                                " Time-Box Your Tasks: Use the Pomodoro technique (e.g., 25 min focus, 5 min break).\n" + //
                                                "\n" + //
                                                " Blue Light Filter: Always use Night Mode or blue light filters after sunset.\n" + //
                                                "\n" + //
                                                " Turn Off Non-Work Notifications: Avoid alerts from entertainment or distractions.\n" + //
                                                "\n" + //
                                                " Unfollow/Mute Irrelevant Content: Keep your feed clean and professional.\n" + //
                                                "\n" + //
                                                " 20-20-20 Rule: Every 20 mins, look at something 20 feet away for 20 seconds to rest your eyes.\n" + //
                                                "\n" + //
                                                "");
                    System.out.println("Suggestions to Maintain Focus & Health\n" + //
                                                "Apps to Help:\n" + //
                                                "\n" + //
                                                "Headspace or Calm for mindful breaks\n" + //
                                                "\n" + //
                                                "StayFocusd or Freedom  block distracting sites\n" + //
                                                "\n" + //
                                                "RescueTime  track screen usage\n" + //
                                                "\n" + //
                                                "Forest  grow a tree while focusing\n" + //
                                                "\n" + //
                                                "Ergonomic Tools:\n" + //
                                                "\n" + //
                                                "Use a laptop stand and external keyboard\n" + //
                                                "\n" + //
                                                "Get a blue light screen protector\n" + //
                                                "\n" + //
                                                "Sit on a chair that supports your back");
                    System.out.println("Mental Health Tips:\n" + //
                                                "\n" + //
                                                "Do not doomscroll when you are tired — take real breaks\n" + //
                                                "\n" + //
                                                "Try journaling your daily screen habits for 1 week\n" + //
                                                "\n" + //
                                                "Add a small ritual: meditation, gratitude, or evening walk\n" + //
                                                "\n" + //
                                                "Final Motivation Message:\n" + //
                                                "You're doing incredible work in a digital world.\n" + //
                                                "Just do not let the screen own your energy — you deserve to feel clear, calm, and in control.\n" + //
                                                "Work smart. Rest right. You have got this. ");                            
                }
                else{
                    System.out.println("Heads Up, Time to Rebalance\n" + //
                                                "Your screen time is starting to take over.\n" + //
                                                "Take a step back, breathe, and reclaim your focus.\n" + //
                                                "You have got more to do — offline too. \n" + //
                                                "\n" + //
                                                "");
                }
                break;
            case "Senior_citizen" :
                if(hours <= 1 && purpose.equalsIgnoreCase("Work") && overall <= 2 && work == true && distracting == false){
                    System.out.println("Graceful Scroller!\n" + //
                                                "You are using technology wisely and with heart.\n" + //
                                                "Your balance is a beautiful example. \n" + //
                                                "\n" + //
                                                "");                            
                }
                else if(hours >= 3 && overall <=10 && work == true){
                    System.out.println("A Gentle Reminder\n" + //
                                                "You have been online quite a lot — and while it’s for work, your well-being matters too.\n" + //
                                                "Even short breaks help your eyes, posture, and peace of mind.\n" + //
                                                "\n" + //
                                                "Here are a few simple ways to protect your health:\n" + //
                                                "\n" + //
                                                "Follow the 20-20-20 rule: Every 20 minutes, look at something 20 feet away for 20 seconds.\n" + //
                                                "\n" + //
                                                "Sit with support: Keep your back straight and feet flat on the floor.\n" + //
                                                "\n" + //
                                                "Take screen-free evenings to relax your mind and improve sleep.\n" + //
                                                "\n" + //
                                                "Stretch every hour: Gently move your neck, shoulders, and wrists.\n" + //
                                                "\n" + //
                                                "Avoid unnecessary scrolling — not all screen time is productive.\n" + //
                                                "\n" + //
                                                "Take care of yourself — your wisdom and energy are too valuable to burn out. ");
                }
                else{
                    System.out.println("A Gentle Nudge\n" + //
                                                "Too much scrolling can quietly steal your time and energy.\n" + //
                                                "Step back, breathe, and refocus on what truly matters. ");
                }
                break;
            case "God or Ghost" :
                System.out.println("No comments it's your wish but take care of your health too");
                break;
            default:
                System.out.println("Screen time alert: It looks like your usage is above healthy limits. Try to take regular breaks and stay mindful. Your time and health matter. 🌿📱");
                break;
        }
        sc.close();
    }
}