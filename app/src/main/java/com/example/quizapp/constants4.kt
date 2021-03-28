package com.example.quizapp





object Constants4 {


    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "Ryder cup is related to which sports?",
                R.drawable.golf,
                " Polo", "Golf",
                "Badminton", "Tennis", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "Pen Holder grip is used in which of the following sports ?",
                R.drawable.tt,
                "Table Tennis", "Cricket",
                "Hockey", "Football", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "How many medals have been won by the India Men’s Hockey team at the Commonwealth Games till date?",
                R.drawable.ih,
                "2", "8",
                "4", "6", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "When was GAISF formed?",
                R.drawable.gaisf,
                "1919", "1988",
                "2010", "1967", 4
        )

        questionsList.add(que4)

        // 5
        val que5= Question(
                5, "Which of the following did not have broadcasting rights of the 2018 Gold Coast Commonwealth Games?",
                R.drawable.zee,
                "Zee Network", "BBC",
                "Sony Pictures", "ESPN", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Who is the Head Coach of Indian National Football team?",
                R.drawable.ifjpg,
                " Manvir Singh", "Sunil Chettri",
                "Bob Houghton", "Stephen Constantine", 4
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "What is the normal time difference between which both the Summer Olympics and Winter Olympics are held?",
                R.drawable.golf,
                " 8 Years", " 5 Years",
                "  2 Years", "  3 Years", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "Which country became the champion of the first FIFA Women’s Football World Cup was held in 1991?",
                R.drawable.us,
                "India", " United States of America",
                "Norway", "UK", 2
        )

        questionsList.add(que8)


        // 9
        val que9 = Question(
                9, "What is Srikanth Kidambi famous for?",
                R.drawable.badmin,
                "As an Indian hockey player", "As an Indian cricket player",
                "As an Indian badminton player", "As an Indian table tennis player", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "Who is known as the inventor of the Volleyball sport ?",
                R.drawable.voll,
                "James Naismith", "Adrian Carambula",
                "Edward Skorek", "William G. Morgan", 4
        )

        questionsList.add(que10)


        return questionsList
    }
}