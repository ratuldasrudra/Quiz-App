package com.ratul.myquizapp

object Constants {


    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.india, "Argentina", "India",
            "United States of America", "Japan",
            2

        )
        questionsList.add(ques1)



        val ques2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.china, "India", "Japan",
            "United States of America", "China",
            4

        )
        questionsList.add(ques2)


        val ques3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.japan, "India", "Japan",
            "Egypt", "United States of America",
            2

        )
        questionsList.add(ques3)


        val ques4 = Question(
            4, "Which famous landmark is shown in the image?",
            R.drawable.colosseum, "Eiffel Tower", "Burj Khalifa",
            "Colosseum", "Empire State Building",
            3

        )
        questionsList.add(ques4)


        val ques5 = Question(
            5, "Identify the animal shown in the image.",
            R.drawable.squirrel, "Leopard", "Squirrel",
            "Lion", "Lemur",
            2

        )
        questionsList.add(ques5)


        val ques6 = Question(
            6, "Identify the famous bridge shown in the image.",
            R.drawable.golden_gate_bridge, "Brooklyn Bridge", "Tower Bridge",
            "Sydney Harbour Bridge", "Golden Gate Bridge",
            4

        )
        questionsList.add(ques6)


        val ques7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.united_states_of_america, "Japan", "India",
            "United States of America", "China",
            3

        )
        questionsList.add(ques7)


        val ques8 = Question(
            8, "Identify the currency shown in the image.",
            R.drawable.us_dollar, "Yen", "Dollar",
            "Euro", "Swiss Franc",
            2

        )
        questionsList.add(ques8)


        val ques9 = Question(
            9, "Identify the animal shown in the image.",
            R.drawable.lemur, "Lemur", "Leopard",
            "Rhinoceros", "Polar Bear",
            1

        )
        questionsList.add(ques9)


        val ques10 = Question(
            10, "Which planet is depicted in the image?",
            R.drawable.uranus, "Jupiter", "Uranus",
            "Mars", "Saturn",
            2

        )
        questionsList.add(ques10)


        val ques11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.egypt, "China", "Egypt",
            "Argentina", "Japan",
            2

        )
        questionsList.add(ques11)



        val ques12 = Question(
            12, "Which city is known as 'the City of Love'?",
            R.drawable.paris_city_of_love, "Paris", "Venice",
            "Rome", "Cairo",
            1

        )
        questionsList.add(ques12)

        val ques13 = Question(
            13, "What is the tallest mountain in the world?",
            R.drawable.mount_everest, "Mount Kilimanjaro", "Mount Everest",
            "Mount Fuji", "Mount McKinley",
            2

        )
        questionsList.add(ques13)

        val ques14 = Question(
            14, "What is the chemical symbol for water?",
            R.drawable.water, "Wa", "CO2",
            "H2O", "HO",
            3

        )
        questionsList.add(ques14)

        val ques15 = Question(
            15, "Who is known as the 'Father of Computers'?",
            R.drawable.computer, "Bill Gates", "Steve Jobs",
            "Alan Turing", "Charles Babbage",
            4

        )
        questionsList.add(ques15)

        val ques16 = Question(
            16, "Which planet is known as the 'Red Planet'?",
            R.drawable.mars, "Jupiter", "Venus",
            "Mars", "Saturn",
            3

        )
        questionsList.add(ques16)

        val ques17 = Question(
            17, "What is the chemical symbol for gold?",
            R.drawable.gold, "Au", "Ag",
            "Fe", "Hg",
            1

        )
        questionsList.add(ques17)

        val ques18 = Question(
            18, "What is the pH value of a neutral solution?",
            R.drawable.ph, "0", "7",
            "14", "-1",
            2

        )
        questionsList.add(ques18)

        val ques19 = Question(
            19, "Which gas is most abundant in the Earth's atmosphere?",
            R.drawable.nitrogen, "Oxygen (O2)", "Carbon dioxide (CO2)",
            "Nitrogen (N2)", "Hydrogen (H2)",
            3

        )
        questionsList.add(ques19)

        val ques20 = Question(
            20, "What is the lightest element on the periodic table?",
            R.drawable.periodic_table, "Hydrogen (H)", "Helium (He)",
            "Lithium (Li)", "Neon (Ne)",
            1

        )
        questionsList.add(ques20)


        return questionsList
    }


}