package com.example.quizapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

private var progressBar: ProgressBar? = null
private var tvProgress: TextView? = null

private var tvOptionOne: TextView ?= null
private var tvOptionTwo: TextView? = null
private var tvOptionThree: TextView? = null
private var tvOptionFour: TextView? = null

private var tvQuestion: TextView? = null
private var ivImage: ImageView? = null

private var mCurrentPosition: Int = 1
private var mQuestionList: ArrayList<Question>? = null


private var buttonSubmit: Button? = null

private var mSelectedOptionPosition: Int = 0


class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)

        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)


        buttonSubmit = findViewById<Button>(R.id.btn_submit)

//        val questionList = Constants.getQuestions()

        mQuestionList = Constants.getQuestions()

        setQuestion()

        buttonSubmit?.setOnClickListener(this)
    }

    private fun answerView(answer: Int, drawable: Int) {
        when(answer) {
            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawable
                )
            }


            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawable
                )
            }

            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawable
                )
            }

            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this@QuizQuestionsActivity,
                    drawable
                )
            }
        }
    }




    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_option_one -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }

            R.id.tv_option_two -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }

            R.id.tv_option_three -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }


            R.id.tv_option_four -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }
            }


            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++



                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(
                                this@QuizQuestionsActivity,
                                "You have successfully completed the quiz",
                                Toast.LENGTH_LONG
                            ).show()
                        }

                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }

                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionList!!.size) {
                        buttonSubmit?.text = "FINISH"
                    } else {
                        buttonSubmit?.text = "Go to Next"
                    }

                    mSelectedOptionPosition = 0

                }

            }
        }
    }
    private fun setQuestion() {
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition" + "/" + progressBar?.getMax()

        tvQuestion?.text = question!!.question
        ivImage?.setImageResource(question.image)

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }


    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()

        tvOptionOne?.let {
            options.add(0, it)
        }

        tvOptionTwo?.let {
            options.add(1, it)
        }

        tvOptionThree?.let {
            options.add(2, it)
        }

        tvOptionFour?.let {
            options.add(3, it)
        }
    }


    private fun selectedOptionView(tv: TextView, selectedOptionNum:Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.BLUE)

    }
}