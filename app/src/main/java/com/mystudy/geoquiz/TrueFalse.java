package com.mystudy.geoquiz;

/**
 * Created by Administrator on 2015-11-07.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public void setQuestion(int mQuestion) {

        this.mQuestion = mQuestion;
    }
}
