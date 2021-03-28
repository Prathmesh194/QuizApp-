package com.example.quizapp


object Constants3 {


    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "World’s first cellular system was developed by?",
            R.drawable.cellular,
            "Bellcore and Motorola", "Nippon Telephone and Telegraph (NTT)",
            "AT&T Bell Laboratories", "Qualcomm", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Paging systems could be used to ?",
            R.drawable.pager,
            "Send alphanumeric messages", " Send numeric messages",
            " Voice message", "All of the above", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "'DTP' computer abbreviation usually means ?",
            R.drawable.dtp,
            "DeskTop Publishing", "Data Type Programming",
            "Digital Transmission Protocol", "Document Type Processing", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "  MIN stands for",
            R.drawable.net,
            " Mobile Internet", "None of the above",
            "Mobility In Network ", "Mobile Identification Number", 4
        )

        questionsList.add(que4)

        // 5
        val que5= Question(
            5, "The 2G cellular network uses?",
            R.drawable.two,
            "All of the above", "CDMA/FDD",
            "Digital modulation formats", "TDMA/FDD", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "‘Pioneers’ is a programme of which country’s space agency?",
            R.drawable.pioner,
            " Germany", "India",
            "UK", "USA", 4
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
            8, "Compact discs, (according to the original CD specifications) hold how many minutes of music?",
            R.drawable.cd,
            "64 mins", "74 mins",
            "50 mins", "90 mins", 2
        )

        questionsList.add(que8)


        // 9
        val que9 = Question(
            9, "What does the term PLC stand for?",
            R.drawable.plc,
            "Program List Control", "Piezo Lamp Connector",
            "Programmable Logic Controller", "Programmable Lift Computer", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "FET is a type of transistor, Its full name is ____ Effect Transistor...?",
            R.drawable.fet,
            "Fun", "Force",
            "Flash", "Field", 4
        )

        questionsList.add(que10)


        return questionsList
    }
}