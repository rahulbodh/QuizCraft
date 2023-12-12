package com.example.quizcraft;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {


        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of questionList class and pass a questions along with options and answers;
        final QuestionsList javaquestion1 = new QuestionsList("What is the primary purpose of Java?",
                "Web development", "Mobile development", "Game development", "Platform-independent programming",
                "Platform-independent programming", "");

        final QuestionsList javaquestion2 = new QuestionsList("What is the difference between JDK and JRE?",
                "JDK is for development, JRE is for execution", "JRE is for development, JDK is for execution",
                "They are the same", "None of the above",
                "JDK is for development, JRE is for execution", "");

        final QuestionsList javaquestion3 = new QuestionsList("What is the keyword used to define a constant in Java?",
                "constant", "final", "static", "const",
                "final", "");

        final QuestionsList javaquestion4 = new QuestionsList("What is the purpose of the 'static' keyword in Java?",
                "To create an instance of a class", "To make a variable or method belong to the class rather than an instance",
                "To allow a class to inherit from another class", "To define a constant variable",
                "To make a variable or method belong to the class rather than an instance", "");

        final QuestionsList javaquestion5 = new QuestionsList("What is the Java Virtual Machine (JVM)?",
                "A physical machine", "A software-based machine that runs Java bytecode",
                "A compiler", "An interpreter",
                "A software-based machine that runs Java bytecode", "");

        final QuestionsList javaquestion6 = new QuestionsList("What is the purpose of the 'super' keyword in Java?",
                "To call the superclass' constructor", "To define a constant variable",
                "To refer to the current instance of the class", "To call a method in the subclass",
                "To call the superclass' constructor", "");

        final QuestionsList javaquestion7 = new QuestionsList("What is an interface in Java?",
                "A class that cannot be instantiated", "A way to achieve multiple inheritance in Java",
                "A design pattern", "A collection of constants",
                "A way to achieve multiple inheritance in Java", "");

        final QuestionsList javaquestion8 = new QuestionsList("What is the 'this' keyword used for in Java?",
                "To refer to the current instance of the class", "To create a new instance of a class",
                "To call a method in the superclass", "To define a constant variable",
                "To refer to the current instance of the class", "");

        final QuestionsList javaquestion9 = new QuestionsList("What is the purpose of the 'try', 'catch', and 'finally' blocks in exception handling?",
                "To terminate the program", "To catch and handle exceptions",
                "To define a constant variable", "To create new instances of classes",
                "To catch and handle exceptions", "");

        final QuestionsList javaquestion10 = new QuestionsList("What is the difference between '=='' and '.equals()' in Java?",
                "They are the same", "'==' compares object references, '.equals()' compares object content",
                "'.equals()' compares object references, '==' compares object content", "Both compare object content",
                "'==' compares object references, '.equals()' compares object content", "");


        // add all questions to the listView
        questionsLists.add(javaquestion2);
        questionsLists.add(javaquestion1);
        questionsLists.add(javaquestion9);
        questionsLists.add(javaquestion3);
        questionsLists.add(javaquestion4);
        questionsLists.add(javaquestion5);
        questionsLists.add(javaquestion6);
        questionsLists.add(javaquestion8);
        questionsLists.add(javaquestion10);
        questionsLists.add(javaquestion7);

        return questionsLists;


    }
    private static List<QuestionsList> htmlQuestions() {


        final List<QuestionsList> questionsLists = new ArrayList<>();

        //create object of questionList class and pass a questions along with options and answers;
        final QuestionsList hquestion1 = new QuestionsList("What does HTML stand for?",
                "Hyper Text Markup Language", "Highly Typed Machine Learning",
                "Hyperlink and Text Markup Language", "Home Tool Markup Language",
                "Hyper Text Markup Language", "");

        final QuestionsList hquestion2 = new QuestionsList("Which HTML tag is used to define an unordered list?",
                "<ul>", "<ol>", "<li>", "<dl>",
                "<ul>", "");

        final QuestionsList hquestion3 = new QuestionsList("What does the HTML tag <a> stand for?",
                "Anchor", "Action", "Attribute", "Audio",
                "Anchor", "");

        final QuestionsList hquestion4 = new QuestionsList("What is the correct HTML tag for inserting a line break?",
                "<br>", "<lb>", "<break>", "<newline>",
                "<br>", "");

        final QuestionsList hquestion5 = new QuestionsList("Which HTML tag is used to define the structure of an HTML document?",
                "<html>", "<head>", "<body>", "<doctype>",
                "<html>", "");

        final QuestionsList hquestion6 = new QuestionsList("In HTML, which attribute is used to provide additional information about an element?",
                "class", "style", "id", "src",
                "class", "");

        final QuestionsList hquestion7 = new QuestionsList("What is the purpose of the HTML <head> element?",
                "To define the body of the document", "To define a header for the document",
                "To provide metadata about the document", "To create a hyperlink",
                "To provide metadata about the document", "");

        final QuestionsList hquestion8 = new QuestionsList("Which HTML tag is used to define a hyperlink?",
                "<link>", "<href>", "<a>", "<hyperlink>",
                "<a>", "");

        final QuestionsList hquestion9 = new QuestionsList("What does the HTML tag <img> stand for?",
                "Image", "Inline", "Input", "Internet",
                "Image", "");

        final QuestionsList hquestion10 = new QuestionsList("Which HTML element is used to define a table?",
                "<table>", "<tr>", "<td>", "<th>",
                "<table>", "");


        // add all questions to the listView
        questionsLists.add(hquestion1);
        questionsLists.add(hquestion2);
        questionsLists.add(hquestion3);
        questionsLists.add(hquestion4);
        questionsLists.add(hquestion5);
        questionsLists.add(hquestion6);
        questionsLists.add(hquestion7);
        questionsLists.add(hquestion8);
        questionsLists.add(hquestion9);
        questionsLists.add(hquestion10);

        return questionsLists;


    }

    private static List<QuestionsList> pythonQuestions(){

        final  List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList pquestion1 = new QuestionsList("What is Python?",
                "A snake species", "A programming language",
                "A type of food", "A game",
                "A programming language", "");

        final QuestionsList pquestion2 = new QuestionsList("Which of the following is a correct way to comment in Python?",
                "// This is a comment", "# This is a comment",
                "<!-- This is a comment -->", "/* This is a comment */",
                "# This is a comment", "");

        final QuestionsList pquestion3 = new QuestionsList("What is the purpose of the 'print' function in Python?",
                "To read user input", "To define a variable",
                "To display output", "To create a loop",
                "To display output", "");

        final QuestionsList pquestion4 = new QuestionsList("Which data type is used to represent whole numbers in Python?",
                "float", "string", "int", "boolean",
                "int", "");

        final QuestionsList pquestion5 = new QuestionsList("How do you declare a list in Python?",
                "list = [1, 2, 3]", "array = [1, 2, 3]",
                "set = {1, 2, 3}", "tuple = (1, 2, 3)",
                "list = [1, 2, 3]", "");

        final QuestionsList pquestion6 = new QuestionsList("What is the purpose of the 'if' statement in Python?",
                "To define a loop", "To handle exceptions",
                "To perform conditional execution", "To declare a function",
                "To perform conditional execution", "");

        final QuestionsList pquestion7 = new QuestionsList("Which operator is used for exponentiation in Python?",
                "^", "*", "**", "//",
                "**", "");

        final QuestionsList pquestion8 = new QuestionsList("What is the purpose of the 'len' function in Python?",
                "To convert data types", "To find the length of a sequence",
                "To perform arithmetic operations", "To define a variable",
                "To find the length of a sequence", "");

        final QuestionsList pquestion9 = new QuestionsList("What is the difference between '==' and 'is' in Python?",
                "'==' compares object identity, 'is' compares object values",
                "'is' compares object identity, '==' compares object values",
                "They are the same", "None of the above",
                "'is' compares object identity, '==' compares object values", "");

        final QuestionsList pquestion10 = new QuestionsList("What is the purpose of the 'for' loop in Python?",
                "To perform conditional execution", "To define a function",
                "To iterate over a sequence", "To handle exceptions",
                "To iterate over a sequence", "");



        // add all questions to the listView
        questionsLists.add(pquestion1);
        questionsLists.add(pquestion2);
        questionsLists.add(pquestion3);
        questionsLists.add(pquestion4);
        questionsLists.add(pquestion5);
        questionsLists.add(pquestion6);
        questionsLists.add(pquestion7);
        questionsLists.add(pquestion8);
        questionsLists.add(pquestion9);
        questionsLists.add(pquestion10);

        return questionsLists;






    }

    private static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList aquestion1 = new QuestionsList("What is Android?",
                "A programming language", "An operating system",
                "A hardware device", "A software development tool",
                "An operating system", "");

        final QuestionsList aquestion2 = new QuestionsList("Which programming language is primarily used for Android app development?",
                "Java", "C#", "Python", "Swift",
                "Java", "");

        final QuestionsList aquestion3 = new QuestionsList("What is an Activity in Android?",
                "A task to perform", "A user interface component",
                "A background service", "A network connection",
                "A user interface component", "");

        final QuestionsList aquestion4 = new QuestionsList("What is an APK in the context of Android?",
                "Android Package Kit", "Application Package Kit",
                "Android Programming Kit", "Application Processing Kit",
                "Android Package Kit", "");

        final QuestionsList aquestion5 = new QuestionsList("Which XML-based language is used to declare the layout of Android UI elements?",
                "HTML", "XAML", "XML", "JSON",
                "XML", "");

        final QuestionsList aquestion6 = new QuestionsList("What is the purpose of the AndroidManifest.xml file?",
                "Define the app's user interface", "Specify the app's permissions and components",
                "Handle user interactions", "Manage database operations",
                "Specify the app's permissions and components", "");

        final QuestionsList aquestion7 = new QuestionsList("What is the main building block of an Android application?",
                "Service", "Activity", "Intent", "Layout",
                "Activity", "");

        final QuestionsList aquestion8 = new QuestionsList("What is the role of an Intent in Android?",
                "To display notifications", "To perform background tasks",
                "To initiate communication between components", "To manage databases",
                "To initiate communication between components", "");

        final QuestionsList aquestion9 = new QuestionsList("What is the purpose of the 'adb' tool in Android development?",
                "An Android database tool", "An Android debug bridge for communication with devices",
                "An Android design tool", "An Android deployment tool",
                "An Android debug bridge for communication with devices", "");

        final QuestionsList aquestion10 = new QuestionsList("What is the Android Gradle Plugin used for?",
                "Building Android apps", "Testing Android apps",
                "Debugging Android apps", "Deploying Android apps",
                "Building Android apps", "");


        // add all questions to the listView
        questionsLists.add(aquestion1);
        questionsLists.add(aquestion2);
        questionsLists.add(aquestion3);
        questionsLists.add(aquestion4);
        questionsLists.add(aquestion5);
        questionsLists.add(aquestion6);
        questionsLists.add(aquestion7);
        questionsLists.add(aquestion8);
        questionsLists.add(aquestion9);
        questionsLists.add(aquestion10);

        return questionsLists;
    }



    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        if ("java".equals(selectedTopicName)) {
            return javaQuestions();
        } else if ("android".equals(selectedTopicName)) {
            return androidQuestions();
        } else if ("python".equals(selectedTopicName)) {
            return pythonQuestions();
        } else {
            return htmlQuestions();
        }
    }

}
