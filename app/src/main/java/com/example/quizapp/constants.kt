package com.example.quizapp


object Constants {


    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "The main page of a website is known as",
                R.drawable.website,
                "Home Page", "Content Page",
                "Web Page", "Navigation Page", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "What country does this flag belong to?",
                R.drawable.inflag,
                "INDIA", "Australia",
                "Armenia", "Austria", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, " What are the five colours of the olympic rings?",
                R.drawable.olympic,
                " Blue, yellow, black, green and red", "  Pink, grey, black, green and red",
                " Blue, orange, black, olive and red", " White, yellow, black, purple and red", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "Ajanta and Ellora caves are situated at?",
                R.drawable.ajanta,
                "Mumbai", "Usmanabad",
                "Sri Lanka", "Aurangabad", 4
        )

        questionsList.add(que4)

        // 5
        val que5= Question(
                5, "Which singer was known amongst other things as 'The King of Pop'?",
                R.drawable.mj,
                "Michael Jackson", "James Bond",
                "Micheal Peep", "Austria", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Ctrl, Shift and Alt are called .... keys.",
                R.drawable.keyb,
                "alphanumeric", "function",
                "adjustment", " modifier", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "MS-Word is an example of ___",
                R.drawable.ms,
                "An Operating System", "A processing device",
                " Application software", " An input device", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "A computer cannot boot if it does not have the ___",
                R.drawable.pc,
                "Software", "Operating system",
                "Antivirus", "Assembler", 2
        )

        questionsList.add(que8)


        // 9
        val que9 = Question(
                9, "What is the size of ‘int’?",
                R.drawable.inte,
                "2", "4",
                "Compiler dependent", "8", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "The binary equivalent of 50 is",
                R.drawable.binary,
                "0110.101", "001010.101",
                "110101", "110010", 4
        )

        questionsList.add(que10)


        return questionsList
    }


}


