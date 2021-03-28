package com.example.quizapp


object Constants2 {


    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "What is part of a database that holds only one type of information?",
                R.drawable.db,
                "Report", "Field",
                "Record", "File", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "'DB' computer abbreviation usually means ?",
                R.drawable.db,
                "Database", "Double Byte",
                "Delete Base", "Dead Byte", 1
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
                4, "What does EPROM stand for?",
                R.drawable.eprom,
                "Evaluable Philotic Random Optic Memory", "Electric Programmable Read Only Memory",
                "Every Person Requires One Mind", "Erasable Programmable Read Only Memory", 4
        )

        questionsList.add(que4)

        // 5
        val que5= Question(
                5, "The most common format for a home video recorder is VHS. VHS stands for...?",
                R.drawable.vhs,
                "Video Home System", "Voltage house standard",
                "Video horizontal standard", "Very high speed", 1
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