package com.example.iag19_000.inhershoes;

import android.app.Application;

/**
 * Created by Isabel Alvarez and Amanda Murray on 2/17/2018.
 */

public class MyApp extends Application {

    public String field; //it can be A, B, C or D
    public int sitCount = 0; //starts at zero and increases every time a situation is presented
    public int dropCount = 0; //starts at zero and increases every time the user makes a bad decision
    public String currentStatus = ""; //can be good or bad depending on which button was pressed
    public boolean droppingNow = false; //becomes true when more than two bad decisions are made
    public boolean dontWannaDrop = false; // only set when dropping out was just a choice and the user chose no

    //dropping out special strings
    public static final String dropoutSit = "Things are hard and you’re starting to wonder if this is all worth it. Maybe you’re making the wrong choices? Do you wanna give up? \nA) No, I want to keep playing\nB) Yes, I want to start over";
    public static final String dropoutResBad = "The good news this is a game, so you can try again. Wanna try again?";
    public static final String dropoutResGood = "You decide to keep trying. It can’t be that hard, right? Things will get better.";

    //the results for the field selection
    public static final String medChoice = "You decide to pursue medicine. After what felt like hundreds of essays, long nights, and years of waiting for decisions, you finally get the news you’ve been waiting for. You got into to your dream university! You can’t wait to start school in the fall.";
    public static final String techChoice = "You decide to pursue technology. After what felt like hundreds of essays, long nights, and years of waiting for decisions, you finally get the news you’ve been waiting for. You got into to your dream university! You can’t wait to start school in the fall.";
    public static final String edChoice = "You decide to pursue education. After what felt like hundreds of essays, long nights, and years of waiting for decisions, you finally get the news you’ve been waiting for. You got into to your dream university! You can’t wait to start school in the fall.";
    public static final String entChoice = "You decide to pursue entertainment. After what felt like hundreds of essays, long nights, and years of waiting for decisions, you finally get the news you’ve been waiting for. You got into to your dream university! You can’t wait to start school in the fall.";

    //situations for stage 1
    public static final String med1 = "You start studying and preparing for med school, and it’s crazy competitive. What you thought was you trying to get an education so you can do something to help the world turned into a cutthroat game of getting the best test scores and the highest marks. You have to be on top. A guy asks you if you can tutor him in Biology. You’re not sure if he’s pre-med or not, but he’s your friend. What do you do?\nA) Help them\nB) Say you're too busy";
    public static final String tech1 = "It’s finally here: your first day of university! You’re so excited for your Intro to Programming class that you wake up early and rush to the classroom to hang out and meet your new classmates. As you go in, however, you feel a little out of place. All your life you’ve been used to classrooms filled with both guys and girls, but now you’re one of the only girls in a classroom of a hundred. You feel intimidated. Where should you sit?\nA) Sit with the guys\nB) Sit alone";
    public static final String ed1 = "Your semester is going great, and you’re doing really well in classes. You finally have a little bit of time and get an invite to a party from your best friend. Do you go?\n A) No \n B) Yeah!";
    public static final String ent1 = "ent1";

    //situations for stage 2
    public static final String med2 = "You get through your first few years of med and are now ready to choose your specialty. You can follow your dreams of becoming a surgeon or do become a family doctor. As a family doctor, you might have less intense days and more family time, and you’ll look less intimidating, but as a surgeon you’ll follow your dreams as well as making more money. \nA) Go into surgery\nB) Go into family doctoring";
    public static final String tech2 = "As the semester goes on, classes start getting more and more difficult, and you learn that you need to seek out help. You start frequenting office hours, and it really helps you to learn more and to grow academically. On one such trip to office hours, you were asking a question for you math homework and had left your finished science homework open on your laptop. While explaining Euler’s Equation, the TA catches sight of the science homework. He casually points to an answer and says “You got that wrong, by the way. You might want to fix it,”  he says. What? You knew you were right. Not only had you learned this forever ago, but you looked it up to be sure. Before you know it, he starts explaining why his answer is right and your answer is wrong. What do you do?\nA) Stand up for yourself\nB) Focus on math";
    public static final String ed2 = "You’re super swamped with homework and volunteering and studying. Just when you think it can’t get any worse, your best friend reminds you about her early birthday celebration that weekend. You guys were supposed to go the movies and grab dinner as a group, but you really can’t. What do you? Break your bestie’s heart or skip homework?\nA) Sorry bestie \nB) Only one birthday a year....";
    public static final String ent2 = "ent1";

    //situations for stage 3
    public static final String med3 = "After a long students’ shift at the hospital, you get home late at night and look around. Your apartment is a mess. There’s laundry splayed across the floor, and and dirty dishes in the sink, and the garbage clearly hasn’t been taken out in weeks. You know there’s no chance that your significant other will take care of this mess anytime soon, but it’s late and you have stuff to do tomorrow. What do you do?\nA) Go to bed \nB) Clean up";
    public static final String tech3 = "As happens frequently in tech, you had to work in a group on a project. At the very first meeting you sit down to talk about what you want to do and how you want to do it. In a rare turn of events you managed to end up in a group with another girl, who quickly rose up to become the leader of the group. Your group has some great ideas, but they want to go about something the entirely wrong way. When you mention that there’s a better way to do it, they ignore you. What should you do?\nA) Assert yourself\nB) Do it the hard way";
    public static final String ed3 = "After working hard and holding up your grades, you finally got a part-time job tutoring. You finally get to apply the skills you’ve been training and the techniques you’ve been learning! And it’s going great. The kids love you and you see a marked improvement in even the worst student’s understanding and learning. It feels like success, except… one parent disagrees. A mom comes in and yells at you, insisting that you’re teaching her son wrong. How do you respond? \nA) Be honest \nB) Be nice";
    public static final String ent3 = "ent1";

    //situations for stage 4
    public static final String med4 = "Finally, after years and years of school and training and working your butt off, you’re not a full-fledged doctor whose beginning her career. You work for a few months and start to get the flow of the job. One day at the end of a particularly grueling week, you walk in and greet a patient. “Oh,” he says. “You must be the nurse.” Something about it rubbed you the wrong way. That must have been the 4th time that week that somebody assumed you were the nurse. What do you say?\nA) Be direct \nB) Laugh";
    public static final String tech4 = "You did it! Finally! You graduated! Now it’s time to choose your first workplace: Company A, where you could get a huge salary but you’d be the only woman, or Company B where the salary is comparatively meager, but the employees are diverse.\nA) Company A\nB) Company B";
    public static final String ed4 = "Finally after four years of sweat and hard work, you graduate and are ready to start teaching kids. You have a job in a high school and are super excited. Your students are great and your coworkers are supportive. Every morning you have a brief meeting to compare notes and spread encouragement, a tradition you enjoyed. One morning, you noticed that one of the other teachers was wearing a dress that was a little too tight in the chest area. You consider offering to lend her your jacket. What should you do?\nA) Mind your own business \nB) Offer her your jacket";
    public static final String ent4 = "ent1";

    //situations for stage 5
    public static final String med5 = "You’re offered a late shift at the hospital. You know it would look good to work the late shift, but there have been a lot of violent patients lately and you don’t feel comfortable. Should you take the shift and make your boss happy, or should you stay home and feel safe?\nA) Take the shift \nB) Pass on the shift";
    public static final String tech5 = "After a year or so with the company you’ve earned the trust of your higher ups. You’ve been made project manager for a new innovative idea and are super excited to take on a leadership role. A few weeks in, though, you notice that one of your team members isn’t pulling his weight.Should you talk to him about it and risk coming across as bossy? Or pick up the slack?\nA) Pick up the slack\nB) Talk to him";
    public static final String ed5 = "After working for a few years you get comfortable with your coworkers. You become something like a family, with the older women becoming mother-like and sweet. They’re always chiding about how you should have kids soon and telling you that you’re getting old and need to think about these things. What do you say to them? \nA) What kids?\nB) Later";
    public static final String ent5 = "ent1";

    //situations for stage 6
    public static final String med6 = "You and your significant other are starting to feel secure and comfortable in life. You start to think about kids and settling in. Can your career handle that right now? Will you be able to come back or move up after you have kids?\nA) You don't have the time.\nB) You want kids";
    public static final String tech6 = "You’ve hit the stage in life we’re you’re ready to start having children. You and your partner are actively trying, and are beginning to plan your lives out. You talk to your boss and you get it all planned out: You’ll shift to a position where you can work from home and come in once or twice a month to have meetings. You make all the preparations and are just about to go on leave when your boss offers you a promotion-- more vacation, more income, better benefits, everything… except it’ll take more time. You can turn him down and keep your work-from-home position. Which do you do?\nA) Work from home\nB) Take the promotion";
    public static final String ed6 = "You’re leaving a little late one day, heading out well after most of the rest of the teachers and students, when on your way out you spot something strange-- a senior girl coming out of the office of one of the male teachers. Her eyes are red and she’s clearly been crying. She rushes out of the school. When you ask the teacher about it, he says he’d rather not talk about it. What do you do?\nA) It's probably nothing \nB) Tell someone right away.";
    public static final String ent6 = "ent1";

    //results for stage 1
    //good
    public static final String med1good = "You turn him down and he struggles through course. He ends up failing and you earn yourself a reputation of being cold but at least you’re doing well in school";
    public static final String tech1good = "You decide to sit with the guys. Your heart is racing as you walk up to a rowdy bunch and ask if you could sit in an empty seat. You stick out like a sore thumb in your sundress, and you wonder if you’ll fit in. Maybe you can get used to this...";
    public static final String ed1good = "You decide to err on the side of caution, telling your friend that it would look bad it you were out partying when trying to get into work at a school. She’s disappointed but she understands.";
    public static final String ent1good = "ent1";
    //bad
    public static final String med1bad = "You offer to help him twice a week for a few weeks, but he soon starts calling and texting in the middle of the night hoping to get help on homework. The word gets out and you start getting questions and requests from help from all the other students. You wanna help them but it’s hard to keep your grades up and help  them at the same time.";
    public static final String tech1bad = "You decide to sit by yourself in the front row. This is okay, you decide. You can make friends later, and don’t need distractions in class anyway. When the professor tells you to introduce yourself to your neighbor in class, you sit quietly and wait for the time to pass. Then you jump in for day one programming and write a Hello World program. At the end of class you notice people talking to their neighbors, making friends...";
    public static final String ed1bad = "You go to the party and drink a little bit too much. When you wake up in the morning you find pictures of you on facebook with your dress riding up your thighs and your falling off your shoulders. You’re mortified, and hurriedly remove the tags and private your facebook. What if schools had seen that? What school is going to hire a teacher who parties?";
    public static final String ent1bad = "ent1";

    //results for stage 2
    //good
    public static final String med2good = "You decide to follow your dreams and pursue surgery. As a surgeon you get to help hundreds and make a lot of money, but you work long hours and sometimes miss holidays and family time. You intimidate some members of staff as a female surgeon.";
    public static final String tech2good = "You smile and thank him and then close the window with your homework. You feel uncomfortable while you finish your homework, wishing you had stood up for yourself. When you leave, you make note that you should try to find a different TA in the future.";
    public static final String ed2good = "You can’t. You’ve worked so hard and come so far you can’t throw it away for a party now. You can hear the disappointment and heartbreak in your friend’s voice when you break the news. You don’t know how you’ll make this up to her, but you do great on your next tests and your homework is going perfectly.";
    public static final String ent2good = "ent1";
    //bad
    public static final String med2bad = "You decide to become a family doctor. You move back to your home town and work in a small local practice close to your parents’ home. It’s cozy and cute, but you don’t have a lot of ability to move up in the world.";
    public static final String tech2bad = "You interrupt him and tell him and point out that he was in fact wrong, and look up the correct answer. He became very quiet and rushed through the remainder of helping you. You later heard him talking about you to his friends.";
    public static final String ed2bad = "Your best friend only has one birthday a year. You can’t skip her celebration for something like homework! So you go out and have fun, and when you get home you find yourself exhausted and tired and still with a bunch of homework. You decide to just not do a lot of it, and your GPA feels it.";
    public static final String ent2bad = "ent1";


    //results for stage 3
    //good
    public static final String med3good = "You ignore the mess and go to bed, curling up in a ball and getting a good 6 hours of sleep. When you wake up, you rush out the door to run errands and pay bills. When you get home you find your significant other and his mother sitting in the kitchen, which was now spotless. Had you forgotten that she was visiting? Or had she just popped in? Either way, your significant other was ducking his head and she glared at you. Did she blame the mess in the apartment on you?";
    public static final String tech3good = "Maybe it will be harder, you think, but at least your group will be in agreement. So you don’t say anything. You end up spending two or three all-nighters and end with a half-finished product. You got a C on the project.";
    public static final String ed3good = "You smile and nod, and promise the mom to keep that in mind in the future. You feel guilty, and try to adapt to the mother’s wishes, but the students marks soon fell again.";
    public static final String ent3good = "ent1";
    //bad
    public static final String med3bad = "You spend three hours cleaning. It’s tiring and painful, but at the end you have a clean apartment and are able to plop down into bed pleased with yourself. You settle in and curl up, ready for a good night’s sleep, but as you reach to set your alarm you realize that it’s already 2 am. You need to be up at 6….";
    public static final String tech3bad = "You know that the way they want to do it is too difficult and a waste of time. You don’t want to spend hours doing it their way when it could take a quarter as long your way, and you tell them that. While you make a compelling argument, your group recoils from you. The rest of the project is awkward, and you begin to earn a reputation for being difficult.";
    public static final String ed3bad = "Having a mother scream in your face that you need to spend more time teaching her poor little baby math and less time making him practice just pushed you the wrong way. Sternly, you looked at her and told her that you were, in fact, educated in psychology and learning methods, and that her son’s skills were increasing the more he practiced. The mother left angrily, and your company lost her as a client.";
    public static final String ent3bad = "ent1";

    //results for stage 4
    //good
    public static final String med4good = "You smile softly and laugh. “Oh no, I’m the doctor.” you joke. He laughs and you move forward with the appointment, sharing in the amusement of a female doctor.";
    public static final String tech4good = "You choose the option that lets you meet more unique and diverse people. You make loads of new friends, but don’t have much time to spend with them. The salary is low and you consider picking up a second job to cover bills.";
    public static final String ed4good = "You decide to mind your own business and keep it to yourself. You see her throughout the day and everything seems fine. You’re glad you didn’t say anything.";
    public static final String ent4good = "ent1";
    //bad
    public static final String med4bad = "You tell it to him straight, and tell him you’re the doctor. You probably were a little too forward about it, but you were honest. A look crossed his face, morphing from surprise to sheepish to anger. You hold his gaze as you speak to him, moving forward with the appointment. When you leave the room, you hold your head up high and demand respect. In the back of your mind, you wonder if you’d lost him as a patient.";
    public static final String tech4bad = "You follow the money and as you were concerned you feel out of place. You’re often looked down up and sometimes hear people talking about how you’re the affirmative action hire for female diversity. On the bright side you live comfortably and have loads of vacation time, and are able to work on personal projects and learn a lot while you work.";
    public static final String ed4bad = "You offer her your jacket, awkwardly stumbling over the words. You see shame cross her face as she takes your jacket and slips it on over her dress. You don’t see her again, but your jacket is with your stuff at the end of the day.";
    public static final String ent4bad = "ent1";

    //results for stage 5
    //good
    public static final String med5good = "You decide to take the shift. The ER is packed with people left and right, and you have a five-car pile-up coming in from just out of the city. You can’t afford to waste a second of your time. When you go in to check on a victim reporting heart-attack like symptoms, you find a sick wife and an angry husband. As you walk on eggshells through the visit, you feel the husband getting angrier and angrier. You’re worried he’s gonna snap, but you manage to finish up and leave before he does. That seemed close…";
    public static final String tech5good = "You decide to start staying late and picking up the slack. It’s hard work and you don’t get 8 hours of sleep for a few weeks, but at the end of the project you’re able to turn in a brilliant and wonderful project. You’re praised for your leadership and people skills.";
    public static final String ed5good = "You tell them you’re not ready for kids and that you’ll be fine later. They push for details, but let it go eventually.";
    public static final String ent5good = "ent1";
    //bad
    public static final String med5bad = "You tell your boss you can’t pick up the shift this week. You mention casually that somebody stronger should be around in case the trend of violent patients carries through, and he looks at you. You walk out angry at yourself, and aren’t surprised when you’re passed over for future shifts and opportunities in the future.";
    public static final String tech5bad = "You pull him aside on a Monday morning and tell him to step it up, while offering to get him help and resources if he needs them. He improves his productivity for a few days, and everything seems great. That is, until you’re called into your boss’s office on Friday and told to tone it down when dealing with your team members.";
    public static final String ed5bad = "You constantly remind them that you don’t want kids, and that you’re plenty fulfilled by teaching the next generation. Some of them are absolutely appalled, and other insist that you’ll change your mind in the end.";
    public static final String ent5bad = "ent1";

    //results for stage 6
    //good
    public static final String med6good = "You decide to have kids. This proves to be a struggle, and you find it difficult to balance your home and work lives. Often you’ll feel too busy and disconnected from you kid. Your heart especially breaks when your kid gets sick and you have to choose between taking care of them or going and dealing with other sick people.";
    public static final String tech6good = "You decide to turn down the promotion and work from home instead. You’re swamped with bills and aren’t sure how you’ll make ends meet, but at least you get to spend time with your family.";
    public static final String ed6good = "You tell the principal first thing in the morning what you saw and he begins an investigation. He pulls the student out of class and grills her on the happenings of the previous day. She was dealing with the death of a family member and felt connected to the teacher. Being pulled out of class made her more upset and she left school for the day. The teacher was reprimanded for being too close to his students. He almost lost his job.";
    public static final String ent6good = "ent1";
    //bad
    public static final String med6bad = "You decide against having kids right now. And later… and even later. You want them,but you’re just so busy. Sometimes you wonder if you’ll ever get to be anything in life besides your job….";
    public static final String tech6bad = "You decide the costs of having a child are too high and that you need the money. You take the promotion and start working long, hard hours soon. You have plenty of money, but you never get to see your child or significant other.";
    public static final String ed6bad = "You don’t say anything, figuring the student just had something going on or was failing a class or something. It came out later that the teacher had been sexually assaulting students. You feel horrible for not realizing it sooner.";
    public static final String ent6bad = "ent1";

}
