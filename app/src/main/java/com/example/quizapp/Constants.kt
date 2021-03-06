package com.example.quizapp

import eu.tutorials.quizapp.R
import java.util.*
import kotlin.collections.ArrayList


object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        var questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What brand is this icon from?",
            R.drawable.nike,
            "Checkers", "Checkmate",
            "Nike", "None of the above", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)


        val que11 = Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_unitedkingdom,
            "United Kingdom", "New Zealand",
            "Switzerland", "Australia", 1
        )

        questionsList.add(que11)


        val que12 = Question(
            12, "What character is this",
            R.drawable.ic_flag_of_unitedkingdom,
            "United Kingdom", "New Zealand",
            "Switzerland", "Australia", 1
        )

        questionsList.add(que12)


        val que13 = Question(
            13, "What game is this character from?",
            R.drawable.kirby,
            "Pokemon", "Kirby",
            "Super Smash Bros", "Sonic", (2 or 3)
        )

        questionsList.add(que13)


        val que14 = Question(
            14, "What game is this character from?",
            R.drawable.poro,
            "League of Legends", "Kirby",
            "Pokemon", "Sonic", 1
        )

        questionsList.add(que14)


        val que15 = Question(
            15, "Who is this character?",
            R.drawable.poroking,
            "Sonic", "Kirby",
            "Pikachu", "Poro King", 4
        )

        questionsList.add(que15)


        val que16 = Question(
            16, "Who is this character?",
            R.drawable.pinkbean,
            "Sonic", "Kirby",
            "Pink Pikachu", "Pink Bean", 4
        )

        questionsList.add(que16)


        val que17 = Question(
            17, "Who is this character?",
            R.drawable.fallguys,
            "Eggie", "Varus",
            "Fall Guys", "Maplestory", 3
        )

        questionsList.add(que17)


        val que18 = Question(
            18, "What game is this character from?",
            R.drawable.amongus,
            "League of Legends", "Among Us",
            "Risk of Rain", "Super Smash Bros", 2
        )

        questionsList.add(que18)


        val que19 = Question(
            19, "Where is this icon from?",
            R.drawable.disney,
            "Pokemon", "Disney",
            "Starcraft", "Nickelodeon", 2
        )

        questionsList.add(que19)


        val que20 = Question(
            20, "Where is this icon from?",
            R.drawable.mikey,
            "Mulan", "Mickey Mouse",
            "Disney", "Super Smash Bros", 2 or 3
        )

        questionsList.add(que20)



        // END of Questions
        Collections.shuffle(questionsList)

        return questionsList

    }


    // END

}